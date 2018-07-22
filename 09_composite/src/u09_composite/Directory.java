package u09_composite;
import java.util.ArrayList;
public class Directory implements FileSystemComponent{
	private String name;
	private ArrayList<FileSystemComponent> arr = new ArrayList<FileSystemComponent>();
	
	public Directory(String s){
		this.name = s;
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("name:"+this.name);
		for(FileSystemComponent f : arr){
			f.print();
		}
	}

	public int getSize() {
		int c = 0;
		for(FileSystemComponent f : arr){
			c += f.getSize();
		}
		return c;
	}

	public void add(FileSystemComponent f){
		arr.add(f);
		
		
	}
	
	public void remove(FileSystemComponent f){
		arr.remove(f);
	}
}
