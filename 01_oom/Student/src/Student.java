import java.util.*;
public class Student {
	public String name;
	public long matrikel;
	public Computer computer;
	public ArrayList<Vorlesung> vorlesung = new ArrayList<Vorlesung>();
	public Student(String n, long m){
		name = n;
		matrikel = m;
	}
	
	public void nimmtTeilAn(Vorlesung v){
		vorlesung.add(v);
	}
	public void entfenreVorlesung(Vorlesung v){
		vorlesung.remove(v);
	}
	public Vorlesung sucheVorlesung(String bezeichnung){
		for(int i=0; i<vorlesung.size(); i++){
			Vorlesung v = vorlesung.get(i);
			if(v.bezeichnung == bezeichnung){
				return v;
			}
		}
		return null;
	}
}
