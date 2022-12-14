package model;

import java.util.ArrayList;

public class ControlUtility2 {
	public static String[][] akiSearchToArray(ArrayList<Yoyaku>list){
		int listSize = list.size();
		String[][] tableData = new String[listSize][3];
			
		for(int i=0; i<listSize; i++) {
			Yoyaku yoyaku = list.get(i);
			tableData[i][0] = yoyaku.getStrDate();
			tableData[i][1] = yoyaku.getHour();
			tableData[i][2] = yoyaku.getBasho();
		}
		
		return tableData;
	}
}
