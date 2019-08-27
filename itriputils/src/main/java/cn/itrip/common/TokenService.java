package cn.itrip.common;

import cn.itrip.beans.ItripUser;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import nl.bitwalker.useragentutils.UserAgent;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

@Service("tokenService")
public class TokenService{

    @Resource
    private RedisUtil redisUtil;

    //生成token(格式为token:设备-加密的用户名-时间-六位随机数)
    public String generateToken(String userAgentStr, String username) {
        StringBuilder token = new StringBuilder("tokenXX:");
        //设备
        UserAgent userAgent = UserAgent.parseUserAgentString(userAgentStr);
        if (userAgent.getOperatingSystem().isMobileDevice()) { //判断是手机端还是PC端
            token.append("MOBILE-");
        } else {
            token.append("PC-");
        }
        //加密的用户名
        token.append(DigestUtils.md5Hex(username) + "-"); //MD5加密  加密了用户名
        //时间
        token.append(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()) + "-"); //时间戳
        token.append(DigestUtils.md5Hex(userAgentStr) + "-"); //用户名agent加密
        //六位随机字符串
        token.append(new Random().nextInt(999999 - 111111 + 1) + 111111 );
        System.out.println("token-->" + token.toString());
        return token.toString();
    }

    //把token存到redis中
    public void save(String token, ItripUser user) {
        if (token.startsWith("tokenXX:PC")) {
            redisUtil.setex(token, JSONObject.toJSONString(user), 2*60*60); //有失效时间的redis  PC端
        } else {
            redisUtil.set(token, JSONObject.toJSONString(user)); //没有失效时间的redis   手机端
        }
    }

    public String get(String token){
        return redisUtil.get(token);

    }


    /**
     * 验证token是否存在
     * @param userAgent
     * @param token
     * @return
     */
    public boolean validate(String userAgent,String token){
        if(!redisUtil.exists(token)){
            System.out.println("token不存在");
            return  false;
        }
        String agent = token.split("-")[3];
        System.out.println(agent);
        System.out.println(DigestUtils.md5Hex(userAgent));
        if (!DigestUtils.md5Hex(userAgent).equals(agent)){
            System.out.println("用户名加密不对");
            return false;
        }
        return  true;
    }

    /**
     * 删除
     * @param token
     */
    public void delete(String token){
        redisUtil.del(token);
    }

    private long protectedTime = 30*60*1000; //受保护的时间
    private int delay = 2*60;  //延迟失效时间

    /**
     * 重新获取token
     * @param userAgent
     * @param token
     * @return
     * @throws Exception
     */
    public String reloadToken(String userAgent,String token) throws Exception{
        //1、验证token是否有效
        if(!redisUtil.exists(token)){
            throw new Exception("token无效");  //结束方法
        }
        //2、能不能置换
        //获取token的创建时间
        Date genTime = new SimpleDateFormat("yyyyMMddHHmmssSSS").parse(token.split("-")[2]);
        // token创建了多久了
        long passed = Calendar.getInstance().getTimeInMillis()-genTime.getTime();
        System.out.println(passed+"----"+genTime.getTime());
        if (passed<protectedTime){
            throw new Exception("token在保护时间内，不能置换，剩余"+(protectedTime-passed)/1000);
        }

        //3、进行置换
        String user = redisUtil.get(token);  //根据key获取值
        ItripUser usr = JSON.parseObject(user, (Type) ItripUser.class); //把用户字符串转换成实体类
        String newToken = this.generateToken(userAgent,usr.getUserName());
        redisUtil.setex(token,user,delay);  //老token   自定义过期时间  2分钟
        this.save(newToken,usr); //新token  过期时间默认2个小时
        return newToken;
    }
}

