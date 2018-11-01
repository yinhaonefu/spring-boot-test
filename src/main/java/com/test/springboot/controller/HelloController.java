package com.test.springboot.controller;

import com.test.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yinhao on 2018/11/1.
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("message", "http://www.ityouknow.com");
        map.addAttribute("username", "zhangsan");

        map.addAttribute("flag", "yes");
        map.addAttribute("users", getUserList());

        map.addAttribute("type", "link");
        map.addAttribute("pageId", "springcloud/2017/09/11/");
        map.addAttribute("img", "http://www.ityouknow.com/assets/images/neo.jpg");

        map.addAttribute("name", "neo");
        map.addAttribute("age", 30);
        map.addAttribute("flag", "yes");

        map.addAttribute("sex", "woman");
        return "hello";
    }

    private List<User> getUserList(){
        List<User> list=new ArrayList<User>();
        User user1=new User("大牛",12,"123456");
        User user2=new User("小牛",6,"123563");
        User user3=new User("纯洁的微笑",66,"666666");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return  list;
    }

}
