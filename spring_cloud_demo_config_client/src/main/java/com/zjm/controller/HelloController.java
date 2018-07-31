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
//    这种写法不会实时跟新，只会在初始化controller的时候初始化一次
//    @Value("${foo}")
//    private String foo;
//    @Value("${foo1}")
//    private String foo1;
//    @Value("${foo2}")
//    private String foo2;
    @Autowired
    Environment env;

//    @RequestMapping(value = "/hi")
//    public String sayHi(){
//        return foo+ "<br>" + foo1+"<br>" + foo2;
//    }

    @RequestMapping(value = "/hi")
    public String sayHi(@Value("${foo}")String foo,@Value("${foo1}") String foo1,@Value("${foo2}") String foo2){
        return foo+ "<br>" + foo1+"<br>" + foo2;
    }
}
