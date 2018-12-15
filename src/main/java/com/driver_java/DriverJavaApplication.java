package com.driver_java;

import com.driver_java.result.Result;
import com.driver_java.result.ResultGenerator;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan("com.driver_java.dao")
public class DriverJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DriverJavaApplication.class, args);

    }


    @RequestMapping(value="/testSrpingboot")
    public Result test(){
        return ResultGenerator.genSuccessResult("springboot + ssm success");
    }

    @RequestMapping(value = "test")
    public String text(){
        return  "test";
    }
}

