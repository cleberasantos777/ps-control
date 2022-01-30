package com.gunnerapis.psproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PsProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsProductApplication.class, args);
	}

}
