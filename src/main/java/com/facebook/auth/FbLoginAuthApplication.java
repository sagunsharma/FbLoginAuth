package com.facebook.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableOAuth2Sso
@ComponentScan(basePackages = "com.fb.auth.ctrl")
public class FbLoginAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(FbLoginAuthApplication.class, args);
	}

}
