package com.catcher92.demo.dubbo.framework.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

public class ConfigLoadListener extends ContextLoaderListener {

    private static final Logger logger = LoggerFactory.getLogger(ConfigLoadListener.class);

    @Override
    public WebApplicationContext initWebApplicationContext(ServletContext servletContext) {
        logger.info("WebApplicationContext----initWebApplicationContext");
        return super.initWebApplicationContext(servletContext);
    }
}
