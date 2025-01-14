package com.in28Mins.springboot.lean_jpa_and_hibernate.course.jpa;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28Mins.springboot.lean_jpa_and_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {

	@PersistenceContext //---------------------> More specific annotation to have context
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findByID(long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteByID(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
	
//	repository.insert(new Course(1, "Learn AWS", "in28mins"));
//	repository.insert(new Course(2, "Learn API", "in28mins"));
//	repository.insert(new Course(3, "Learn Algebra", "in28mins"));
//	repository.delete(1);
//	System.out.println(repository.selectById(3));
}
