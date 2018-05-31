package com.zjm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudDemoConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoConfigClientApplication.class, args);
	}
}
