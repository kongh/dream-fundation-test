package com.coder.dream.web.controller.user;

import com.coder.dream.base.dao.domain.Page;
import com.coder.dream.base.service.BaseService;
import com.coder.dream.base.web.controller.BaseController;
import com.coder.dream.base.web.vo.FilterMap;
import com.coder.dream.base.web.vo.OrderMap;
import com.coder.dream.base.web.vo.ResultMap;
import com.coder.dream.dao.support.user.UserDao;
import com.coder.dream.dao.mapper.user.UserMapper;
import com.coder.dream.dao.model.user.User;
import com.coder.dream.service.user.UserService;
import com.coder.dream.web.vo.user.UserVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserController extends BaseController<User,UserMapper,UserDao,UserService>{

    @Override
    public List list(@RequestParam Map<String, String> params) {
        FilterMap filterMap = new FilterMap();
        OrderMap orderMap = new OrderMap();
        orderMap.desc("name");
        orderMap.desc("update_time");
        List<UserVo> users = service.list(filterMap,orderMap,UserVo.class);
        return  users;
    }

    @Override
    protected void beforeList(Map<String, String> params, FilterMap filterMap, OrderMap orderMap) {
        filterMap.in("name",new String[]{"123"});
    }

    @RequestMapping(value = "/page")
    public ResultMap page(Integer pageNum ,Integer pageSize){
        ResultMap resultMap = new ResultMap();
        FilterMap filterMap = new FilterMap();
        OrderMap orderMap = new OrderMap();
        orderMap.desc("name");
        orderMap.desc("update_time");

        Page<User> page = service.page(filterMap,orderMap,pageNum,pageSize);
        resultMap.success(page.getContent(), page.getTotalElements());
        return  resultMap;
    }

    @RequestMapping(value = "/test")
    public ResultMap test(){
        final UserService s = service;

        //≤¢∑¢≤‚ ‘
        for (int i = 0; i < 10; i++){
           final User user = new User();
            user.setName(String.valueOf(i));
            user.setComments(String.valueOf(i));
            user.setCreateTime(new Date());
            new Thread(new Runnable() {
                public void run() {
                    s.concury(user);
                }
            }).start();
        }

        return new ResultMap();
    }
}
