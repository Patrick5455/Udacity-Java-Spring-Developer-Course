package com.example.springbootexception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerException {

// using custom error page to handle this endpoint exception
    @RequestMapping("/add")
    public String handleMathErrorException (){
        int num = 10/0;
       return "add";
    }


    @RequestMapping("/add2")
    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView handleException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("Error", e.toString());
        mv.setViewName("mathError");
        return mv;
    }




}
