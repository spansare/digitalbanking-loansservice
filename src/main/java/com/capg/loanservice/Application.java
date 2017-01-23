package com.capg.loanservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import org.apache.log4j.Logger;

@SpringBootApplication
public class Application   {
	
    private static Logger log = Logger.getLogger(Application.class);


    public static void main(final String[] args) throws Throwable {
    	
        log.info("Logger enabled: Entering main \n\n");

        SpringApplication.run(Application.class, args);
    }

}
