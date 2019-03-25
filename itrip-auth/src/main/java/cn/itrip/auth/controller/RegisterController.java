package cn.itrip.auth.controller;

import cn.itrip.auth.service.ActiveEmail;
import cn.itrip.common.MD5;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;

@Controller
@RequestMapping(value = "/reginter")
public class RegisterController {

    @Resource
    private ActiveEmail activeEmail;

    @RequestMapping(value = "/send/Email")
    @ResponseBody
    public String emailReginter(String email){
        //生成激活码
        String activeCode = MD5.getMd5(new Date().toString(),32);
        try {
            activeEmail.sendEmail("",email,activeCode);

        } catch (Exception e) {
            e.printStackTrace();
            return "{\"result\":\"fail\"}";
        }
        return "{\"result\":\"success\"}";
    }
    @RequestMapping(value = "")
    @ResponseBody
    public String active(){

        return "";
    }
}
