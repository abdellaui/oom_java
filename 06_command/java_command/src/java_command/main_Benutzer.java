package java_command;

public class main_Benutzer {

	public static void main(String[] args) {
		Document d = new Document();
		ActionListenerCommand open = new ActionOpen(d);
		ActionListenerCommand save = new ActionSave(d);
		MenuOptionen menu = new MenuOptionen(open, save);
		menu.clickOpen();
		menu.clickSave();
	}

}
