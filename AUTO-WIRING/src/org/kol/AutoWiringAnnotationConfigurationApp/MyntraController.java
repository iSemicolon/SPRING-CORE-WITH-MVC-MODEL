package org.kol.AutoWiringAnnotationConfigurationApp;

import org.springframework.beans.factory.annotation.Autowired;

public class MyntraController {

	@Autowired
	private Electronics electronics;
	@Autowired
	private Furniture furniture;
	@Autowired
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
