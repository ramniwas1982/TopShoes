package com.web.topshoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.web.topshoes"})
@SpringBootApplication
 @EnableAutoConfiguration 
@EntityScan(basePackages = { "com.web.topshoes.entity"})

public class TopShoesApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application;
    	  
      }
	public static void main(String[] args) {
		SpringApplication.run(TopShoesApplication.class, args);
		System.out.println("Hello World");
		
	}

}
