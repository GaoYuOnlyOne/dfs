package com.gy.dfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName DemoController
 * @Description
 * @Author gaoyu
 * @Date 2020/11/18 15:47
 * @Version 1.0
 **/
@Controller
@RequestMapping("demo")
public class DemoController {
    @GetMapping("thymeleaf")
    public String demoUpload(){
        return "index";
    }
}
