package com.hzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConsumerApplication.class, args);
	}

}
