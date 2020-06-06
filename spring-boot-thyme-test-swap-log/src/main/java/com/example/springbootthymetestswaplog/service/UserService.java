package com.example.springbootthymetestswaplog.service;

import com.example.springbootthymetestswaplog.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    UserDao userDao;

    @Resource
    public Integer getAge(){

        return userDao.getAge();
    }

}
