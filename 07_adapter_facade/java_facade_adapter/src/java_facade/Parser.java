package java_facade;

public class Parser {
	private Scanner scanner;
	public void parse(String sourceFile){
		    System.out.println("parse"  + sourceFile);
			this.scanner = new Scanner();
			scanner.scan(sourceFile);
	}
}
