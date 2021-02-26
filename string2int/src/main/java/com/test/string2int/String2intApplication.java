package com.test.string2int;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class String2intApplication {

	public static void main(String[] args) {
		SpringApplication.run(String2intApplication.class, args);

		System.out.println("Case A --> http://localhost:8080/home/abc573");
		System.out.println("Case B --> http://localhost:8080/home/a5b7c3");
	}

}
