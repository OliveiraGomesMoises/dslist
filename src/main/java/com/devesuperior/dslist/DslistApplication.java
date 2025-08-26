package com.devesuperior.dslist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class DslistApplication {
	@GetMapping
	public String getHome(){
		return "IntensivaoOOOOOO";
	}
	public static void main(String[] args) {
		SpringApplication.run(DslistApplication.class, args);
	}

}
