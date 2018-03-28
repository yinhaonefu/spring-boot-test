package com.test.springboot.controller;

import com.test.springboot.service.MyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by yinhao on 18/3/28.
 */
@RestController
public class MyController {

    @Resource
    private MyService myService;

    @RequestMapping("/")
    String home(){
        return "Hello World!";
    }

    @RequestMapping("/do")
    String doSomething(){
        return myService.doSomething();
    }
}
