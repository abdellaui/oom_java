package u09_composite;

public class File implements FileSystemComponent{
	private String name;
	private int size;
	
	public File(String s, int i){
		this.name = s;
		this.size = i;
	}
	
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("name:"+this.name+" size:"+this.getSize());
	}

	public int getSize() {
		
		return this.size;
	}

}
