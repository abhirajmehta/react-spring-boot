package com.one.learn_spring.examples.c1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldSpringContextLaunchApplication {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLaunchApplication.class)){
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}

	}

}
