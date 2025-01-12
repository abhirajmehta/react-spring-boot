package com.in28mins.springboot.simpletodo.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String name, String password) {
		
		return name.equalsIgnoreCase("in28mins") && password.equalsIgnoreCase("dummy");
		

	}
	
}
