package com.demo.springboot.rxjava.eureka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootRxjavaEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRxjavaEurekaServerApplication.class, args);
	}

}
