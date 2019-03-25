package cn.itrip.dao.hotelorder;

import cn.itrip.beans.pojo.ItripHotelOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ItripHotelOrderMapper {

    List<ItripHotelOrder> getItripHotelOrderListByMap(@Param("map") Map<String,Object> map);

    /*Integer updateItripHotelOrder(ItripHotelOrder order);*/
}
