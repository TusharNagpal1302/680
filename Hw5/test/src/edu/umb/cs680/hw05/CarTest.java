package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	private String[] carToStringArray(Car c) {
		String model = c.getModel();
		String make = c.getMake();
		String year = "" + c.getYear();
		return new String[]{model, make, year};
	}
	
	@Test
	public void verifyCarEqualityWithMakeModelYear() {
		String[] expected = {"Honda", "Civic", "2018"};
		
		Car actual = new Car("Honda", "Civic", 2018);
		
		assertArrayEquals(expected,carToStringArray(actual) );
	}

}
