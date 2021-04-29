package com.example.takeblip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TakeBlipApplication {

	public static void main(String[] args) {
		SpringApplication.run(TakeBlipApplication.class, args);
	}

}
