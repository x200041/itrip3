package cn.itrip.dao;

import cn.itrip.beans.ItripHotelOrder;

public interface ItripHotelOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItripHotelOrder record);

    int insertSelective(ItripHotelOrder record);

    ItripHotelOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItripHotelOrder record);


    int updateByPrimaryKeyWithBLOBs(ItripHotelOrder record);

    int updateByPrimaryKey(ItripHotelOrder record);
}
