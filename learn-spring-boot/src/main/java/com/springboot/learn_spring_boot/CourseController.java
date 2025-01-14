package com.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/courses

//course - ID, name, author.

@RestController
public class CourseController {
	
	//This is a simple course controller from where, we are exposing /courses.
	
	//courses
	//Course: id, name, author
	
	// When someone hits /course, following will be sent back
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "ranga"),
				new Course(2, "Learn Devops", "In28mins"),
				new Course(3, "Learn Springboot", "In28mins")
				);
	}
}
