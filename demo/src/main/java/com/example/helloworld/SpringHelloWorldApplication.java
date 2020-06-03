package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
// @ServletComponentScan is making SpringBoot scan for @WebServlet annotation
// and it's only performed when using an embedded web server such as Spring Boot.
public class SpringHelloWorldApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringHelloWorldApplication.class, args);
	}

}
