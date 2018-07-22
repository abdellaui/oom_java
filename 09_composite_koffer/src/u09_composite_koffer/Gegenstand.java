package u09_composite_koffer;

public class Gegenstand extends Objekte implements Gewichtung{

	
	public Gegenstand(String name, int gewicht) {
		super(name, gewicht);
		// TODO Auto-generated constructor stub
	}
	public int getGewicht(){
		return this.gewicht;
	}
	
}
