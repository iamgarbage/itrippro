package cn.itrip.trade.service.impl;

import cn.itrip.beans.pojo.ItripHotelOrder;
import cn.itrip.dao.hotelorder.ItripHotelOrderMapper;
import cn.itrip.trade.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Resource
    private ItripHotelOrderMapper itripHotelOrderMapper;

    @Override
    public ItripHotelOrder loadItripHotelOrder(String orderNo) throws Exception {
        Map<String,Object> param = new HashMap<>();
        param.put("orderNo",orderNo);
        List<ItripHotelOrder>  results = itripHotelOrderMapper.getItripHotelOrderListByMap(param);
        if(results.size()>0)
            return results.get(0);
        return null;
    }

    /**
     * 交易成功则调用
     *
     * @param orderNo 订单编号
     * @param payType 支付类型
     * @param tradeNo 交易编号
     * @throws Exception
     */
    @Override
    public void paySucce(String orderNo, int payType, String tradeNo) throws Exception {
        ItripHotelOrder order = this.loadItripHotelOrder(orderNo);
        order.setOrderStatus(2);    //交易状态
        order.setPayType(payType);
        order.setTradeNo(tradeNo);
        //this.itripHotelOrderMapper.updateItripHotelOrder(order);

        //减库存,让业务提供api

    }

    /**
     * 交易失败则调用
     *
     * @param orderNo 订单编号
     * @param payType 支付类型
     * @param tradeNo 交易编号
     * @throws Exception
     */
    @Override
    public void payFailed(String orderNo, int payType, String tradeNo) throws Exception {
        ItripHotelOrder order = this.loadItripHotelOrder(orderNo);
        order.setOrderStatus(1);        //交易状态
        order.setPayType(payType);
        order.setTradeNo(tradeNo);
       // this.itripHotelOrderMapper.updateItripHotelOrder(order);
    }
}
