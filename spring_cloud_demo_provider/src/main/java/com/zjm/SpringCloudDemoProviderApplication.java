package com.zjm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudDemoProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoProviderApplication.class, args);
	}
}
