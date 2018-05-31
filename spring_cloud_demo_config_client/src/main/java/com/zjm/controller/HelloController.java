package com.zjm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 郑杰民 on 2018/5/31.
 */
@RestController
public class HelloController {
    @Value("${foo}")
    private String foo;
    @Autowired
    Environment env;

    @RequestMapping(value = "/hi")
    public String sayHi(){
        return foo+ "\n" + env.getProperty("foo", "未定义");
    }
}
