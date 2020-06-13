package com.example.springbootexception.exceptions;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionControllerHandler {

    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView handleGlobalMathExceptions (Exception e){

        ModelAndView mv = new ModelAndView();
        mv.addObject("error", e.toString());
        mv.setViewName("mathError");
        return mv;
    }

    @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView handleGlobalNullExceptions (Exception e){

        ModelAndView mv = new ModelAndView();
        mv.addObject("error", e);
        mv.setViewName("nullError");
        return mv;
    }


}
