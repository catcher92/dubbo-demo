package com.catcher92.demo.dubbo.provider.service.impl;

import com.catcher92.demo.dubbo.provider.service.DemoRemoteService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class DemoRemoteServiceImpl implements DemoRemoteService {

    @Override
    public String sayHello(String name) {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello " + name;
    }
}
