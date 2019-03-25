package cn.itrip.auth.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.internet.*;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;

@Service("activeEmail")
public class ActiveEmail {

    @Resource
    private SimpleMailMessage mailMessage;
    @Resource
    private JavaMailSender javaMailSender;
    /**
     * 发送邮件
     * @param sendEmail 发送方
     * @param receiveEmail  接收方
     * @param activeCode 激活码
     */
    public void sendEmail(String sendEmail,String receiveEmail,String activeCode){
        mailMessage.setTo(receiveEmail);
        mailMessage.setText("验证码:"+activeCode+"   此验证码24小时内有效");
        javaMailSender.send(mailMessage);
        System.out.println("发送....");
       /* Properties props = new Properties();
        props.put("username", sendEmail);
        props.put("password", "hfx123456");                    //------此处是你的邮箱对应的授权码,具体参考163邮箱开启用户激活码操作
        props.put("mail.transport.protocol", "smtp" );    //transport
        props.put("mail.smtp.host", "smtp.163.com");        //host
        props.put("mail.smtp.port", "25" );                 //port
        Session mailSession =Session.getDefaultInstance(props);
        //显示在用户邮箱内的文字内容
        Message msg = new MimeMessage(mailSession);
        try {
           *//* msg.setFrom(new InternetAddress(sendEmail));
            msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(receiveEmail));
            msg.setContent("<h1>此邮件为官方激活邮件</h1>","text/html;charset=UTF-8");
            msg.setSubject("请激活您的账号");
            msg.setSentDate(new Date());
            msg.setContent("亲爱的用户xxx您好:<br/>&nbsp;&nbsp;&nbsp;&nbsp;"
                + "请点击以下链接激活您的账号："
                + "<a href=\"http://localhost:8888/auth/active?"
                + "m="+sendEmail+"&c="+activeCode+"\">点击激活</a>该链接24小时内有效"
                    ,
                    "text/html;charset=utf-8");
            msg.saveChanges();*//*

            //发送邮件
            Transport transport = mailSession.getTransport("smtp");
            transport.connect("smtp.163.com", "imgarbage@163.com", "hfx123456");
            transport.sendMessage(msg, msg.getAllRecipients());*/
            //关闭transport
       /*     transport.close();
        } catch (MessagingException e) {
            e.printStackTrace();
        }*/
    }
}
