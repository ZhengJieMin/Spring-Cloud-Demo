package com.zjm.service;

import org.springframework.stereotype.Service;

/**
 * Created by 郑杰民 on 2018/5/29.
 */
@Service
public class HelloFallbackService implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
