package com.example.springbootthymeleaf.controller;

import com.example.springbootthymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {


    @RequestMapping("demo")
    public String demo(Model model){

        model.addAttribute("message", "Using Variable in Thymeleaf");

        return "demo";
    }

    @RequestMapping("demo2")
    public String demo2 (Model model){
        List<User> list = new ArrayList<>();

        list.add(new User(1, "Patrick", 27));
        list.add(new User(2, "Mayor", 35));
        list.add(new User(3, "Bolu", 30));

        model.addAttribute("userList",list);

        return "demo2";
    }

    @RequestMapping("demo3")
    public String demo3 (Model model){

        double grade = 60.0;
        model.addAttribute("grade", grade);
        model.addAttribute("GPA", convertCGPA(grade));

        return "demo3";
    }

    private String convertCGPA(double grade) {
         if(grade >= 90)
             return "A";
         else if(grade <90 && grade >=80)
             return "B";
        else if (grade <80 && grade >=70)
             return "C";
         else if(grade <70 && grade >=60)
             return "D";
         else
             return "F";
    }
}



