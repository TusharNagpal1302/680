package edu.umb.cs680.hw11;

public class Car {

	private String model, make;
	private int mileage, year;
	private float price;
	private int count;
	
	public Car(String model, String make, int year, int mileage, float price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.mileage = mileage;
		this.price = price;
		this.count = 0;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public void setDominationCount(int count) {
		this.count = count;
	}
	
	public int getDominationCount() {
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Car class Successfully Run!!");
	}

}