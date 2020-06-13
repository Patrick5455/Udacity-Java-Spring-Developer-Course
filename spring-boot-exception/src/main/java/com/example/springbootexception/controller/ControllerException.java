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

        xul = xul.toLowerCase();

        return "update";
    }



    // 2. Using @ExceptionHandler() to handle all error pages
        //> The limitation of using @ExceptionHandler in one controller class
        //> is that we cannot use it to handle exceptions in other controller class
        //> except we use @Controller Advise with @ExceptionHandler


    // This would now handle all ArithmeticError exception in this controller class
    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView handleException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("Error", e.toString());
        mv.setViewName("mathError");
        return mv;
    }

    // This would handle all nullPointer Exceptions
    @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView handleNullPointers (Exception e){

        ModelAndView mv = new ModelAndView();

        mv.addObject("null error", e.toString());
        mv.setViewName("nullError");
        return mv;
    }






}
