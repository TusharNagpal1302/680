package edu.umb.cs680.hw11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class MileageComparatorTest {

ArrayList<Car> usedCars= new ArrayList<Car>();
	
	private void befor() {
		usedCars.add(new Car("Toyota", "Camry", 2015, 10, 50000));
		usedCars.add(new Car("Honda", "Civic", 2019, 15, 31000));
		usedCars.add(new Car("Mercedes", "GL500", 2018, 7, 100000));
		usedCars.add(new Car("Audi", "R8Spider", 2014, 10, 2500000));
		usedCars.add(new Car("Bmw", "320", 2016, 12, 35000));
	}
	
	@Test
	void verifyMileageComparator() {
		befor();
		ArrayList<Car> beforeCars = (ArrayList<Car>) usedCars.clone();
		Collections.sort(usedCars, new MileageComparator());
		assertNotEquals(beforeCars.get(0).getModel(), usedCars.get(0).getModel());
	}

}
