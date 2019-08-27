package cn.itrip.dao;

import cn.itrip.beans.ItripHotelRoom;

public interface ItripHotelRoomMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(ItripHotelRoom record);


    int insertSelective(ItripHotelRoom record);


    ItripHotelRoom selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(ItripHotelRoom record);


    int updateByPrimaryKey(ItripHotelRoom record);
}