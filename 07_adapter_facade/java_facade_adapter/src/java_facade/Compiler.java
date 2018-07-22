package java_facade;

public class Compiler {
	private Parser parser;
	private Assembler assembler;
	private Linker linker;
	
	public void compile(String sourceFile){
		System.out.println("compile"  + sourceFile);
		this.parser = new Parser();
		this.assembler = new Assembler();
		this.linker = new Linker();
		
		this.parser.parse(sourceFile);
		compileInternal(sourceFile);
		this.assembler.assemble(sourceFile);
		this.linker.link(sourceFile);
	}
	
	private void compileInternal(String sourceFile){
		System.out.println("compileInternal"  + sourceFile);
	}
}
