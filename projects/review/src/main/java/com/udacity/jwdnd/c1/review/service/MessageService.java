package com.udacity.jwdnd.c1.review.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MessageService {


    // already defined bean in run class
    // spring looks for a bean of this data type and configures it
    public String message;

    public MessageService (String message){
        this.message = message;
    }


    public String upperCase (){
        return  this.message.toUpperCase();
    }

    public String lowerCase (){
        return this.message.toLowerCase();
    }

    // this would help us know if Spring
    // truly creates a bean of this class or not
    @PostConstruct
    public void postConstruct(){
        System.out.println("Creating MessageService Bean");
    }











}
