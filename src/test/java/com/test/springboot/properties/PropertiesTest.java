package com.test.springboot.properties;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by yinhao on 2018/10/31.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {

    @Value("${neo.title}")
    private String title;

    @Resource
    private CarProperties carProperties;

    @Resource
    private OtherProperties otherProperties;

    @Test
    public void testSingle() {
        System.out.println(title);
        Assert.assertEquals(title,"纯洁的微笑");

        System.out.println(carProperties.getColor());
        Assert.assertEquals(carProperties.getColor(), "red");

        System.out.println(carProperties.getLength());
        Assert.assertEquals(carProperties.getLength(), 450);

        System.out.println(otherProperties.getBlog());
        Assert.assertEquals(otherProperties.getBlog(), "www.ityouknow.com");
    }
}
