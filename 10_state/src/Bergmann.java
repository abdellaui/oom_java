
public class Bergmann extends Charakter {
	
	final static int maxGeld = 5;
	final static int maxGold = 4;
	final static int maxDurst = 15;
	final static int maxSchlaf = 7;
	
	private int durst;
	private int erschoepfung;
	private int gold;
	private int geldInBank;
	
	private Standort standort;
	private State currentState;
	

	public boolean istReichGenug(){
		return (this.geldInBank>maxGeld);
	}
	public Bergmann(String name, Standort standort, int durst, int erschoepfung, int gold, int geldInBank,
			State currentState) {
		super(name);
		this.standort = standort;
		this.durst = durst;
		this.erschoepfung = erschoepfung;
		this.gold = gold;
		this.geldInBank = geldInBank;
		this.currentState = currentState;
	}
	public boolean istTascheVoll(){
		return (this.gold>maxGold);
	}
	
	public boolean durstig(){
		return (this.durst>maxDurst);
	}
	
	public boolean istAusgeschlafen(){
		return (this.erschoepfung>maxSchlaf);
	}
	
	public void update(){
		this.durst++;
		this.currentState.execute(this);
		
	}
	public int getDurst() {
		return durst;
	}
	public int getErschoepfung() {
		return erschoepfung;
	}
	public int getGold() {
		return gold;
	}
	public int getGeldInBank() {
		return geldInBank;
	}
	public Standort getStandort() {
		return standort;
	}
	public State getCurrentState() {
		return currentState;
	}
	public void setDurst(int durst) {
		this.durst = durst;
	}
	public void setErschoepfung(int erschoepfung) {
		this.erschoepfung = erschoepfung;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public void setGeldInBank(int geldInBank) {
		this.geldInBank = geldInBank;
	}
	public void setStandort(Standort standort) {
		this.standort = standort;
	}
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	


}
