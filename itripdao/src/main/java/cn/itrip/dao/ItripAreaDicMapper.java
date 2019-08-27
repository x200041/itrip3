package cn.itrip.dao;
import cn.itrip.beans.ItripAreaDic;
public interface ItripAreaDicMapper {

    ItripAreaDic selectByPrimaryKey(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ItripAreaDic record);

    int updateByPrimaryKeySelective(ItripAreaDic record);
}