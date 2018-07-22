package Rüstung;
import Charakter.Charakter;

public class StoffBeine extends RüstungsDecorator {

	public StoffBeine(Charakter c) {
		super(c);
	}

	@Override
	public int getRüstungswert() {
		return c.getRüstungswert() + 3;
	}

	@Override
	public void zeigeRüstungswert() {
		System.out.println("StoffBeine: "+ this.getRüstungswert());
		
	}
	

}
