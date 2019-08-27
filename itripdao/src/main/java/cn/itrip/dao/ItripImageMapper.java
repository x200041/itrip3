package cn.itrip.dao;

import cn.itrip.beans.ItripImage;

public interface ItripImageMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(ItripImage record);


    int insertSelective(ItripImage record);


    ItripImage selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(ItripImage record);


    int updateByPrimaryKey(ItripImage record);
}