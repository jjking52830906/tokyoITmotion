package model;

import java.util.ArrayList;

public class ControlUtility2{
	public static Object[][] akiSearchToArray(ArrayList<Yoyaku>list){
		int listSize = list.size();
		Object[][] tableData = new Object[listSize][4];
		String bashoName = null;
		
			
		for(int i=0; i<listSize; i++) {
			Yoyaku yoyaku = list.get(i);
			tableData[i][0] = new Boolean (false);
			tableData[i][1] = yoyaku.getStrDate();
			tableData[i][2] = yoyaku.getHour();
			
			int bashoId = yoyaku.getBashoId();
			if(bashoId == 1) {
				bashoName = "体育館";
			}else if(bashoId == 2) {
				bashoName = "野球場";
			}else if(bashoId == 3) {
				bashoName = "サッカー場";
			}else if(bashoId == 4) {
				bashoName = "テニスコート";
			}else if(bashoId == 5) {
				bashoName = "プール";
			}
			
			tableData[i][3] = bashoName;
		}
		
		
		return tableData;
		
		
	}
	
	

	
	
	
}
