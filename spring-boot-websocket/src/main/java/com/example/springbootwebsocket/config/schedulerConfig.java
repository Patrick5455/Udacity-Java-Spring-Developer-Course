

package com.example.springbootwebsocket.config;

import com.example.springbootwebsocket.model.Greeting;
import com.example.springbootwebsocket.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


@Configuration
@EnableScheduling
public class schedulerConfig {

    @Autowired
    SimpMessagingTemplate messagingTemplate; // this converts message and sends ti the broker

    @Scheduled(fixedDelay = 500) // this defines the time delay
    public void sendAdhocMessages(){

        messagingTemplate.convertAndSend("/topic/greetings",
                new Message("Scheduler"));
    }

}


