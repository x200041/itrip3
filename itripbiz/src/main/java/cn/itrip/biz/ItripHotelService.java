package cn.itrip.biz;

import cn.itrip.beans.ItripHotel;

public interface ItripHotelService {

    /**
     * 删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增
     *
     * @param hotel
     * @return
     */
    int insertSelective(ItripHotel hotel);

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    ItripHotel selectByPrimaryKey(Integer id);

    /**
     * 更新
     *
     * @param hotel
     * @return
     */
    int updateByPrimaryKeySelective(ItripHotel hotel);
}
