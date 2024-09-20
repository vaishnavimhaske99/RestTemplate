package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Intermediate2Application {

	public static void main(String[] args) {
		SpringApplication.run(Intermediate2Application.class, args);
	}

}
