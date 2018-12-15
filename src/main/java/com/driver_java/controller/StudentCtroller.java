package com.driver_java.controller;

import com.driver_java.result.Result;
import com.driver_java.result.ResultGenerator;
import com.driver_java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping(value = "/driver/student")
public class StudentCtroller {

    @Autowired
    private StudentService studentService;

    /**
    　　* @Description: TODO 测试
    　　* @param Integer id
    　　* @return Result
    　　* @throws
    　　* @author jinglianqi
    　　* @date 2018-12-15 19:04 
    　　*/
    @GetMapping(value = "/selectDemo/{id}")
    public Result selectByPrimaryKey(@PathVariable("id")Integer id){

        return ResultGenerator.genSuccessResult(studentService.selectByPrimaryKey(id));
    }

    @GetMapping(value = "/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name","asd");
        return "thymeleafTest";
    }
}
