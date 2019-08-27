package com.springboot.oauth2.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@GetMapping("/")
	public String message(Principal principal) {
		return "Hello " + principal.getName() + " welcome to Oauth2GithubApplication";
	}
	
}
