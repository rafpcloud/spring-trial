package com.pratik.springsql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingController {

	@GetMapping("/")
	public String hello(){
		return "Hello World";
	}
}
