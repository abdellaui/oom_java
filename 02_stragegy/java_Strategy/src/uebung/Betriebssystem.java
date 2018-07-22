package uebung;

public class Betriebssystem {
	private Strategie strategie;
	public Betriebssystem(Strategie s){
		this.strategie = s;
	}
	public String toString(){
		return strategie.getOS();
	}
}
