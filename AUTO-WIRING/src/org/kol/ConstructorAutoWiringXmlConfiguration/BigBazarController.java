package org.kol.ConstructorAutoWiringXmlConfiguration;

import org.kol.ConstructorAutoWiringXmlConfiguration.Cosmetics;
import org.kol.ConstructorAutoWiringXmlConfiguration.Electronics;
import org.kol.ConstructorAutoWiringXmlConfiguration.Furniture;

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
