package com.dubbo.consumer.controller;

import com.dubbo.service.TestSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestSerivce testSerivce;

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "hello") String hello){
        return testSerivce.hello(hello);
    }
}
