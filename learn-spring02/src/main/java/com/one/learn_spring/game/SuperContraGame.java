package com.one.learn_spring.game;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("SperContraGameQualifier")
public class SuperContraGame implements GamingConsole{
	public void up() {
		System.out.println("Up");
	}
	public void down() {
		System.out.println("Down");
	}
	public void left() {
		System.out.println("Backwards");
	}
	public void right() {
		System.out.println("Forwards");
	}
}