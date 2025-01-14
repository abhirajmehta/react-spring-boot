package com.in28Mins.springboot.lean_jpa_and_hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28Mins.springboot.lean_jpa_and_hibernate.course.Course;
import com.in28Mins.springboot.lean_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.in28Mins.springboot.lean_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.in28Mins.springboot.lean_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	private CourseJdbcRepository repository;
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1, "Learn AWS", "in28mins"));
		repository.save(new Course(2, "Learn API", "in28mins"));
		repository.save(new Course(3, "Learn JPA", "in28mins"));
		repository.deleteById(1l);	
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findByAuthor("in28mins"));
		System.out.println(repository.findByAuthor(""));
	}

}
