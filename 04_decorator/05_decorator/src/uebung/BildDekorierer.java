package uebung;

public abstract class BildDekorierer extends Bild{
	protected Bild bild;
	public BildDekorierer (Bild bild){
	this.bild = bild;
	}
	
	public abstract int [][] getDaten();
}
