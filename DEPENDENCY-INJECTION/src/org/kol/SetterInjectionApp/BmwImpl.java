package org.kol.SetterInjectionApp;

import java.util.List;

public class BmwImpl implements ICar {

	private int carNumber;
	private String color;
	private List<String> wheels;
	private Engine engine;


	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}


	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


	public List<String> getWheels() {
		return wheels;
	}
	public void setWheels(List<String> wheels) {
		this.wheels = wheels;
	}


	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}



	@Override
	public void drive() {
		System.out.println("BMW SPECIFICATIONS");
		System.out.println("Registration Number:"+getCarNumber());
		System.out.println("Car Color:"+getColor());
		System.out.println("Wheels: "+getWheels());
		System.out.println("Engine:"+getEngine());
		System.out.println("Driving BMW Happily....");

	}

}
