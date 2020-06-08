package com.example.springbootvalidation.model;
import org.hibernate.validator.constraints.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class User {

    /* NB :
    Common validation annotations:
    @NotBlank: check if string is null or empty after trimmed the front and end spaces.
    @NotEmpty: check if string is null or empty without trim the front and end spaces.
    @Length: check string length, include max and min.
    @Min: check min, cannot be less. for instance if @Min(0), then input should not less than 0.
    @Max: check max, cannot be over.
    @Email: check email format, should be XX@XX.XX
     */


    @NotBlank(message = "name cannot be blank")
    private String name;
    @NotBlank(message = " password cannot be blank")
    @Length(min = 6, max = 10, message = "password must be between 6 and 10 characters")
    private String password;
    @Min(value = 0, message = "grade cannot be less than 0")
    @Max(value = 100, message = "grade cannot be more than 100")
    private Double grade;
    @Email(message = "invalid format for email")
    private String email;

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

    public void setEmail(String email) {
        this.email = email;
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

    public String getEmail(){
        return  email;
    }
}
