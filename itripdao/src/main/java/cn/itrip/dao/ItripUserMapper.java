package cn.itrip.dao;


import cn.itrip.beans.ItripUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ItripUserMapper {

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    ItripUser selectById(Integer id);

    /**
     * 根据邮箱或手机号登录
     *
     * @param userCode
     * @return
     */
    ItripUser selectByuserCode(@Param("userCode") String userCode);

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
     * @param itripUser
     * @return
     */
    int insertSelective(ItripUser itripUser);


    /**
     * 更新
     *
     * @param itripUser
     * @return
     */
    int updateByitripUser(ItripUser itripUser);


}