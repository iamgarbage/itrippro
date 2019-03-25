package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.sql.Date;

/**
 * 入住用户信息表
 */
public class ItripUserLinkUser implements Serializable {
    private static final long serialVersionUID = 425848488559070158L;
    private Integer id;
    private String linkUserName; //常用联系人姓名
    private String linkIdCard;  //证件号码
    private String linkPhone;   //常用联系人电话
    private Integer userId;     //用户id
    private int linkIdCardType; //证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)
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

    public String getLinkUserName() {
        return linkUserName;
    }

    public void setLinkUserName(String linkUserName) {
        this.linkUserName = linkUserName;
    }

    public String getLinkIdCard() {
        return linkIdCard;
    }

    public void setLinkIdCard(String linkIdCard) {
        this.linkIdCard = linkIdCard;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public int getLinkIdCardType() {
        return linkIdCardType;
    }

    public void setLinkIdCardType(int linkIdCardType) {
        this.linkIdCardType = linkIdCardType;
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
