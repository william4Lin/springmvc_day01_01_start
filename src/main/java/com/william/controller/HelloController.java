package com.william.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/user")
public class HelloController {

    /*@RequestMapping(path = "/hello")
    public String sayHello() {
        System.out.println("Hello World !");
        return "success";
    }*/

    @RequestMapping(path = "/testRequestMapping",method = {RequestMethod.GET},params = {"username!100"},headers = {"Accept"})
    public String testRequestMapping(){
        System.out.println("测试RequestMapping注解。。。");
        return "success";
    }
}
