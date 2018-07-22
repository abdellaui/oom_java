package java_command;

public class ActionSave implements ActionListenerCommand{
	private Document document;
	
	public ActionSave(Document doc){
		this.document = doc;
	}
	public void execute(){
		this.document.Save();
	}
}
