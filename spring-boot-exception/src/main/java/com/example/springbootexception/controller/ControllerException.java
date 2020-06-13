package com.example.springbootexception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerException {

    // 1. Using custom error page
// using custom error page to handle this endpoint exception
    @RequestMapping("/add")
    public String handleMathErrorException (){
        int num = 10/0;
       return "add";
    }

    @RequestMapping("/update")
    public String handleArithmeticError(){

        String xul = null;
        System.out.println(xul);

        return "update";
    }



    // 2. Using @ExceptionHandler() to handle all error pages


    // This would now handle all ArithmeticError exception in this controller class
    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView handleException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("Error", e.toString());
        mv.setViewName("mathError");
        return mv;
    }




}
