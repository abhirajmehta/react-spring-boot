package com.one.learn_spring.game;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class MarioGame implements GamingConsole {
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Sit");
	}
	public void left() {
		System.out.println("Back");
	}
	public void right() {
		System.out.println("Walk");
	}
}