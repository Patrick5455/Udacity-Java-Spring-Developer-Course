package com.example.springbootvalidation.model.controller;

import org.springframework.stereotype.Repository;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Repository
public class User {


    @RequestMapping("add")
    public String toAdd(User user){
        return "add";
    }

    @RequestMapping("addUser")
    public String add(@Valid User user, BindingResult result){

        if(result.hasErrors())
            return "add";
        System.out.println("Save user ="+ user);
        return "success";
    }
}
