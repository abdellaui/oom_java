package Backpack;
import java.util.ArrayList;

import Item.*;

public class Backpack {
	public ArrayList<Item> items = new ArrayList<Item>();
	public void listItems(){
		for (Item item : this.items) {
			item.toString();
		}
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
}
