package com.clinic.management.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ClinicManagementConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicManagementConfigServerApplication.class, args);
	}
}
