
public class AssoziationsTest {
	public static void main(String[] args){
		Student s1 = new Student("Peter Petersen", 108089288888L);
	
		CIPInsel c1 = new CIPInsel("IC 04/630");
		for(int i=0;i<10;i++){
			c1.computer[i] = new Computer("Dell OptiPlex 755 MT");
			c1.computer[i].cip = c1;
		}
		s1. computer = c1.computer[0];
		c1.computer[0].benutzer = s1;
		
	}

}
