package com.kkd.farmermyAccountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaDiscovery
@EnableSwagger2
@EnableCircuitBreaker
@EnableHystrixDashboard
@FeignClient("com.kkd.farmermyAccountservice")
@SpringBootApplication
public class FarmerMyAccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmerMyAccountServiceApplication.class, args);
	}
	@Bean
	
	@Bean
}
