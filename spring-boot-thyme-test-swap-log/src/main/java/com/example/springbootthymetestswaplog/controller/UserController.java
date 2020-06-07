package com.example.springbootthymetestswaplog.controller;

import com.example.springbootthymetestswaplog.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping("page1")
    public String page1 (Model model){
        model.addAttribute("page1", "Welcome Home");
        return "page1";
    }


    @RequestMapping("page2")
    public String page2 (Model model){

        List<User> users = new ArrayList<>();

        users.add(new User(1, "Chinedu John", 30));
        users.add(new User(2, "Erons Uj", 35));
        users.add(new User(3, "Bams Issac", 40));
        model.addAttribute("users", users);

        return "page2";
    }

    @RequestMapping("page3")
    public String page3(Model model){

        Integer grade = 40;

        model.addAttribute("grade",grade);

        model.addAttribute("GPA", convertGPA(grade));

        return "page3";
    }

    private String convertGPA(Integer grade) {

        if (grade >= 90)
            return "A";
        else if (grade <90 && grade>=80)
            return "B";
        else if (grade <80 && grade>=70)
            return "C";
        else if (grade <70 && grade>=60)
            return "D";
        else
        return "F";
    }

    @RequestMapping("page4")
    public String page4(Model model, HttpServletRequest request){

        //Request Scope
        request.setAttribute("request", "Request Data");

        //Session Scope
        request.getSession().setAttribute("session", "Session Data");

        //Application Scope
        request.getSession().getServletContext().setAttribute("application", "Application Data");

//        model.addAttribute("request", request);
        return "page4";
    }

}
