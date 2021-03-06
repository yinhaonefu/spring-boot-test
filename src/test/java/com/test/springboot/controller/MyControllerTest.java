package com.test.springboot.controller;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by yinhao on 18/3/28.
 */

@SpringBootTest
public class MyControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new MyController()).build();
    }

    @Test
    public void homeTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("Hello")));
    }

    @Test
    public void getUserTest() throws Exception {
        String string = mockMvc.perform(MockMvcRequestBuilders.get("/getUser")).andReturn().getResponse().getContentAsString();
        System.out.println("result:" + string);
    }

    @Test
    public void getUsersTest() throws Exception {
        String string = mockMvc.perform(MockMvcRequestBuilders.get("/getUsers")).andReturn().getResponse().getContentAsString();
        System.out.println("result:" + string);
    }

    @Test
    public void saveUsers() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/saveUser")
                .param("name","")
                .param("age","666")
                .param("pass","test")
        );
    }

}
