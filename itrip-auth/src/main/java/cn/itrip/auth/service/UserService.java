package cn.itrip.auth.service;

import cn.itrip.beans.pojo.ItripUser;

import java.util.List;

public interface UserService {
    /**
     * 用户登录
     * @param userCode
     * @param password
     * @return
     */
    ItripUser getItripUser(String userCode,String password) ;
    /**
     * 用户注册
     * @param user  注册的用户
     * @return*/
    int addUser(ItripUser user);

    /**
     * 保存激活码
     * @param userCode
     * @param activeCode
     * @throws Exception
     */
    public void saveEmailActive(String userCode,String activeCode) throws Exception;

    public void createUser(ItripUser user) throws Exception;

    public void active(String email,String code);

}
