package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.sql.Date;

/**
 *评论表
 */
public class Itripcomment implements Serializable {
    private static final long serialVersionUID = -541057594056645718L;
    private Integer id;
    private Integer hotelId;        //如果产品是酒店的话 该字段保存酒店id
    private Integer productId;      //商品id
    private Integer orderId;        //订单id
    private int productType;        //商品类型(0:旅游产品 1:酒店产品 2:机票产品)
    private String content;         //评论内容
    private Integer userId;         //用户编号
    private int isHavingImg;        //是否包含图片(当用户上传评论时检测)0:无图片 1:有图片
    private int positionScore;      //位置评分
    private int facilitiesScore;    //设施评分
    private int serviceScore;       //设施评分
    private int hygieneScore;       //卫生评分
    private int score;              //综合评分
    private Integer tripMode;       //出游类型
    private int isOk;               //是否满意（0：有待改善 1：值得推荐）
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

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public int getIsHavingImg() {
        return isHavingImg;
    }

    public void setIsHavingImg(int isHavingImg) {
        this.isHavingImg = isHavingImg;
    }

    public int getPositionScore() {
        return positionScore;
    }

    public void setPositionScore(int positionScore) {
        this.positionScore = positionScore;
    }

    public int getFacilitiesScore() {
        return facilitiesScore;
    }

    public void setFacilitiesScore(int facilitiesScore) {
        this.facilitiesScore = facilitiesScore;
    }

    public int getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(int serviceScore) {
        this.serviceScore = serviceScore;
    }

    public int getHygieneScore() {
        return hygieneScore;
    }

    public void setHygieneScore(int hygieneScore) {
        this.hygieneScore = hygieneScore;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Integer getTripMode() {
        return tripMode;
    }

    public void setTripMode(Integer tripMode) {
        this.tripMode = tripMode;
    }

    public int getIsOk() {
        return isOk;
    }

    public void setIsOk(int isOk) {
        this.isOk = isOk;
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
