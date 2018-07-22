package Backpack;

import Item.*;

public class MagierBackpack extends Backpack {
	public MagierBackpack(){
		addItem(new Manatrank());
		addItem(new Wasser());
	}
}
