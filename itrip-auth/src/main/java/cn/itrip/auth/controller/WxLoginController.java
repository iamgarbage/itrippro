package cn.itrip.auth.controller;

import cn.itrip.beans.dto.Dto;
import cn.itrip.common.DtoUtil;
import cn.itrip.common.HttpRequestUtils;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/wx/login")
public class WxLoginController {

    @RequestMapping("wxLgoinCallBack")
    @ResponseBody
    public Dto wxLgoinCallBack(String code,String state){
        System.out.println("===========进入微信登陆  wxLoginCallback");
        //再次发送请求 ,获取access_token,openId
        //  用户确认,构建access_token URL,填入所需参数
        StringBuffer requestURL = new StringBuffer("https://api.weixin.qq.com/sns/oauth2/access_token?")
                .append("appid=wx26e27b54409e8c4c")// 跟第一次请求的一致
                .append("&secret=26f90c61837491d2b96770ecc03e1ad3")// 查看科泰服务器信息_微信开发对应appid的
                .append("&code=").append(code)// 第一次请求后得到的参数
                .append("&grant_type=authorization_code");

        //调用httpclient.jar的get方法,发送请求,该操作需要用HttpRequestUitls进行封装
        JSONObject jsonObject = HttpRequestUtils.httpGet(requestURL.toString());
        //获取accesstoken  opendid
        String accessToken =  jsonObject.getString("access_token");
        String openId = jsonObject.getString("openid");

        System.out.println("accessToken: "+ accessToken+ " \t;openId: "+openId);

        // ItripUser user = userService.getUser(openId);
        //if (user==null){  封装用户信息存入数据库}

        //第三次发送请求获取用户信息  https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID
        StringBuffer userInfoIURL =new StringBuffer("https://api.weixin.qq.com/sns/userinfo?")
                .append("access_token=").append(accessToken)
                .append("&openid=").append(openId);

        JSONObject userObj= HttpRequestUtils.httpGet(userInfoIURL.toString());
        //获取用户昵称,省份,头像等等
        String nickName =userObj.getString("nickname");
        String city = userObj.getString("city");

        //生成登陆token并保存到redis
        return DtoUtil.returnDataSuccess("微信登陆成功  nickName: "+ nickName+ "   ;city: "+city);
    }
}
