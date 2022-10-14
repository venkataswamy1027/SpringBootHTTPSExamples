package com.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtrl {

	@GetMapping("/hello")
	public String hello() {
		return "welcome to spring boot http example";
	}
}
