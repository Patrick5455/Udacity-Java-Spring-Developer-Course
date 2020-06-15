package com.example.springbootwebsocket.config;

import com.example.springbootwebsocket.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


@Configuration
@EnableScheduling
public class schedulerConfig {

    @Autowired
    SimpMessagingTemplate messagingTemplate;

    @Scheduled(fixedDelay = 5000)
    public void sendAdhocMessages(){

        messagingTemplate.convertAndSend("/topic/user",
                new UserResponse("Scheduler"));
    }

}
