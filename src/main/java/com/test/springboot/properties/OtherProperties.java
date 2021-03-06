package com.test.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by yinhao on 2018/10/31.
 */
@Component
@ConfigurationProperties(prefix="other")
@PropertySource("classpath:other.properties")
public class OtherProperties {

    private String title;

    private String blog;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }
}
