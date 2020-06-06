package com.example.springbootthymeleaf.controller;

import com.example.springbootthymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/demo")
    public String demo(Model model){

        model.addAttribute("message", "Hello Thymeleaf");
        model.addAttribute("message2", "Thymeleaf is easier to use");

        double grade = 90.5;
        model.addAttribute("grade", grade);
        model.addAttribute("GPA", convertGPA(grade));

        return "demo";
    }

    private String convertGPA(double grade){

        if(grade >=90)
            return "A";
        else if (grade <90 && grade>=80)
            return "B";
        else if (grade < 80 && grade>=70)
            return "C";
        else if (grade < 70 && grade>=60)
            return "D";
        else
            return "F";
    }

    @RequestMapping("/demo2")
    public String demo2 (Model model){

        List<User> list = new ArrayList<>();

        list.add(new User(1, "Patrick", 32));
        list.add(new User(2, "Mayowa", 21));
        list.add(new User(3, "Boluwatife", 18));

        model.addAttribute("list", list);
        return "demo2";
    }

    // implementing scope in Thymeleaf
    @RequestMapping("demo3")
    public String demo3 (HttpServletRequest request, Model model){
        // Request Scope
        request.setAttribute("request", "request data");
        //Session Scope
        request.getSession().setAttribute("session", "session data");
        //Application Scope
        request.getSession().getServletContext().setAttribute("application", "application data");

        return "demo3";
    }
}
