package com.test.springboot.service.impl;

import com.test.springboot.service.MyService;
import org.springframework.stereotype.Service;

/**
 * Created by yinhao on 18/3/28.
 */
@Service("myService")
public class MyServiceImpl implements MyService{
    @Override
    public String doSomething() {
        return "hello";
    }
}
