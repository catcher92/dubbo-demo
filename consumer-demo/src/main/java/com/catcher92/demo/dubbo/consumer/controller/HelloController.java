package com.catcher92.demo.dubbo.consumer.controller;

import com.catcher92.demo.dubbo.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("sayHello")
    public String sayHello(String name) {
        return helloService.sayHello(name);
    }

}
