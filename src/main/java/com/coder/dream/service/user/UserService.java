package com.coder.dream.service.user;

import com.coder.dream.base.web.vo.FilterMap;
import com.coder.dream.base.web.vo.OrderMap;
import com.coder.dream.base.web.vo.ResultMap;
import com.coder.dream.data.dao.model.user.User;
import com.coder.dream.data.dao.support.user.UserDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserService{

    @Autowired
    private UserDao userDao;

    private static Logger logger = Logger.getLogger(UserService.class);
    /**
     * 所有用户
     * @return
     */
    public ResultMap list(){
        FilterMap filterMap = new FilterMap();
        OrderMap orderMap = new OrderMap();
        List<User> list = userDao.list(filterMap, orderMap,true);
        ResultMap resultMap = new ResultMap();
        resultMap.success(list);
        logger.error("Finished");
        return resultMap;
    }

    public User create(User user){
        return userDao.create(user);
    }

    public User findOne(Integer id){
        return userDao.findOne(id);
    }
}
