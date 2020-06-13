package com.example.springbootexception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerException {


    @RequestMapping("/math")
    public String handleMathErrorException (){

        try {

            int x = 100 / 0;
        }

        catch (ArithmeticException e){

            System.out.println(e.toString());
        }
        return "mathError";
    }




}
