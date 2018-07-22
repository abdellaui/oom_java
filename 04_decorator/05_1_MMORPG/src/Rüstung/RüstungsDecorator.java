package Rüstung;
import Charakter.Charakter;

public abstract class RüstungsDecorator implements Charakter{
	protected Charakter c;
	public RüstungsDecorator(Charakter c){
		this.c =c;
	}
}
