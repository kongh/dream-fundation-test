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
     * �洢
     *
     * @param user
     */
    public void concury(User user){
        //��ǰ������
        FilterMap filterMap = new FilterMap();
        Integer count = dao.count(filterMap);
        if(count >= 2){
            return ;
        }

        dao.create(user);
    }

    /**
     * �洢
     *
     * @param user
     */
    @Transactional
    public void concuryWithLock(User user){
        //����
        dao.findOneWithLock(1);
        //��ǰ������
        FilterMap filterMap = new FilterMap();
        Integer count = dao.count(filterMap);
        if(count >= 2){
            return ;
        }

        dao.create(user);
    }
}
