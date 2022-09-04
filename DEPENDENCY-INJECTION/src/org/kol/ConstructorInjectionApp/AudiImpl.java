package org.kol.ConstructorInjectionApp;

public class AudiImpl implements ICar {

	public AudiImpl() {

		System.out.println("Audi Object Created");
	}

	@Override
	public void drive() {

		System.out.println("Driving Audi Happily");		
	}


}
