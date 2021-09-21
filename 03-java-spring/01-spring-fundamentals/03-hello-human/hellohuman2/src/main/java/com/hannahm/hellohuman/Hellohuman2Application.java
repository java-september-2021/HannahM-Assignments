package com.hannahm.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication

@RestController
public class Hellohuman2Application {

	public static void main(String[] args) {
		SpringApplication.run(Hellohuman2Application.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello Human!";
	}
	@RequestMapping("/{name}")
	public String index(@PathVariable String name) {
		return "Hello " + name + "!";
	}

}
