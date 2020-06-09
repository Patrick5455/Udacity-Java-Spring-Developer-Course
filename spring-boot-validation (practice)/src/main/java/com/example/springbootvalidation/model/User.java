package com.example.springbootvalidation.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class User {

    @NotBlank(message = "Username cannot be blank")
    private String userName;

    @NotBlank(message = "Password cannot be blank")
    @Length(min = 6, max = 10, message = "Password length must be between 6 and 10 characters")
    private String passWord;

    @Min(value = 0, message = "Grade cannot be leas than 0")
    @Max(value = 100, message = "Grade cannot be greater than 100")
    private Double grade;

    @Email(message = "Invalid email format. Format should be lorem@ipsum.xyz")
    private String email;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User (String userName, String passWord, Double grade, String email){

        this.userName = userName;
        this.passWord = passWord;
        this.grade = grade;
        this.email = email;
    }
}
