package com.employee.location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BranchServiceNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(BranchServiceNewApplication.class, args);
	}

}
