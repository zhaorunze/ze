package com.spring.demo.dao;

import com.spring.demo.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class UserDao {

    public static final List<User> useres = new ArrayList<>();
    prviate static AtomicLong atomicLong = new AtomicLong(0);
    public User insertUser(User user){
        user.setId(atomicLong.incrementAndGet());
        useres.add(user);
        return user;
    }

    public List<User> getAllUser(){
        return useres;
    }
}
