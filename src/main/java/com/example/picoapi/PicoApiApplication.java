package com.example.picoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PicoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicoApiApplication.class, args);
	}

}
