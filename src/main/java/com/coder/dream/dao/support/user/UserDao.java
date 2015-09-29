package com.coder.dream.dao.support.user;

import com.coder.dream.base.dao.BaseCacheDao;
import com.coder.dream.base.dao.BaseDao;
import com.coder.dream.dao.mapper.user.UserMapper;
import com.coder.dream.dao.model.user.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseCacheDao<User,UserMapper> {

    @Override
    protected int getCacheExpirationTime() {
        return super.getCacheExpirationTime() * 2 * 5;
    }
}
