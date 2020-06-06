package com.example.springbootlogging.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("log")
    public Map<String, Object> log (){
        Map<String, Object> map = new HashMap<>();
        map.put("Name", "Patrick Ojunde,");
        map.put("Occupation", "Software & Data ENgineer");

        logger.warn("This is a warning message");
        logger.info("This is logger logging info");
        logger.debug("This is logger logging debug message");

        return map;
    }


}
