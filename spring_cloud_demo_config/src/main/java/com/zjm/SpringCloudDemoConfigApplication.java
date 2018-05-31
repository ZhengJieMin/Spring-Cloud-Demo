package com.zjm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableConfigServer
@EnableAutoConfiguration
@EnableDiscoveryClient
public class SpringCloudDemoConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoConfigApplication.class, args);
	}
}
