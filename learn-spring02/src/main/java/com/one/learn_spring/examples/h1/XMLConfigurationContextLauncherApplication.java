package com.one.learn_spring.examples.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.one.learn_spring.game.GameRunner;

//@Configuration //---------------------------------------------> Indicates that Java XML is being used
//ComponentScan
public class XMLConfigurationContextLauncherApplication{

	public static void main(String[] args) {
		
		
		//The AnnotationConfigApplicationContext is used to launch a Java configuration file
		//var context = new AnnotationConfigApplicationContext(XMLConfigurationContextLauncherApplication.class)
		
		try (var context = new ClassPathXmlApplicationContext("ContextConfiguration.xml")) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("game"));
			
			context.getBean(GameRunner.class).run();
		}

	}

}