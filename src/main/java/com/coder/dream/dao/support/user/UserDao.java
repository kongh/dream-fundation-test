package com.coder.dream.dao.support.user;

import com.coder.dream.base.dao.BaseDao;
import com.coder.dream.dao.mapper.user.UserMapper;
import com.coder.dream.dao.model.user.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<User,UserMapper> {
}
