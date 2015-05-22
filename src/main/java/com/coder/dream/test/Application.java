package com.coder.dream.test;

import com.coder.dream.service.user.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static  void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-*.xml");
        System.out.println();
        UserService userService = context.getBean(UserService.class);
        System.out.println("end");
    }
}
