package com.moto.servicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MotoServicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotoServicioApplication.class, args);
	}

}
