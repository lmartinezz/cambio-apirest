package com.demo.springboot.rxjava.client.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EntityScan({"com.demo.springboot.rxjava.client.app.models.entity"})
@EnableEurekaClient
@SpringBootApplication
public class SpringBootRxjavaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRxjavaClientApplication.class, args);
	}

}
