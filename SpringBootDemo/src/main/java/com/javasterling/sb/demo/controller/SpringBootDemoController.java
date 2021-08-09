package com.javasterling.sb.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javasterling.sb.demo.model.SampleResponse;

@RestController
@RequestMapping(path = "/demo")
public class SpringBootDemoController {


	@GetMapping("/greet")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@RequestMapping("/sample")
	public SampleResponse Sample(@RequestParam(value = "name",
	defaultValue = "Robot") String name) {
		SampleResponse response = new SampleResponse();
		response.setId(1);
		response.setMessage("Your name is "+name);
		return response;

	}



}
