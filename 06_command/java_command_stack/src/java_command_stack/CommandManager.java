package java_command_stack;

import java.util.Stack;

public class CommandManager {
	private Stack<EditorCommand> undoItems = new Stack<EditorCommand>();
	public void executeCommand(EditorCommand cmd){
		undoItems.push(cmd);
		cmd.execute();
	}
	public void undo(){
		undoItems.pop().undo();
	}
}
