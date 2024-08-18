package com.cts.expensetrakerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ExpensetrakerapiApplication {

	@GetMapping("/expenses")
	public static void main(String[] args) {
		SpringApplication.run(ExpensetrakerapiApplication.class, args);
	}

}
