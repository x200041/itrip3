package cn.itrip.dao;


import cn.itrip.beans.ItripHotelFeature;

public interface ItripHotelFeatureMapper {


    int deleteByPrimaryKey(Integer id);


    int insert(ItripHotelFeature record);

    int insertSelective(ItripHotelFeature record);


    ItripHotelFeature selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(ItripHotelFeature record);


    int updateByPrimaryKey(ItripHotelFeature record);
}