package com.app.trimia.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.app.trimia.util.FileStorageProperties;

@SpringBootApplication(scanBasePackages="com.app.trimia")
@EnableJpaRepositories(basePackages= {"com.app.trimia"})
@EntityScan(basePackages= {"com.app.trimia.model"})
@EnableConfigurationProperties({FileStorageProperties.class})
public class Trimia3dApplication {

	public static void main(String[] args) {
		System.out.println("start");
		SpringApplication.run(Trimia3dApplication.class, args);
		System.out.println("end");
	}

}

