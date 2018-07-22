
public abstract class Trikot {
	private String grundfarbe;
	private String stoff;
	private int nummer;
	private String name;
	
	public Trikot(String a, String b, int i, String c){
		this.grundfarbe = a;
		this.stoff =b;
		this.nummer = i;
		this.name = c;
	}
	
	public void erstellen(){
		System.out.println("erstelle Trikot mit: Farbe"+ this.grundfarbe +" Stoff:" +this.stoff);
		
		schnittErstellen();
		naehen();
		name();
		logo();
		patches();
		deko();
	}
	public void schnittErstellen(){
		System.out.println("schnittErstellen");
	}
	public void naehen(){
		System.out.println("naehen");
	}
	public void name(){
		System.out.println(this.nummer+"  name: " + this.name);
	}
	public abstract void logo();
	public abstract void patches();
	public void deko(){};
	
}
