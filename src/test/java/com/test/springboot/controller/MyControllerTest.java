package com.test.springboot.controller;

import com.test.springboot.Application;
import com.test.springboot.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * Created by yinhao on 18/3/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MyControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Resource
    private MyController myController;

    @MockBean
    private MyService myService;

    @Test
    public void homeTest() {
        String body = this.restTemplate.getForObject("/", String.class);
        assertThat(body).isEqualTo("Hello World!");
    }

    @Test
    public void doSomethingTest(){
        given(myService.doSomething()).willReturn("mock");
        String s = myController.doSomething();
        assertThat(s).isEqualTo("mock");
    }

}
