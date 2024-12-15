package com.ram.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogbackController {
	
	private static final Logger logger = LoggerFactory.getLogger(LogbackController.class);

    @GetMapping("/")
    public String hello() {


        logger.debug("Debug level - Hello Logback");

        logger.info("Info level - Hello Logback");
        
        //Logback varaibles
        logger.error("Error level - Hello Logback {}","hello");

        return "Hello Logback";
    }

}
