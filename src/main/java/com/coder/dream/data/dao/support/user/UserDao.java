package com.coder.dream.data.dao.support.user;

import com.coder.dream.base.data.cache.IEntityCache;
import com.coder.dream.base.data.dao.BaseCacheDao;
import com.coder.dream.data.dao.mapper.user.UserMapper;
import com.coder.dream.data.dao.model.user.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDao extends BaseCacheDao<User,UserMapper> {

    @Resource(name = "entityCachedManager")
    @Override
    public void setCachedManger(IEntityCache entityCached) {
        this.entityCached = entityCached;
    }

    @Override
    protected int getCacheExpirationTime() {
        return super.getCacheExpirationTime() * 2 * 5;
    }
}
