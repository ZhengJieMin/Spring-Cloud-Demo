package com.zjm.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by 郑杰民 on 2018/5/29.
 */
@Service
public class Helloservie {
    @Value("${server.port}")
    private String port;

    public String sayHello(String name){
        String result = "Hi!"+name+"。callback in port:"+port;
        System.out.println(result);
        return result;
    }
}

