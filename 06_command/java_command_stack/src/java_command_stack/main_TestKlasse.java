package java_command_stack;

public class main_TestKlasse {

	public static void main(String[] args) {
		TextEditor editor = new TextEditor("hi");
		AppendTextCommand apcmd1 = new AppendTextCommand(editor, "new text1");
		AppendTextCommand apcmd2 = new AppendTextCommand(editor, "new text2");
		AppendTextCommand apcmd3 = new AppendTextCommand(editor, "new text3");
		CommandManager manager = new CommandManager();
		manager.executeCommand(apcmd1);
		manager.undo();
		manager.executeCommand(apcmd2);
		manager.executeCommand(apcmd3);
		manager.undo();
		manager.undo();

	}

}
