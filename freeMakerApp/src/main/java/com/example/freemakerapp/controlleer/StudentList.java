package com.example.freemakerapp.controlleer;

import com.example.freemakerapp.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class StudentList {

    @RequestMapping("/list")
    public String list (Model model){

        List<Student> list = new ArrayList<>();

        list.add(new Student(1, "Patrick", 100.0));
        list.add(new Student(2, "Stephen", 100.0));

        return "list.ftl";

    }



}
