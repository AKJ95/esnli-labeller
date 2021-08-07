package com.durham.cs.esnlilabeller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EsnliLabellerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsnliLabellerApplication.class, args);
		log.info("Swagger Document: http://localhost:8080/swagger-ui.html#/");
	}

}
