package com.example.logs.logs;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LogsApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(LogsApplication.class, args);
	}

	@RequestMapping(value="/hello")
	public String helloWorld()
	{
		return "Hello World";
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("In the run method");
	}
}
