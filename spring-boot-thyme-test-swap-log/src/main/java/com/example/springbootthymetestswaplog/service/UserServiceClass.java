package com.example.springbootthymetestswaplog.service;

import com.example.springbootthymetestswaplog.dao.UserDao;
import com.example.springbootthymetestswaplog.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceClass {


    @Resource
    private UserDao userDao;

    public String getName(){

       return userDao.getName();
    }
}
