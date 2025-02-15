
public class Quader {
	private double laenge;
	private double breite;
	private double hoehe;
	private double dichte;
	public Quader(){};
	
	public Quader(double a, double b, double c, double e){
		this.laenge = a;
		this.breite = b;
		this.hoehe = c;
		this.dichte =e;		
	}
	public Quader(double a){
		this.laenge = a;
		this.dichte = 1.0;		
	}
	public void setLaenge(double a){
		this.laenge = a;	
	}
	public void setBreite(double a){
		this.breite = a;	
	}
	public void setHoehe(double a){
		this.hoehe = a;	
	}
	public void setDichte(double a){
		this.dichte = a;	
	}
	
	public double getLaenge(){
		return this.laenge;	
	}
	public double getBreite(){
		return this.breite;	
	}
	public double getHoehe(){
		return this.hoehe;	
	}
	public double getDichte(){
		return this.dichte;	
	}
	public double berechneVolumen(){
		return laenge*breite*hoehe;
	}
	public double oberflaeche(){
		return 2*(laenge*breite + breite*hoehe +laenge * hoehe);
	}
	public double berechneDichte(){
		return this.berechneVolumen()*100/this.dichte;
	}
}
