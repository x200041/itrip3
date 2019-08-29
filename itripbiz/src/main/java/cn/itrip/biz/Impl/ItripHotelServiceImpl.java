package cn.itrip.biz.Impl;

import cn.itrip.beans.ItripHotel;
import cn.itrip.biz.ItripHotelService;
import cn.itrip.dao.ItripHotelMapper;
import cn.itrip.dao.ItripUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripHotelServiceImpl implements ItripHotelService {

    @Resource
    private ItripHotelMapper itripHotelMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return itripHotelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(ItripHotel hotel) {
        return itripHotelMapper.insertSelective(hotel);
    }

    @Override
    public ItripHotel selectByPrimaryKey(Integer id) {
        return itripHotelMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripHotel hotel) {
        return itripHotelMapper.updateByPrimaryKeySelective(hotel);
    }
}
