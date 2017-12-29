package io.dagistan.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hello {

	@GetMapping("/hello")
	public String getAllPerson() {
		return "Hello World HTTPS succeeded.";
	}

}
