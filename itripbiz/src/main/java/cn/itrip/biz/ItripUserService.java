package cn.itrip.biz;

import cn.itrip.beans.ItripUser;

public interface ItripUserService {

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
    ItripUser selectByuserCode(String userCode, String userPassword);

    /**
     * 验证邮箱是否已存在或手机
     *
     * @param userCode
     * @return
     */
    ItripUser userCodeexist(String userCode);

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
