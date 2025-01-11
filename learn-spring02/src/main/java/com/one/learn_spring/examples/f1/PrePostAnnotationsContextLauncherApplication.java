package com.one.learn_spring.examples.f1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class SomeClass{
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependecies are ready!");
	}
	
	@PostConstruct
	public void initialization() {
		someDependency.getReady();
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Cleaning data");
	}
	
}


@Component
class SomeDependency{
	
	public void getReady() {
		System.out.println("Some logic of some dependency");
	}
	
}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication{

	public static void main(String[] args) {
		
		
		
		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}

}