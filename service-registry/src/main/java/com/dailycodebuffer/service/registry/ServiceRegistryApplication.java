package com.dailycodebuffer.service.registry;

import org.bouncycastle.jcajce.provider.symmetric.DSTU7624.CCM128;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {
	public void m1() {
		System.out.println("i am in m1.");
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
		
	}

}
