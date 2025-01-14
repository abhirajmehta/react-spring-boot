package com.one.learn_spring.game;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class GameRunner {
	
	private GamingConsole game;
	
	public GameRunner(@Qualifier("SperContraGameQualifier") GamingConsole game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}
	
	public void run() {
		System.out.println("Game is running : " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}