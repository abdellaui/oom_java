package u09_composite_koffer;

import java.util.ArrayList;

public class Behaelter extends Objekte implements Gewichtung {

	
	protected ArrayList<Gewichtung> list;
	public Behaelter(String name, int gewicht) {
		super(name, gewicht);
		this.list = new ArrayList<Gewichtung>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getGewicht() {
		int returnWert = this.gewicht;
		System.out.println("Inhalt: "+  this.name);
		for(Gewichtung obj : this.list){
			System.out.println("    Gewicht: "+   obj.getGewicht());
			returnWert += obj.getGewicht();
		}
		return returnWert;
	}
	
	public void addObjekt(Gewichtung obj){
		this.list.add(obj);
	}

}
