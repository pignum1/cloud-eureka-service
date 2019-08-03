package com.demo.cloudeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //启动服务注册中心
@SpringBootApplication
public class CloudEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudEurekaServiceApplication.class, args);

	}

}
