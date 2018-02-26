package com.spring.demo.controller;

import com.spring.demo.config.Config;
import com.spring.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(Config.BASE_URL + "getuser")
    User getUserInfo(){
        User user = new User();
        user.setName("夏侯惇");
        user.setAddress("战国");
        user.setId(0L);
        return user;
    }
}
