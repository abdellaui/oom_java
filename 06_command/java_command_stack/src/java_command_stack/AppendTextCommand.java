package java_command_stack;

public class AppendTextCommand implements EditorCommand {
	private String textAlt;
	private String textToAppend;
	private TextEditor editor;
	
	public AppendTextCommand(TextEditor editor, String text){
		this.editor = editor;
		//this.textAlt = this.editor.getText();
		this.textToAppend = text;
	}
	@Override
	public void execute() {
		this.textAlt = this.editor.getText();
		this.editor.aendereText(this.textAlt+this.textToAppend);
	}

	@Override
	public void undo() {
		this.editor.aendereText(textAlt);
	}

}
