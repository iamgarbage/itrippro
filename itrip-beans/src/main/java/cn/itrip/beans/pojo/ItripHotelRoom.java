package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.sql.Date;

/**
 * 酒店房间
 */
public class ItripHotelRoom implements Serializable {
    private static final long serialVersionUID = 3907040625164866335L;
    private Integer id;
    private Integer hotelId;            //酒店ID
    private String roomTitle;           //房间名称
    private double roomPrice;           //房间价格
    private Integer roomBedTypeId;      //酒店床型
    private int isHavingBreakfast;      //是否包含早餐
    private int payType;                //1:在线付 2:到店付 3:不限
    private double satisfaction;        //满意度（冗余字段，在用户评论后更新）
    private int isBook;                 //是否可预订(0:不可以 1:可以)
    private int isCancel;               //是否可取消(0:不可 1:可以)
    private int isTimelyResponse;       //是否及时响应(0:不及时 1:及时)
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

    public String getRoomTitle() {
        return roomTitle;
    }

    public void setRoomTitle(String roomTitle) {
        this.roomTitle = roomTitle;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public Integer getRoomBedTypeId() {
        return roomBedTypeId;
    }

    public void setRoomBedTypeId(Integer roomBedTypeId) {
        this.roomBedTypeId = roomBedTypeId;
    }

    public int getIsHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setIsHavingBreakfast(int isHavingBreakfast) {
        this.isHavingBreakfast = isHavingBreakfast;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public double getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(double satisfaction) {
        this.satisfaction = satisfaction;
    }

    public int getIsBook() {
        return isBook;
    }

    public void setIsBook(int isBook) {
        this.isBook = isBook;
    }

    public int getIsCancel() {
        return isCancel;
    }

    public void setIsCancel(int isCancel) {
        this.isCancel = isCancel;
    }

    public int getIsTimelyResponse() {
        return isTimelyResponse;
    }

    public void setIsTimelyResponse(int isTimelyResponse) {
        this.isTimelyResponse = isTimelyResponse;
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
