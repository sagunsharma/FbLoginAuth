package com.facebook.auth;

import java.security.Principal;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan(basePackages = "com.fb.auth.ctrl")
@SpringBootApplication
@Configuration
@EnableOAuth2Sso
public class FbLoginAuthApplication extends WebSecurityConfigurerAdapter  {
	
	 protected void configure(HttpSecurity http) throws Exception {
	      http
	        .csrf().disable();
	  }

	public static void main(String[] args) {
		SpringApplication.run(FbLoginAuthApplication.class, args);
	}

}
