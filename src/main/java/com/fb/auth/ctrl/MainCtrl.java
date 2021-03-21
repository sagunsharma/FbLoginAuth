package com.fb.auth.ctrl;

import java.security.Principal;
import java.util.Map;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class MainCtrl 
{
	@RequestMapping(value = "/user", method = RequestMethod.GET)
		public String userAuth(Principal principal)
		 {
			System.out.println("Main ctrl");
			 OAuth2Authentication auth=(OAuth2Authentication) principal;
			 if(auth==null)
			 {
				 return "errorpage.html";
			 }
			 else
			 {
			 Map<String, Object> user=(Map<String, Object>) auth.getUserAuthentication().getDetails();
			System.out.println("Welcome: "+user.get("name"));
			 return "sucess.html";
			 }
		 }  
	@RequestMapping("/welcome")
	public String welcome()
	 {
		System.out.println("Welcome");
		 return "Welcome";
		 
	 }
	
}
