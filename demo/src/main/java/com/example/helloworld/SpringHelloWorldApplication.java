package com.example.helloworld;

import com.example.helloworld.servlet.HelloFilter;
import com.example.helloworld.servlet.HelloListener;
import com.example.helloworld.servlet.HelloServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

//@ServletComponentScan
// @ServletComponentScan is making SpringBoot scan for @WebServlet annotation
// and it's only performed when using an embedded web server such as Spring Boot.

public class SpringHelloWorldApplication {

	/// Register Servlet

	@Bean
	public ServletRegistrationBean getServletRegistrationBean(){

		ServletRegistrationBean servletBean = new ServletRegistrationBean( new HelloServlet());
		servletBean.addUrlMappings("/helloServlet");
		return  servletBean;
	}


	/// Register Filter
	@Bean
	public FilterRegistrationBean getFilterRegistrationBean() {

		FilterRegistrationBean filterBean =
				new FilterRegistrationBean(new HelloFilter());

		//Add Filter Path
		filterBean.addUrlPatterns("/helloServlet");

		return filterBean;
	}

	@Bean
	public ServletListenerRegistrationBean<HelloListener> getServletListenerRegistrationBean (){

		ServletListenerRegistrationBean listenerBean =
				new ServletListenerRegistrationBean(new HelloListener());

		return listenerBean;
	}


	public static void main(String[] args) {

		SpringApplication.run(SpringHelloWorldApplication.class, args);
	}



}
