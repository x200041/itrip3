package cn.itrip.dao;


import cn.itrip.beans.ItripHotel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ItripHotelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItripHotel record);

    int insertSelective(ItripHotel record);

    ItripHotel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItripHotel record);

    int updateByPrimaryKeyWithBLOBs(ItripHotel record);

    int updateByPrimaryKey(ItripHotel record);
}