package com.example.helloworld.servlet;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/helloServlet")

/* Servlet is a technology/API/class that is used to create handle requests in web
* applications. Reside in server side, Spring Boot uses Servlet to receive requests from client side
* There are 2 ways in Spring Boot to use Servlet Api:
*
* @ServletComponentScan &
* @Bean
*
* There are 3 compoenents of servlets in springboot:
*   1. HttpServlet
*   2. Filter
*   3. ServletContextListener a.k.a Listener
*/
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){

        System.out.println("Running Hello Servlet doGet method");
    }
}


