package com.coder.dream.dao.mapper.user;

import com.coder.dream.base.dao.mapper.BaseMapper;
import com.coder.dream.base.dao.query.Query;
import com.coder.dream.base.dao.query.support.DefaultDynamicQuery;
import com.coder.dream.base.web.vo.FilterMap;
import com.coder.dream.dao.model.user.Lock;
import com.coder.dream.dao.model.user.User;


public interface UserMapper extends BaseMapper<User>{

    public Lock findOneWithLock(Query query);
}
