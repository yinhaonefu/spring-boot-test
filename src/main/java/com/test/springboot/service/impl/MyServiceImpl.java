package com.test.springboot.service.impl;

import com.test.springboot.config.ApplicationProperties;
import com.test.springboot.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yinhao on 18/3/28.
 */
@Service("myService")
public class MyServiceImpl implements MyService{

    private Logger logger = LoggerFactory.getLogger(MyServiceImpl.class);

    @Resource
    private ApplicationProperties applicationProperties;

    @Override
    public String doSomething() {
        logger.info("doSomething start");
        logger.info("doSomething");
        logger.info("doSomething end");
        logger.info(applicationProperties.getName());
        return "hello";
    }
}
