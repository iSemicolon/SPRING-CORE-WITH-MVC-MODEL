package org.kol.ConstructorAutoWiringXmlConfiguration;

import org.kol.ByNameAutoWiringXmlConfiguration.Cosmetics;
import org.kol.ByNameAutoWiringXmlConfiguration.Electronics;
import org.kol.ByNameAutoWiringXmlConfiguration.Furniture;

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
