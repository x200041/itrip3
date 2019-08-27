package cn.itrip.dao;


import cn.itrip.beans.ItripUserLinkUser;

public interface ItripUserLinkUserMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(ItripUserLinkUser record);


    int insertSelective(ItripUserLinkUser record);


    ItripUserLinkUser selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(ItripUserLinkUser record);


    int updateByPrimaryKey(ItripUserLinkUser record);
}