package com.udacity.jwdnd.c1.review;

import com.udacity.jwdnd.c1.review.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}


	@Bean
	public String message (){
		System.out.println("Bean: message created");
		return "Welcome to my world";
	}

	@Bean
	public String upperCaseMessage(MessageService messageService){
		System.out.println("Bean: upperCaseMessage created");
		return  messageService.upperCase();
	}

	@Bean
	public String lowerCaseMessage(MessageService messageService){
		System.out.println("Bean: lowerCaseMessage created");
		return  messageService.lowerCase();
	}


}
