package com.example.springbootthymeleaf.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class User {

    public Integer id;
    public String name;
    public Integer age;

    public User (Integer id, String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
