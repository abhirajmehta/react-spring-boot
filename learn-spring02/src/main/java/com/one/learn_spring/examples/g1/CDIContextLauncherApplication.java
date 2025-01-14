package com.one.learn_spring.examples.g1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named //---------------------------------------------------------------> CDI alternatives
class BusinessService{
	private DataService dataService;

	public DataService getDataService() {
		return dataService;
	}
	
//	@Autowired
	@Inject //---------------------------------------------------------------> CDI alternatives
	public void setDataService(DataService dataService) {
		System.out.println("Setter injection");
		this.dataService = dataService;
	}
	
	
}

//@Component
@Named //---------------------------------------------------------------> CDI alternatives
class DataService{
	
}

@Configuration
@ComponentScan
public class CDIContextLauncherApplication{
	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}

	public static void main(String[] args) {
		
		
		
		try (var context = new AnnotationConfigApplicationContext(CDIContextLauncherApplication.class)) {
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessService.class).getDataService());
		}

	}

}