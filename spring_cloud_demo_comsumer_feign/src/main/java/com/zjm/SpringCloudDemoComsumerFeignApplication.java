package com.zjm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableCircuitBreaker //没有@EnableCircuitBreaker注解，但要使用Dashboard则必须加，如果不加，Dashboard无法接收到来自Feign内部断路器的监控数据，会报“Unable to connect to Command Metric Stream”错误
public class SpringCloudDemoComsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoComsumerFeignApplication.class, args);
	}
}
