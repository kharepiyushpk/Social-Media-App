package com.kodbook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class NavigationContoller {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/SignUp")
	public String SignUp() {
		return "SignUp";
	}
	
	@GetMapping("/createPost")
	public String createPost() {
		return "post";
	}
}
