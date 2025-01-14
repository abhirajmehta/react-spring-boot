package com.one.learn_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.one.learn_spring.game.GameRunner;
import com.one.learn_spring.game.GamingConsole;
import com.one.learn_spring.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner() {
		var gameRunner = new GameRunner(game());
		return gameRunner;
	}
	
}