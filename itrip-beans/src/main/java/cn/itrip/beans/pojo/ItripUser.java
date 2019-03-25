package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.sql.Date;

/**
 * 登录账户表
 */
public class ItripUser implements Serializable {
    public ItripUser(){}
    private static final long serialVersionUID = 6746984936822410604L;
    private Integer id;
    private String userCode;        //若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
    private String userPassword;    //若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
    private int userType;           //用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
    private Integer flatID;         //平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
    private String userName;        //用户昵称
    private String weChat;          //微信账号
    private String QQ;              //qq账号
    private String weibo;           //微博账号
    private String baidu;           //百度账号
    private int activated;          ////是否激活,(0 false，1 true,默认是0)
    private Date creationDate;
    private Integer createdBy;
    private Date modifyDate;
    private Integer modifiedBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public Integer getFlatID() {
        return flatID;
    }

    public void setFlatID(Integer flatID) {
        this.flatID = flatID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    public String getBaidu() {
        return baidu;
    }

    public void setBaidu(String baidu) {
        this.baidu = baidu;
    }

    public int getActivated() {
        return activated;
    }

    public void setActivated(int activated) {
        this.activated = activated;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
