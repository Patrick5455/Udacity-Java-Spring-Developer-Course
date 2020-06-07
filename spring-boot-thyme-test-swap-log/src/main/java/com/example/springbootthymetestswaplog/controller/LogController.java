package com.example.springbootthymetestswaplog.controller;

import com.example.springbootthymetestswaplog.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
// NB: Difference between RestController and Controller:
//Controller returns the html page,
// RestController returns an object- restful services - e. json
public class LogController {


    User patrick = new User(1, "Patrick Ojunde", 30);

    @RequestMapping("log")
    public Map<String, User> userDetails (){
        Map<String, User> users = new HashMap<>();
        users.put("user 1",patrick);


        return users;
    }
}
