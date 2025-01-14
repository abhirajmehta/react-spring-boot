package com.one.learn_spring.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String firstLine,String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Abhishek";
	}
	
	@Bean
	public int age() {
		return 24;
	}
	
	@Bean(name = "man") // --------------> You can give a custom name to the Bean to be called in the context
	public Person person() {
		return new Person("Ravi", 28, address2());
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), new Address("Wakad", "Pune")); // ------------> You can even call methods to pass into the Bean
	}
	
	@Bean
	@Primary
	public Person person3Parameters(String name, int age, Address address) {// ----> You can pass name of the Beans as parameters as well
		return new Person(name, age, address);
	}
	
	@Bean
	public Person person4Qualifier(String name, int age, @Qualifier("addressQualifier") Address address) {// ----> You can pass qualifier along with Bean as a parameter to use that particular Bean
		return new Person(name, age, address);
	}
	
	@Bean
	@Primary
	public Address address2() {
		return new Address("Baker Street", "London");
	}
	
	@Bean
	@Qualifier("addressQualifier")
	public Address address3() {
		return new Address("Baker Street", "London");
	}
	
}
