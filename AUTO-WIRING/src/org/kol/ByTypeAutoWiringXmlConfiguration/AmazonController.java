package org.kol.ByTypeAutoWiringXmlConfiguration;

import org.kol.ByTypeAutoWiringXmlConfiguration.Cosmetics;
import org.kol.ByTypeAutoWiringXmlConfiguration.Electronics;
import org.kol.ByTypeAutoWiringXmlConfiguration.Furniture;

public class AmazonController {
	
	private Electronics electronics;
	private Furniture furniture;
	private Cosmetics cosmetics;



	public Electronics getElectronics() {
		return electronics;
	}

	public void setElectronics(Electronics electronics) {
		this.electronics = electronics;
	}



	public Furniture getFurniture() {
		return furniture;
	}

	public void setFurniture(Furniture furniture) {
		this.furniture = furniture;
	}



	public Cosmetics getCosmetics() {
		return cosmetics;
	}

	public void setCosmetics(Cosmetics cosmetics) {
		this.cosmetics = cosmetics;
	}



	public void purchase() {

		electronics.mobile();
		furniture.sofa();
		cosmetics.lipsticks();

	}


}
