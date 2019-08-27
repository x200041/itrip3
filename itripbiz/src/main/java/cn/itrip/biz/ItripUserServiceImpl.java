package cn.itrip.biz;


import cn.itrip.beans.ItripUser;
import cn.itrip.dao.ItripUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripUserServiceImpl implements ItripUserService {

    @Resource
    private ItripUserMapper itripUserMapper;

    @Override
    public ItripUser selectById(Integer id) {
        return itripUserMapper.selectById(id);
    }

    @Override
    public ItripUser selectByuserCode(String userCode, String userPassword) {
        ItripUser user = null;
        user = itripUserMapper.selectByuserCode(userCode);
        if (null != user) {
            if (!user.getUserPassword().equals(userPassword)) {
                user = null;
            }
        }
        return user;
    }

    @Override
    public ItripUser userCodeexist(String userCode) {

        return itripUserMapper.selectByuserCode(userCode);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return itripUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(ItripUser itripUser) {
        return itripUserMapper.insertSelective(itripUser);
    }

    @Override
    public int updateByitripUser(ItripUser itripUser) {
        return itripUserMapper.updateByitripUser(itripUser);
    }
}
