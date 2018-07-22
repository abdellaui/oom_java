package java_command;

public class ActionOpen implements ActionListenerCommand{
	private Document document;
	public ActionOpen(Document doc){
		this.document = doc;
	}
	public void execute(){
		this.document.Open();
	}
}
