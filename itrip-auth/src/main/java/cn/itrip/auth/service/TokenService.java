package cn.itrip.auth.service;

import cn.itrip.beans.pojo.ItripUser;

public interface TokenService {
    /**
     * 生成Token
     * @param userAgent
     * @param user
     * @return
     */
    String generateToKen(String userAgent, ItripUser user) throws Exception;

    /**
     * 保存token
     * @param toKen
     * @param user
     */
    void save(String toKen,ItripUser user);

    /**
     * 比较 token
     * @return
     */
    ItripUser tokenIsEqual(String token);
}
