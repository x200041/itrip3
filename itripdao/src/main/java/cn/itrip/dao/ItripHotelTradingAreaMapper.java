package cn.itrip.dao;

import cn.itrip.beans.ItripHotelTradingArea;

public interface ItripHotelTradingAreaMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(ItripHotelTradingArea record);


    int insertSelective(ItripHotelTradingArea record);


    ItripHotelTradingArea selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(ItripHotelTradingArea record);


    int updateByPrimaryKey(ItripHotelTradingArea record);
}