package com.example.ModFsDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class ModFsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModFsDemoApplication.class, args);
	}

	@GetMapping("/add/{a}/{b}")
	public String add(@PathVariable("a") int a, @PathVariable("b") int b) {
		return String.format("Result = %s!", a + b);
	}

	@GetMapping("/substract/{a}/{b}")
	public String substract(@PathVariable("a") int a, @PathVariable("b") int b) {
		return String.format("Result = %s!", a - b);
	}

	@GetMapping("/divide/{a}/{b}")
	public String sbtract(@PathVariable("a") int a, @PathVariable("b") int b) {
		return String.format("Result = %s!", a / b);
	} 

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
		model.addAttribute("name", name);
		return "Hello";
	}
	
}
