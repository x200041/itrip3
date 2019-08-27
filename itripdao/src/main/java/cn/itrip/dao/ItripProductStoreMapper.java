package cn.itrip.dao;


import cn.itrip.beans.ItripProductStore;

public interface ItripProductStoreMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(ItripProductStore record);


    int insertSelective(ItripProductStore record);


    ItripProductStore selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(ItripProductStore record);


    int updateByPrimaryKey(ItripProductStore record);
}