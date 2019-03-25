package cn.itrip.trade.service;

import cn.itrip.beans.pojo.ItripHotelOrder;

public interface OrderService {
    /**
     * 加载订单信息
     * @param orderNo
     * @return
     * @throws Exception
     */
    ItripHotelOrder loadItripHotelOrder(String orderNo) throws Exception;

    /**
     * 交易成功则调用
     * @param orderNo 订单编号
     * @param payType 支付类型
     * @param tradeNo 交易编号
     * @throws Exception
     */
    void paySucce(String orderNo,int payType,String tradeNo) throws Exception;

    /**
     *交易失败则调用
     * @param orderNo 订单编号
     * @param payType 支付类型
     * @param tradeNo 交易编号
     * @throws Exception
     */
    void payFailed(String orderNo,int payType,String tradeNo) throws Exception;

}
