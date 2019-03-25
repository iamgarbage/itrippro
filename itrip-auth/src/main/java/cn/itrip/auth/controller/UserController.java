package cn.itrip.auth.controller;

import cn.itrip.auth.service.ActiveEmail;
import cn.itrip.auth.service.TokenService;
import cn.itrip.auth.service.UserService;
import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.pojo.ItripUser;
import cn.itrip.beans.vo.ItripTokenVO;
import cn.itrip.common.*;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;
import java.util.Date;

@Controller
@Api(value = "API",basePath = "http://localhost:8082/auth")
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    UserService userService;

    @Resource
    TokenService tokenService;

    @RequestMapping(value = "/send/Email")
    @ResponseBody
    public String emailReginter(String email,String name,String pwd){
        //生成激活码
        String activeCode = MD5.getMd5(new Date().toString(),32);
        try {
            ItripUser user = new ItripUser();
            user.setUserCode(email);
            user.setUserName(name);
            user.setUserPassword(pwd);
            userService.createUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"result\":\"fail\"}";
        }
        return "{\"result\":\"success\"}";
    }


    @RequestMapping("/goLgoin")
    //swagger 方法描述
    @ApiOperation(value = "爱旅行-用户登录"
            ,httpMethod = "POST"
            ,produces = "HTTP"
            ,protocols = "application/json"
            ,response = Dto.class  //响应数据
            ,notes = "根据用户名密码,进行统一认证")
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "form",required = true,name = "userCode",value = "请输入用户名",defaultValue = "t211@yaoyaoTec.com")
            ,@ApiImplicitParam(paramType = "form",required = true,name="password",value = "请输入密码")
    })
    public Dto goLgoin(HttpServletRequest request, String userCode, String password){
        ItripUser user=null;
        //获取token
        String token = request.getHeader("token");
        //如果token是空则登录 并创建token
        if(EmptyUtils.isEmpty("token:PC-ed6e201becad0e79ae04178e519fd13b-29-java.text.SimpleDateFormat@5069d960-4593")){
            //用户
            user = userService.getItripUser(userCode,password);
            //判断登录是否成功
            if(EmptyUtils.isNotEmpty(user)){
                //用于判断用户是PC端登录还是mobile登录
                String userAgent= request.getHeader("user-agent");
                //获取token 如果不存在则生成token
                try {
                    //生成token
                    String newToke = tokenService.generateToKen(userAgent,user);
                    //保存token到Redis中
                    tokenService.save(newToke,user);
                    //构建一个token对象 构造函数(token,过期时间(系统当前时间+2h),生效时间(系统当前时间))
                    ItripTokenVO itripTokenVO = new ItripTokenVO(token
                            ,Calendar.getInstance().getTimeInMillis()+2*60*60*1000
                            ,Calendar.getInstance().getTimeInMillis());
                    //把用户信息以json的格式return
                    return DtoUtil.returnDataSuccess(itripTokenVO);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else {
                return DtoUtil.returnFail("用户名或密码错误!",ErrorCode.AUTH_AUTHENTICATION_FAILED);
            }
        }else { //存在此token 则去数据库中进行查找
            user= tokenService.tokenIsEqual("token:PC-ed6e201becad0e79ae04178e519fd13b-29-java.text.SimpleDateFormat@5069d960-4593");
            if(EmptyUtils.isNotEmpty(user)) //不为空则进行返回
                return DtoUtil.returnDataSuccess(user);
            return DtoUtil.returnFail("用户已过期请重新登录!",ErrorCode.AUTH_TOKEN_INVALID);
        }
        return DtoUtil.returnFail("未知异常",ErrorCode.AUTH_UNKNOWN);
    }

    @RequestMapping("/wxLgoinCallBack")
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
