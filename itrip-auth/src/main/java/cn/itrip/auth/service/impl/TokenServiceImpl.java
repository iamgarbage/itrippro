package cn.itrip.auth.service.impl;

import cn.itrip.auth.service.TokenService;
import cn.itrip.beans.pojo.ItripUser;
import cn.itrip.common.EmptyUtils;
import cn.itrip.common.MD5;
import cn.itrip.common.RedisAPI;
import com.alibaba.fastjson.JSON;
import eu.bitwalker.useragentutils.UserAgent;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;

@Service("tokenService")
public class TokenServiceImpl implements TokenService {

    @Resource
    RedisAPI redisAPI;
    /**
     * 生成token
     * @param userAgent
     * @param user
     * @return
     */
    public String generateToKen(String userAgent, ItripUser user) {
        StringBuilder sb = new StringBuilder("token:");
        //获取客户端属性 pc还是mobile
        UserAgent agent = UserAgent.parseUserAgentString(userAgent);
        if(agent.getOperatingSystem().isMobileDevice())
            sb.append("MOBILE-");
        else
            sb.append("PC-");
        sb.append(MD5.getMd5(user.getUserCode(),32)+"-");   //加密用户名
        sb.append(user.getId()+"-");        //用户id
        sb.append(new SimpleDateFormat("yyyyMMddHHmmss")+"-");  //创建时间
        sb.append(MD5.getRandomCode());     //随机生成六位数
        return sb.toString();
    }

    /**
     * 保存token
     *
     * @param toKen
     * @param user
     */
    public void save(String toKen, ItripUser user) {
        if(toKen.startsWith("token:PC-"))
            redisAPI.set(toKen,2*60*60,JSON.toJSONString(user));
        else
            redisAPI.set(toKen,JSON.toJSONString(user));
    }

    /**
     * 比较 token
     * @return
     */
    public ItripUser tokenIsEqual(String token) {
        return EmptyUtils.isNotEmpty(redisAPI.get(token))?
               JSON.parseObject(redisAPI.get(token),ItripUser.class):null;
    }
}
