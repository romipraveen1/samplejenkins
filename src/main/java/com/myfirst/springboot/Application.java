package com.myfirst.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application  extends SpringBootServletInitializer{

	 @RequestMapping("/")
	    public String home() {
	        return "Hello Docker World, It's Spring-2.1.6  .v1";
	    }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
