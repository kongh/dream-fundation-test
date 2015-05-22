package com.coder.dream.dao.support.user;

import com.coder.dream.base.dao.BaseDao;
import com.coder.dream.base.dao.query.support.DefaultDynamicQuery;
import com.coder.dream.base.web.vo.FilterMap;
import com.coder.dream.dao.mapper.user.AMapper;
import com.coder.dream.dao.mapper.user.UserMapper;
import com.coder.dream.dao.model.user.Lock;
import com.coder.dream.dao.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<User,UserMapper> {

    @Autowired
    private AMapper aMapper;

    public void test(){
        System.out.println(aMapper);
    }

    /**
     * ≤È’“
     *
     * @param id
     * @return
     */
    public Lock findOneWithLock(Integer id){
        FilterMap filterMap = new FilterMap();
        filterMap.eq("id",1);
        DefaultDynamicQuery query = new DefaultDynamicQuery(filterMap);
        return mapper.findOneWithLock(query);
    }

}
