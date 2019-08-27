package cn.itrip.dao;

import cn.itrip.beans.ItripHotelExtendProperty;

public interface ItripHotelExtendPropertyMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(ItripHotelExtendProperty record);


    int insertSelective(ItripHotelExtendProperty record);


    ItripHotelExtendProperty selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(ItripHotelExtendProperty record);

}