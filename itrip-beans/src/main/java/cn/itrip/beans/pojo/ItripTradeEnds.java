package cn.itrip.beans.pojo;

import java.io.Serializable;

/**
 *订单交易
 */
public class ItripTradeEnds implements Serializable {
    private static final long serialVersionUID = 6651638399067508346L;
    private Integer id;
    private String orderNo; //订单编号(注意非支付宝交易编号tradeNo)
    private Integer flag;   //标识字段(默认0：未处理；1：处理中)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
