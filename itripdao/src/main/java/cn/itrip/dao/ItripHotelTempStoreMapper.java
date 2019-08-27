package cn.itrip.dao;


import cn.itrip.beans.ItripHotelTempStore;

public interface ItripHotelTempStoreMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(ItripHotelTempStore record);


    int insertSelective(ItripHotelTempStore record);


    ItripHotelTempStore selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(ItripHotelTempStore record);


    int updateByPrimaryKey(ItripHotelTempStore record);
}