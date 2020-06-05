package com.example.freemarker.controller;

import com.example.freemarker.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentList {

    @RequestMapping("/list")
    public String list (Model model){

        List <Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Patrick", 90));
        studentList.add(new Student(2, "Stephen", 95));
        studentList.add(new Student(3, "Boluwatife", 97));
        studentList.add(new Student(4, "Florence", 99));

        return "list.html";
    }

}
