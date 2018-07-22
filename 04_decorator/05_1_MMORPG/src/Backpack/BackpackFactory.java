package Backpack;

import Item.Brot;

public class BackpackFactory {
 public static Backpack createBackpack(String type){
	 Backpack bp;
	 switch(type){
	 case "MagierBackpack": 
		 bp = new MagierBackpack();
		 break;
	 case "WaldlaueferBackpack": 
		 bp = new WaldlaueferBackpack();
		 break;
	 default:
		bp = new Backpack();
		break;
	 }
	 bp.addItem(new Brot());
	 return bp;
 }
}
