package com.howtodoinjava.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
