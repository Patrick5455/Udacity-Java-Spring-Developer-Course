package com.udacity.jwdnd.c1.review.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {


    public String upperCase (String message){
        return  message.toUpperCase();
    }

    public String lowerCase (String message){
        return message.toLowerCase();
    }











}
