package com.example.springbootthymetestswaplog.dao;

import com.example.springbootthymetestswaplog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    User john = new User(1,"Chinedu", 30);


    public String getName(){

        return john.getName();
    }
}
