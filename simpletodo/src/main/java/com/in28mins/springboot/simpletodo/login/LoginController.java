package com.in28mins.springboot.simpletodo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	
	private AuthenticationService auth;
	
	public LoginController(AuthenticationService auth) {
		super();
		this.auth = auth;
	}

	@RequestMapping(value="login", method = RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
		
		if(auth.authenticate(name, password)){ 
			model.put("name", name);
			model.put("password", password);
			
			return "welcome";
		//Authentication
		//name - in28mins
		//password - dummy
		
				
		}else { 
			model.put("errorMessage", "Invalid creds");
			return "login";}
	}
}
