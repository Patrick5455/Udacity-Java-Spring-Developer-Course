package com.example.springbootwebsocket.model;

public class UserResponse {

    private String content;

    public UserResponse(String s){}

    public void setContent(String content){
        this.content = content;
    }

    public String getContent (){

        return content;
    }
}
