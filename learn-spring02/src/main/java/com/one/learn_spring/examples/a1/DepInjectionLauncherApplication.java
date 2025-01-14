package com.one.learn_spring.examples.a1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{
	
	
	Dependency1 dependency1;
	
	Dependency2 dependency2;
	
	
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Contrustor injection");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	
	

//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Dep1 setter injection");
//		this.dependency1 = dependency1;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Dep2 setter injection");
//		this.dependency2 = dependency2;
//	}
//
//
//
//	public String toString() {
//		return "Using " + dependency1 + " and " + dependency2;
//	}
}

@Component
class Dependency1{
	
}

@Component
class Dependency2{
	
}



@Configuration
@ComponentScan
public class DepInjectionLauncherApplication{

	public static void main(String[] args) {
		
		
		
		try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(YourBusinessClass.class));
		}

	}

}