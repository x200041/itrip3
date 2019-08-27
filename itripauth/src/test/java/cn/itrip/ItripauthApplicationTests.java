package cn.itrip;

import cn.itrip.biz.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.MailException;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItripauthApplicationTests {

    @Resource
    MailService mailService;


    @Test
    public void testMail() throws Exception {
        String to = "1421705953@qq.com";
        String subject = "奥特曼";
        String content = "打怪兽打怪兽！！！";
        try {
            for (int i = 0; i < 100; i++) {
                mailService.sendSimpleMail(to, subject, content);
                System.out.println("成功了");
            }
        } catch (MailException e) {
            System.out.println("失败了");
            e.printStackTrace();
        }
    }
}
