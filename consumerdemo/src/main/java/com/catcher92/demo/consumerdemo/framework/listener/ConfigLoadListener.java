package com.catcher92.demo.consumerdemo.framework.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

/**
 * Created by caoxuedong on 2017/1/20.
 */
public class ConfigLoadListener extends ContextLoaderListener {
    private static Logger logger = LoggerFactory.getLogger(ConfigLoadListener.class);

    @Override
    public WebApplicationContext initWebApplicationContext(ServletContext servletContext) {
        // // TODO: 2017/1/20 配合disconf来读取配置文件
        logger.info("WebApplicationContext---initWebApplicationContext");
        return super.initWebApplicationContext(servletContext);
    }
}
