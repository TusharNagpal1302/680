package edu.umb.cs680.hw14;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

class CarTest {

private List<Car> list = new ArrayList<>();
	
	void before() {
		list.add(new Car("Honda", "Civic", 2019, 10000, 15));
		list.add(new Car("BMW", "520", 2018, 2050, 12));
		list.add(new Car("Audi", "A3", 2005, 10000, 7));
		list.add(new Car("Toyota", "RAV4", 2020, 53000, 14));
	}
	
	@Test
	public void sortUsingPriceComparator() {
		before();
		Car car  = list.get(0);
		Comparator<Car> groupByComparator = Comparator.comparing(Car::getPrice);
		Collections.sort(list, groupByComparator);
		
			
		assertNotEquals(car.getModel(), list.get(0).getModel());
	}
	

	@Test
	public void sortUsingYearComparator() {
		before();
		Car car  = list.get(0);
		Comparator<Car> groupByComparator = Comparator.comparing(Car::getYear);
		Collections.sort(list, groupByComparator);
		
			
		assertNotEquals(car.getModel(), list.get(0).getModel());
	}
	
	@Test
	public void sortUsingMileageComparator() {
		before();
		Car car  = list.get(0);
		Comparator<Car> groupByComparator = Comparator.comparing(Car::getMileage);
		Collections.sort(list, groupByComparator);
		
			
		assertNotEquals(car.getModel(), list.get(0).getModel());
	}
	
	@Test
	public void sortUsingMileageComparatorReversed() {
		before();
		Car car  = list.get(1);
		Comparator<Car> groupByComparator = Comparator.comparing(Car::getMileage, Comparator.reverseOrder());
		Collections.sort(list, groupByComparator);
		
			
		assertNotEquals(car.getModel(), list.get(1).getModel());
	}
	
	@Test
	public void sortUsingComparator() {
		before();
		Car car  = list.get(0);
		Comparator<Car> groupByComparator = Comparator.comparing(Car::getDominationCount);
		
		int count =5;
		
		for(Car carloop: list) {
			carloop.setDominationCount(count--); 
		}
		
		Collections.sort(list, groupByComparator);
		
			
		assertNotEquals(car.getModel(), list.get(0).getModel());
	}

}
