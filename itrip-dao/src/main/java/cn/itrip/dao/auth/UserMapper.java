package cn.itrip.dao.auth;

import cn.itrip.beans.pojo.ItripUser;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 验证用户登录
     * @param userCode  用户名
     * @return
     */
    ItripUser getItripUser(String userCode) throws Exception;

    /**
     * 用户注册
     * @param user  注册的用户
     * @return*/
    int addUser(@Param("user") ItripUser user)throws Exception;
}
