package org.kol.ConstructorInjectionApp;

import java.util.List;

public class BmwImpl implements ICar {

	private int carNumber;
	private String color;
	private List<String> wheels;
	private Engine engine;

	
	public BmwImpl(int carNumber, String color, List<String> wheels, Engine engine) {
		super();
		this.carNumber = carNumber;
		this.color = color;
		this.wheels = wheels;
		this.engine = engine;
	}


	@Override
	public void drive() {
		System.out.println("BMW SPECIFICATIONS");
		System.out.println("Registration Number:"+carNumber);
		System.out.println("Car Color:"+color);
		System.out.println("Wheels: "+wheels);
		System.out.println("Engine:"+engine);
		System.out.println("Driving BMW Happily....");

	}

}
