
public abstract class Charakter {
	private String name;
	public Charakter(String name){
		this.setName(name);
	}
	public abstract void update();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
