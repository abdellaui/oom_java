package u09_composite_koffer;

public class Objekte {
	public String name;
	protected int gewicht;
	
	public Objekte(String name, int gewicht){
		this.name = name;
		this.gewicht = gewicht;
		System.out.println("name: " +name+"   gewicht:"+gewicht);
	}
}
