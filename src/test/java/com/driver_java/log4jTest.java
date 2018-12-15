package com.driver_java;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
@SpringBootApplication
public class log4jTest {

    private static  Logger logger = LoggerFactory.getLogger(log4jTest.class);

    public static void main(String[] args) {
        SpringApplication.run(log4jTest.class,args);
        logger.error("error");
    }

}
