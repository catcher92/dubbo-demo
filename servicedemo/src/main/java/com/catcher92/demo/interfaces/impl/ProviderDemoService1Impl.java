package com.catcher92.demo.interfaces.impl;

import com.catcher92.demo.provider.interfaces.ProviderDemoService1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by caoxuedong on 2017/1/23.
 */
@Service
public class ProviderDemoService1Impl implements ProviderDemoService1{

    private Logger logger = LoggerFactory.getLogger(ProviderDemoService1Impl.class);

    public void sayHello(String userName) {
        logger.info("sayHello:"+userName);
    }

    public String getUid() {
        return UUID.randomUUID().toString();
    }
}
