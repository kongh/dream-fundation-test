package com.coder.dream.service.user;

import com.coder.dream.base.service.BaseService;
import com.coder.dream.base.web.vo.BaseVo;
import com.coder.dream.base.web.vo.FilterMap;
import com.coder.dream.dao.support.user.UserDao;
import com.coder.dream.dao.mapper.user.UserMapper;
import com.coder.dream.dao.model.user.User;
import com.coder.dream.web.vo.user.UserVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserService extends BaseService<User,UserMapper,UserDao>{

    @Override
    protected void toListVo(User user, BaseVo vo) {
        super.toListVo(user, vo);
        UserVo userVo = (UserVo)vo;
        userVo.setName(user.getName());
        userVo.setUpdateTime(user.getUpdateTime());
        dao.test();
    }

    /**
     * 存储
     *
     * @param user
     */
    public void concury(User user){
        //求当前的数量
        FilterMap filterMap = new FilterMap();
        Integer count = dao.count(filterMap);
        if(count >= 2){
            return ;
        }

        dao.create(user);
    }

    /**
     * 存储
     *
     * @param user
     */
    @Transactional
    public void concuryWithLock(User user){
        //加锁
        dao.findOneWithLock(1);
        //求当前的数量
        FilterMap filterMap = new FilterMap();
        Integer count = dao.count(filterMap);
        if(count >= 2){
            return ;
        }

        dao.create(user);
    }
}
