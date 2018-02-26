package com.spring.demo.controller;

import com.spring.demo.config.Config;
import com.spring.demo.dao.UserDao;
import com.spring.demo.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Repository
    UserDao userDao;
    @PostMapping(Config.BASE_URL + "getuser")
    User getUserInfo(){
        User user = new User();
        user.setName("夏侯惇");
        user.setAddress("战国");
        user.setId(0L);
        userDao.insertUser(user);
        return user;
    }

    List<User> getAllUser(){

    }
}
