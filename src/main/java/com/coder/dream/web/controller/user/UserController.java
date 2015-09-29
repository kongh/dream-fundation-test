package com.coder.dream.web.controller.user;

import com.coder.dream.base.web.vo.ResultMap;
import com.coder.dream.dao.model.user.User;
import com.coder.dream.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     *
     * @return
     */
    @RequestMapping(value = "/list")
    public ResultMap list(){
        return userService.list();
    }

    @RequestMapping(value = "/create")
    public ResultMap create(){
        User user = new User();
        user.setName("konghang22222222");

        User saved = userService.create(user);

        User out = userService.findOne(saved.getId());

        ResultMap resultMap = new ResultMap();
        resultMap.success(out);

        return resultMap;
    }
}
