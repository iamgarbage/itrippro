package cn.itrip.auth.controller;

import cn.itrip.auth.service.TokenService;
import cn.itrip.auth.service.UserService;
import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.pojo.ItripUser;
import cn.itrip.beans.vo.ItripTokenVO;
import cn.itrip.common.DtoUtil;
import cn.itrip.common.EmptyUtils;
import cn.itrip.common.ErrorCode;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;

@Controller
@Api(value = "API",basePath = "http://localhost:8082/auth")
public class PwdLoginController {
    @Resource
    UserService userService;

    @Resource
    TokenService tokenService;

    @RequestMapping("goLgoin")
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
    public Dto goLgoin(HttpServletRequest request,String userCode,String password){
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
}
