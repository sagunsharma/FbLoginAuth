package com.fb.auth.ctrl;

import java.security.Principal;
import java.util.Map;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainCtrl 
{
	@RequestMapping("/")
	public String userAuth(Principal principal)
	 {
		System.out.println("Main ctrl");
		 OAuth2Authentication auth=(OAuth2Authentication) principal;
		 Map<String, Object> user=(Map<String, Object>) auth.getUserAuthentication().getDetails();
		System.out.println("user details"+user);
		 return "Welcome: "+user.get("name");
		 
	 }
}
