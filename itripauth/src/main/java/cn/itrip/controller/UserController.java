package cn.itrip.controller;

import cn.itrip.beans.ItripUser;
import cn.itrip.biz.ItripUserServiceImpl;
import cn.itrip.biz.MailService;
import cn.itrip.com.ucpaas.restDemo.client.JsonReqClient;
import cn.itrip.common.*;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private ItripUserServiceImpl itripUserServiceImpl;

    @Resource
    private TokenService tokenService;

    @Resource
    private MailService mailService;

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping(value = "/index", method = RequestMethod.POST, produces = "application/json", headers = "header")
    @ResponseBody
    public ItripUser index(HttpServletRequest request) {
        ItripUser itripUser = null;
        ItripUser itripUsers = itripUserServiceImpl.selectById(12);
        System.out.println("================>" + itripUsers.getUserName());
        return itripUser;
    }

    @RequestMapping(value = "/retoken", method = RequestMethod.POST, produces = "application/json", headers = "header")
    @ResponseBody
    public Dto retoken(HttpServletRequest request) {
        Dto dto = new Dto();
        String userAgent = request.getHeader("user-agent");
        String token = request.getHeader("header");
        try {
            String newToken = tokenService.reloadToken(userAgent, token);
            dto.setTokenCreatedDate(System.currentTimeMillis());
            dto.setTokenExpiryDate(System.currentTimeMillis() + 2 * 60 * 60 * 1000);
            dto.setIsLogin("true");
            dto.setToken(newToken);
        } catch (Exception e) {
            e.printStackTrace();
            dto.setIsLogin(e.getMessage());
        }
        return dto;
    }

    @RequestMapping(value = "/validate", method = RequestMethod.POST, produces = "application/json", headers = "header")
    @ResponseBody
    public Dto validate(HttpServletRequest request) {
        Dto dto = new Dto();
        String userAgent = request.getHeader("user-agent");
        String token = request.getHeader("header");
        if (tokenService.validate(userAgent, token)) {
            // String user = tokenService.get(token);
            try {  //1566264823960   1566268389722
                System.out.println(token);
                Date genTime = new SimpleDateFormat("yyyyMMddHHmmssSSS").parse(token.split("-")[2]);
                dto.setTokenCreatedDate(genTime.getTime());
                dto.setTokenExpiryDate(genTime.getTime() + 2 * 60 * 60);
                dto.setIsLogin("true");
                dto.setToken(token);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return dto;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET, produces = "application/json", headers = "header")
    @ResponseBody
    public Dto login(Model model, String userCode, String userPassword, HttpServletRequest request) throws Exception {
        System.out.println(userCode + userPassword);
        ItripUser usr = itripUserServiceImpl.selectByuserCode(userCode, MD5.getMd5(userPassword, 32));
        Dto dto = new Dto();
        // User user = this.userService.login(username, password);
        if (usr != null) {
            String userAgent = request.getHeader("user-agent");
            String token = this.tokenService.generateToken(userAgent, usr.getUserName()); //生成token
            this.tokenService.save(token, usr); //保存到redis里面

            dto.setIsLogin("true");
            dto.setToken(token);
            dto.setTokenCreatedDate(System.currentTimeMillis()); //当前系统时间  获取的1970年1月1日到现在这一秒的毫秒数
            dto.setTokenExpiryDate(System.currentTimeMillis() + 2 * 60 * 60 * 1000); //获取2个小时的毫秒数
        } else {
            dto.setIsLogin("false");
        }
        //登录成功
        return dto;

    }

    /**
     * 验证码
     */
    @RequestMapping("/authCode")
    public void authCode() throws Exception {
        String sid = "caeb3fc06d59be93a96e352af724863a";//用户的账号唯一标识“Account Sid”
        String token = "f0dde340fb99dd1b949820f880c421ed";//用户密钥“Auth Token”
        String appid = "71229dff0b1340e487b42ccfea724947";//创建应用时系统分配的唯一标示
        String templateid = "494181";//可在后台短信产品→选择接入的应用→短信模板-模板ID，查看该模板ID
        String param = generateWord();//模板中的替换参数（验证码）
        String mobile = "18142697399";//接收的单个手机号，暂仅支持国内号码
        String uid = "";//用户透传ID，随状态报告返回
        try {
            String result = new JsonReqClient().sendSms(sid, token, appid, templateid, param, mobile, uid);
            redisUtil.setex("mobile", param, 2 * 60);
            System.out.println(param);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/validationPhone", method = RequestMethod.GET, produces = "application/json", headers = "header")
    @ResponseBody
    public void validationPhone(String param) {
        String value = redisUtil.get("mobile");
        if (value.equals(param)) {
            System.out.println("验证通过");
        }
    }

    /**
     * 产生随机的6位数字字符串
     */
    private static String generateWord() {
        int length = 6;
        String[] beforeShuffle = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        List list = Arrays.asList(beforeShuffle);
        Collections.shuffle(list);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        String afterShuffle = sb.toString();
        return afterShuffle.substring(2, 2 + length);
    }


    @RequestMapping(value = "/addMail", method = RequestMethod.GET, produces = "application/json", headers = "header")
    @ResponseBody
    public Integer addMail(ItripUser itripUser) {
        ItripUser userCodeexist = itripUserServiceImpl.userCodeexist(itripUser.getUserCode());
        int result = 0;
        //判断是否存在
        if (userCodeexist == null) {
            //判断是否为null
            String pwd = MD5.getMd5(itripUser.getUserPassword(), 32);
            itripUser.setUserPassword(pwd);
            result = itripUserServiceImpl.insertSelective(itripUser);
            if (result > 0) {
                Mail(itripUser.getUserCode(), itripUser.getUserName(), generateWord());
            }
        } else {
            System.out.println("已存在该邮箱");
        }
        return result;
    }


    public void Mail(String userCode, String userName, String param) {
        String to = userCode;
        String subject = "爱旅行邮箱注册码";
        String content = "亲爱的" + userName + "先生/女士,你本次验证码是" + param;
        try {
            mailService.sendSimpleMail(to, subject, content);
            redisUtil.setex("validationMail" + userCode, param, 2 * 60);
            System.out.println(param);
            System.out.println("成功了");
        } catch (MailException e) {
            System.out.println("失败了");
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/validationMail", method = RequestMethod.GET, produces = "application/json", headers = "header")
    @ResponseBody
    public void validationMail(String userCode, String param) {
        System.out.println(userCode + param);
        int result = 0;
        ItripUser userCodeexist = itripUserServiceImpl.userCodeexist(userCode);
        if (EmptyUtils.isEmpty(userCodeexist)) {
            System.out.println("未能找到用户");
        } else {
            if (userCodeexist.getActivated() == 1) {
                System.out.println("该用户已激活");
            } else {
                String value = redisUtil.get("validationMail" + userCode);
                if (value.equals(param)) {
                    System.out.println("验证通过");
                    userCodeexist.setActivated(1);
                    result = itripUserServiceImpl.updateByitripUser(userCodeexist);
                    if (result > 0) {
                        System.out.println("激活成功");
                    }
                }
            }
        }
    }

}
