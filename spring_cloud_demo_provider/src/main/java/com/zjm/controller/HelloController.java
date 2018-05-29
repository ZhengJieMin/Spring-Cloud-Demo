package com.zjm.controller;


import com.zjm.service.Helloservie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 郑杰民 on 2018/5/29.
 */
@RestController
public class HelloController {

    @Autowired
    private Helloservie helloservie;

    @RequestMapping("/hi")
    public String sayHello(String name){
        return helloservie.sayHello(name);
    }
}
