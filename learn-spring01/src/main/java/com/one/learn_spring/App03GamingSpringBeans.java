package com.one.learn_spring;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.one.learn_spring.game.GameRunner;
import com.one.learn_spring.game.GamingConsole;
import com.one.learn_spring.game.MarioGame;
import com.one.learn_spring.game.PacmanGame;
import com.one.learn_spring.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
