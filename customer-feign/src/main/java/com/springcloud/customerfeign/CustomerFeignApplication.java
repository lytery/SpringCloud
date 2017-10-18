package com.springcloud.customerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient

//该注解是开启Feign功能
@EnableFeignClients
public class CustomerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerFeignApplication.class, args);
	}
}
