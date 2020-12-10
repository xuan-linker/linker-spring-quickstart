package com.xlccc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * docker pull mongo
 * docker run -itd --name mongo -p 27017:27017 mongo
 */
@SpringBootApplication
public class AccessingMongodbDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessingMongodbDataRestApplication.class, args);
	}
}