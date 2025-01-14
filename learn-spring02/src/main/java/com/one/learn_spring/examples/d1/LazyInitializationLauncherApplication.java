package com.one.learn_spring.examples.d1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
class ClassA{
	
}

@Lazy
@Component
class ClassB{
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Bean Initialization Logic goes here");
		this.classA = classA;
	}
	
	public void runLogic() {
		System.out.println("Some logic from class B is running");
	}
	
}


@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication{
	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}

	public static void main(String[] args) {
		
		
		
		try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println("Context is initialized");
			context.getBean(ClassB.class).runLogic();
		}

	}

}