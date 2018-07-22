package Charakter;

public class Magier implements Charakter{
	@Override
	public int getRüstungswert() {
		return 1;
	}

	@Override
	public void zeigeRüstungswert() {
		System.out.println("Magier: "+ this.getRüstungswert());
	}

}
