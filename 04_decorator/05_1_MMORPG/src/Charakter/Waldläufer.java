package Charakter;

public class Waldläufer implements Charakter{
	@Override
	public int getRüstungswert() {
		return 10;
	}

	@Override
	public void zeigeRüstungswert() {
		System.out.println("Waldläufer: "+ this.getRüstungswert());
	}

}
