package org.kol.ConstructorInjectionApp;

public class Engine {

	private int engineNumber;
	private String engineType;
	private String engineModel;


	public Engine(int engineNumber, String engineType, String engineModel) {
		super();
		this.engineNumber = engineNumber;
		this.engineType = engineType;
		this.engineModel = engineModel;
	}


	@Override
	public String toString() {
		return "Engine [engineNumber=" + engineNumber + ", engineType=" + engineType + ", engineModel=" + engineModel
				+ "]";
	}




}
