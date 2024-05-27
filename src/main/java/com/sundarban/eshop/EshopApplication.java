package com.sundarban.eshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EshopApplication {
	public static final Logger log = LoggerFactory.getLogger(EshopApplication.class);

	public static void main(String[] args) {
		log.debug("In debug mode");
		SpringApplication.run(EshopApplication.class, args);
		log.info("Application Started Successfully");
	}

}
