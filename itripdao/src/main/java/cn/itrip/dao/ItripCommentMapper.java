package cn.itrip.dao;


import cn.itrip.beans.ItripComment;

public interface ItripCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItripComment record);

    ItripComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItripComment record);

}