package com.example.springbootexception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerException {



    @RequestMapping("/add")
    public String handleMathErrorException (){
        int num = 10/0;
       return "add";
    }




}
