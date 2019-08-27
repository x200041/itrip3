package cn.itrip.dao;


import cn.itrip.beans.ItripTradeEnds;

public interface ItripTradeEndsMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(ItripTradeEnds record);


    int insertSelective(ItripTradeEnds record);


    ItripTradeEnds selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(ItripTradeEnds record);

    int updateByPrimaryKey(ItripTradeEnds record);
}