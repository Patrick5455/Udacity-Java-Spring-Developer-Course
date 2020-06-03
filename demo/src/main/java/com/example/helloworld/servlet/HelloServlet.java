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
* applications. Reside in server side, Sprin Boot uses Servlet to receive requests from client side
* There are ways in Spring Boot to ise Servlet Api:
*
* @ServletComponentScan
* @Bean
*/
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){

        System.out.println("Running Hello Servlet doGet method");

    }


@WebFilter(filterName = "helloFilter", urlPatterns = "/helloServlet")
public class HelloFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain)

            throws IOException, ServletException {
        System.out.println("Executing doFilter method");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("DOne Executing doFilter method");

    }

    }
}

