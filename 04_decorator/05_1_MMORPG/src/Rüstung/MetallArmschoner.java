package Rüstung;

import Charakter.Charakter;

public class MetallArmschoner extends RüstungsDecorator {

	public MetallArmschoner(Charakter c) {
		super(c);
	}

	@Override
	public int getRüstungswert() {
		return c.getRüstungswert() + 20;
	}

	@Override
	public void zeigeRüstungswert() {
		System.out.println("MetallArmschoner: "+ this.getRüstungswert());
		
	}

}
