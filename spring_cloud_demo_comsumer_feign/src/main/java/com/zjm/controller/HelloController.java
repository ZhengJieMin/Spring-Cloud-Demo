package com.zjm.controller;

import com.zjm.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 郑杰民 on 2018/5/29.
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(String name){
        String result = "call in " + port +"。<br>";
        result += helloService.sayHello(name);
        return result;
    }
}
