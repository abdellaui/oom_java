import java.util.*;
public class Vorlesung {
	public String bezeichnung;
	public String semester;
	public ArrayList<Student> studenten = new ArrayList<Student>();
	
	public Vorlesung(String b, String s){
		bezeichnung = b;
		semester = s;
	}
	public void studentHinzufuegen(Student s){
		studenten.add(s);
	}
	public void studentEnfernen(Student s){
		studenten.remove(s);
	}
	
	public Student sucheStudent(long matrikel){
		for(int i=0; i<studenten.size(); i++){
			Student s = studenten.get(i);
			if(s.matrikel == matrikel){
				return s;
			}
		}
		return null;
	}
	
}
