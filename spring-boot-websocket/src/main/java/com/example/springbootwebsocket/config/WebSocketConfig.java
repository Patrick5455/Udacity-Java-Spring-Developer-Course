package com.example.springbootwebsocket.config;

import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

// we ought to use AbstractWebSocketMessageBrokerConfigurer
// but it has been deprecated in favour of WebSocketMessageBrokerConfigurer

public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {


    /* The configure message broker is used to configure the message broker.
    * We want to:
    * 1. enable an in-memory message broker to carry the messages back to client on destination
    * 2. Then we want to set the application destination prefixes
    *
    * After this we need to implement registerStompEndpoints method to register the endpoint.
    * We will need to find a prefix for the endpoint.
    * This will enable Spring's STOMP support and SockJS fallback options,
    * so that alternative messaging may be used if WebSockets are not available
    * */


    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {

    }
}

