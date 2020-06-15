package com.example.springbootwebsocket.controller;

import com.example.springbootwebsocket.model.Greeting;
import com.example.springbootwebsocket.model.Message;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    // the controller is used to send messages to different endpoints
    // messages would be mapped to the model we created
    //we would use the @sendTo annotation to send messages to endpoints
    // all subscribers of that destination would receive the message

    @MessageMapping("/hello")
    //the @MessageMapping annotation maps the message to the user
    @SendTo("/topic/greetings")
    // with the @SendTo annotation, we are defining the broker "/topic/user" where the message would be sent to
    public Greeting greeting(Message message) throws Exception{

        return new Greeting((message.getName()));
    }




}
