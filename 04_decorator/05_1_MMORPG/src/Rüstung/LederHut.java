package Rüstung;

import Charakter.Charakter;

public class LederHut extends RüstungsDecorator {

	public LederHut(Charakter c) {
		super(c);
	}

	@Override
	public int getRüstungswert() {
		return c.getRüstungswert() + 5;
	}

	@Override
	public void zeigeRüstungswert() {
		System.out.println("LederHut: "+ this.getRüstungswert());
		
	}

}
