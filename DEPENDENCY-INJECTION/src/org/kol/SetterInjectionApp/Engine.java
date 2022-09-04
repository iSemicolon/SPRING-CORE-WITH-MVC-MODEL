package org.kol.SetterInjectionApp;

public class Engine {

	private int engineNumber;
	private String engineType;
	private String engineModel;

	public int getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}


	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}


	public String getEngineModel() {
		return engineModel;
	}
	public void setEngineModel(String engineModel) {
		this.engineModel = engineModel;
	}


	@Override
	public String toString() {
		return "Engine [engineNumber=" + engineNumber + ", engineType=" + engineType + ", engineModel=" + engineModel
				+ "]";
	}




}
