package com.springboot.learn_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/courses

//course - ID, name, author.

@RestController
public class CurrencyConfigurationController {
	
	//This is a simple course controller from where, we are exposing /courses.
	
	//courses
	//Course: id, name, author
	
	// When someone hits /course, following will be sent back
	
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCourses(){
		return configuration;
	}
}
