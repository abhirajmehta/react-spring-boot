package com.one.learn_spring.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//Try with resources - if there is any exception, try.close() will be automatically called
		//1: Launch a Spring context - 
		try( var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
		
			//2: Configure things we want Spring to manage for us - @Configuration class
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("man"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean(Address.class)); //----> You can call same bean by class name as well
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
		}
	}

}
