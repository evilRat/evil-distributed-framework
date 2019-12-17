package com.evil.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EvilApiApplication {

	@RequestMapping(name = "HelloService", method = RequestMethod.GET, path = "/hello")
	public String hello() {
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(EvilApiApplication.class, args);
	}

}
