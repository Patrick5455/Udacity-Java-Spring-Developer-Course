package com.example.springbootexception.exceptions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

@Configuration
public class SimpleMappingResolverExceptionHandling{

    @Bean
    public SimpleMappingExceptionResolver handleException(){

        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();

        Properties mapping = new Properties();

        // Key: full name of the error class
        // Value: name of the view page for the error
        mapping.put("java.lang.ArithmeticException", "mathError");
        mapping.put("java.lang.NullPointerException","nullError");

        resolver.setExceptionMappings(mapping);

        return resolver;
    }







}