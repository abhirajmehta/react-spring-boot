package com.one.learn_spring.examples.c1;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySQLDataService implements DataService{

	@Override
	public int[] retriveData() {
		// TODO Auto-generated method stub
		return new int[] {5, 4, 3, 2, 1};
	}

}
