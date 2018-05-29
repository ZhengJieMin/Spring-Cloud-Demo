package com.zjm.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 郑杰民 on 2018/5/29.
 */
@FeignClient(value = "SPRINGCLOUDPROVIDER",fallback = HelloFallbackService.class)
public interface HelloService {
    @RequestMapping(value = "/hi")
    String sayHello(@RequestParam("name") String name);
}
