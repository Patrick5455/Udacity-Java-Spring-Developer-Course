package com.example.springbootwebsocket.controller;

import com.example.springbootwebsocket.model.User;
import com.example.springbootwebsocket.model.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    // the controller is used to send messages to different endpoints
    // messages would be mapped to the model we created
    //we would use the @sendto annotation to send messages to endpoints
    // all subscribers of that destination would receive the message

    @MessageMapping("/user")
    //the @MessageMapping annotation maps the message to the user
    @SendTo("/topic/user")
    // with the @SendTo annotation, we are defining the broker "/topic/user" where the message would be sent to
    public UserResponse getUserName(User user){
        return new UserResponse("Hello" + user.getName());
    }




}
