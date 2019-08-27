package com.springboot.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class Oauth2GithubApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(Oauth2GithubApplication.class, args);
	}

}
