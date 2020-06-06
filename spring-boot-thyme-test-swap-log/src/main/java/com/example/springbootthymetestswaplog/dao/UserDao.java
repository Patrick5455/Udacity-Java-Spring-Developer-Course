package com.example.springbootthymetestswaplog.dao;

import com.example.springbootthymetestswaplog.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    User john = new User(1,"Chinedu John", 30);


    public Integer getAge(){

        return john.getAge();
    }
}
