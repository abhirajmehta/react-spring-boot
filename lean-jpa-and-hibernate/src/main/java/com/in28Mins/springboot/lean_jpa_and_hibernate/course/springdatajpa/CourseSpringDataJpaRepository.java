package com.in28Mins.springboot.lean_jpa_and_hibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28Mins.springboot.lean_jpa_and_hibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
	List<Course> findByAuthor(String author); // ---> Must follow a naming convention. Use same name as in class
}
