package cn.itrip.dao;

import cn.itrip.beans.ItripLabelDic;

public interface ItripLabelDicMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(ItripLabelDic record);


    int insertSelective(ItripLabelDic record);


    ItripLabelDic selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(ItripLabelDic record);


    int updateByPrimaryKey(ItripLabelDic record);
}