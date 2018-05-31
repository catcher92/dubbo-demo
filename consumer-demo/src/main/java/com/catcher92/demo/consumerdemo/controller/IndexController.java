package com.catcher92.demo.consumerdemo.controller;

import com.catcher92.demo.provider.interfaces.ProviderDemoService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by caoxuedong on 2017/2/6.
 */
@Controller
public class IndexController {

    @Autowired
    private ProviderDemoService1 providerDemoService1;

    @ResponseBody
    @RequestMapping("/uuid")
    public String getUUID(){
        return providerDemoService1.getUid();
    }

    @RequestMapping(value = {"", "/index"})
    public String index(Model model){
        String uuid = getUUID();
        providerDemoService1.sayHello(uuid);
        model.addAttribute("uuid", uuid);
        return "index";
    }

}
