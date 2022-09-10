package org.kol.ConstructorAutoWiringXmlConfigurationApp;

import org.kol.ConstructorAutoWiringXmlConfigurationApp.Cosmetics;
import org.kol.ConstructorAutoWiringXmlConfigurationApp.Electronics;
import org.kol.ConstructorAutoWiringXmlConfigurationApp.Furniture;

public class BigBazarController {
	
	private Electronics electronics;
	private Furniture furniture;
	private Cosmetics cosmetics;
	
	
	
	public BigBazarController(Electronics electronics, Furniture furniture, Cosmetics cosmetics) {
		super();
		this.electronics = electronics;
		this.furniture = furniture;
		this.cosmetics = cosmetics;
	}



	public void purchase() {

		electronics.mobile();
		furniture.sofa();
		cosmetics.lipsticks();

	}

}
