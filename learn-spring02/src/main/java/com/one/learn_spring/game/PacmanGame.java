package com.one.learn_spring.game;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class PacmanGame implements GamingConsole{
	public void up() {
		System.out.println("Pac-up");
	}
	public void down() {
		System.out.println("Pac-down");
	}
	public void left() {
		System.out.println("Pac-back");
	}
	public void right() {
		System.out.println("Pac-forth");
	}
	
}