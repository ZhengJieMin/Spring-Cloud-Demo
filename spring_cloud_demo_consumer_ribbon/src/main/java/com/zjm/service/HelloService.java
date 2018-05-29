package com.zjm.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 郑杰民 on 2018/5/29.
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiFallService")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SPRINGCLOUDPROVIDER/hi?name="+name,String.class);
    }

    private String hiFallService(String name){
        return "hi,"+name+",sorry,error!";
    }
}
