package cn.itrip.auth.service.impl;

import cn.itrip.auth.service.ActiveEmail;
import cn.itrip.auth.service.UserService;
import cn.itrip.beans.pojo.ItripUser;
import cn.itrip.common.MD5;
import cn.itrip.common.RedisAPI;
import cn.itrip.dao.auth.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private ActiveEmail activeEmail;
    @Resource
    RedisAPI redisAPI;
    @Resource
    UserMapper userMapper;
    /**
     * 用户登录
     *
     * @param userCode
     * @param password
     * @return
     */
    public ItripUser getItripUser(String userCode, String password) {
        try {
            ItripUser user = userMapper.getItripUser(userCode);
            return user.getUserPassword().equals(MD5.getMd5(password,32))?user:null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 用户注册
     *
     * @param user 注册的用户
     * @return
     */
    @Override
    public int addUser(ItripUser user) {
        try {
            return userMapper.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }



    public void saveEmailActive(String userCode,String activeCode){
        redisAPI.set(userCode,24*60*60,activeCode);
    }

    @Override
    public void createUser(ItripUser user) throws Exception {
        String activeCode = MD5.getMd5(new Date().toString(),32);
        activeEmail.sendEmail("",user.getUserCode(),activeCode); //发送邮件
        saveEmailActive(user.getUserCode(),activeCode);         //保存激活码
    }

    @Override
    public void active(String email, String code) {

    }

}
