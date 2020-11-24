package com.sabre.rest.demo.RestfulDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.sabre.rest.demo.RestfulDemo","com.sabre.rest.demo.RestfulDemo.controller"} )
public class RestfulDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulDemoApplication.class, args);
	}

}
