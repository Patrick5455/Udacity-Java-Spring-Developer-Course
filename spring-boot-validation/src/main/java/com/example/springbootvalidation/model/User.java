package com.example.springbootvalidation.model;
import org.hibernate.validator.constraints.*;

import javax.validation.constraints.NotBlank;

public class User {


    @NotBlank(message = "name cannot be blank")
    private String name;
    @NotBlank(message = " password cannot be blank")
    private String password;

    private Double grade;

    public User(String name, String password, Double grade){
        this.name = name;
        this.password = password;
        this.grade = grade;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setGrade(Double grade){
        this.grade = grade;
    }

    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }

    public Double getGrade(){
        return grade;
    }
}
