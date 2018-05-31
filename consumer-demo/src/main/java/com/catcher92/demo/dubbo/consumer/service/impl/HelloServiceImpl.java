package com.catcher92.demo.dubbo.consumer.service.impl;

import com.catcher92.demo.dubbo.consumer.service.HelloService;
import com.catcher92.demo.dubbo.provider.service.DemoRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private DemoRemoteService demoRemoteService;


    @Override
    public String sayHello(String name) {
        return demoRemoteService.sayHello(name);
    }
}
