package u09_composite;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Directory dir = new Directory("dir/");
		dir.add(new File("a", 1));
		dir.add(new File("a", 1));
		dir.add(new File("a", 1));
		dir.add(new File("a", 1));
		dir.add(new File("a", 1));
		dir.add(new File("a", 1));
		dir.add(new File("b", 1));
		dir.print();
		System.out.println("Groesse: " + dir.getSize());
		
		{
			
			Directory dirx = new Directory("disdr/");
			dirx.add(new File("a", 1));
			dirx.add(new File("sda", 1));
			dirx.add(new File("a", 1));
			dirx.add(new File("sda", 1));
			dirx.add(new File("saa", 1));
			dirx.add(new File("aa", 1));
			dirx.add(new File("b", 1));
			dirx.print();
			System.out.println("Groesse: " + dirx.getSize());
			
			
		}
	}

}
