package java_command_stack;

public class TextEditor {
	private String text;
	
	public TextEditor(String text){
		this.text = text;
	}
	
	public void aendereText(String text){
		this.text = text;
		System.out.println(text);
	}
	public String getText(){
		return this.text;
	}
}
