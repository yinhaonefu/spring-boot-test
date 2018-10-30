package com.test.springboot.service;

import com.test.springboot.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by yinhao on 18/3/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MyServiceTest {
    @Resource
    private MyService myService;

    @Test
    public void doSomethingTest(){
        myService.doSomething();
    }
}
