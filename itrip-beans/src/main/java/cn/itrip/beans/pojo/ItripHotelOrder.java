package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.sql.Date;

/**
 * 酒店规则表
 */
public class ItripHotelOrder implements Serializable {
    private static final long serialVersionUID = -5890687705031087051L;
    private Integer id;
    private Integer userId;                     //用户id
    private int orderType;                     //订单类型(0:旅游产品 1:酒店产品 2：机票产品)
    private String orderNo;                     //订单号
    private String tradeNo;                     //交易编号
    private Integer hotelId;                    //冗余字段 酒店id
    private String hotelName;                   //冗余字段 酒店名称
    private Integer roomId;                      //房间id
    private int count;                          //消耗数量
    private int bookingDays;                    //预订天数
    private Date checkInDate;                   //入住时间
    private Date checkOutDate;                  //退房时间
    private int orderStatus;                    //订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
    private double payAmount;                   //支付金额
    private int payType;                         //支付方式:1:支付宝 2:微信 3:到店付
    private String noticePhonel;                //联系手机号
    private String noticeEmail;                 //联系邮箱
    private String specialRequirement;          //特殊需求
    private int isNeedInvoice;                  //是否需要发票（0：不需要 1：需要）
    private int invoiceType;                    //发票类型（0：个人 1：公司）
    private String invoiceHead;                 //发票抬头
    private String linkUserName;                //入住人名称
    private int bookType;                       //0:WEB端(pc) 1:手机端 2:其他客户端
    private Date creationDate;                  //预定时间
    private Integer createdBy;
    private Date modifyDate;                    //支付完成时间
    private Integer modifiedBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getBookingDays() {
        return bookingDays;
    }

    public void setBookingDays(int bookingDays) {
        this.bookingDays = bookingDays;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public String getNoticePhonel() {
        return noticePhonel;
    }

    public void setNoticePhonel(String noticePhonel) {
        this.noticePhonel = noticePhonel;
    }

    public String getNoticeEmail() {
        return noticeEmail;
    }

    public void setNoticeEmail(String noticeEmail) {
        this.noticeEmail = noticeEmail;
    }

    public String getSpecialRequirement() {
        return specialRequirement;
    }

    public void setSpecialRequirement(String specialRequirement) {
        this.specialRequirement = specialRequirement;
    }

    public int getIsNeedInvoice() {
        return isNeedInvoice;
    }

    public void setIsNeedInvoice(int isNeedInvoice) {
        this.isNeedInvoice = isNeedInvoice;
    }

    public int getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(int invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceHead() {
        return invoiceHead;
    }

    public void setInvoiceHead(String invoiceHead) {
        this.invoiceHead = invoiceHead;
    }

    public String getLinkUserName() {
        return linkUserName;
    }

    public void setLinkUserName(String linkUserName) {
        this.linkUserName = linkUserName;
    }

    public int getBookType() {
        return bookType;
    }

    public void setBookType(int bookType) {
        this.bookType = bookType;
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
