package model;

import java.sql.Date;
import java.util.ArrayList;

public class ControlUtility3 {
	public static Object[][] AkihyojiToArray(ArrayList<Yoyaku>list, String[] data)throws Exception{
		//ステータス１のデータ
		int listSize = list.size();
		int[] getHour = new int[listSize];
		if(listSize != 0) {
			for(int i=0; i<listSize;i++) {
				Yoyaku yoyaku = list.get(i);
				getHour[i] = yoyaku.getHour();
			}
		}
		//入れるデータ
		Date date = Date.valueOf(data[0]);
		int hour = 9;
		String bashoName = null;
		
		Object[][] tableData = new Object[13][4];
		
		if(listSize == 0) {
			for(int i=0; hour <= 21; i++) {
				tableData[i][0] = new Boolean(false);
				tableData[i][1] = date;
				tableData[i][2] = hour;
				int bashoId = Integer.parseInt(data[1]);
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
				hour++;
			}
		}else{
			for(int j=0 ;j<listSize; j++) {
				if(getHour[j] != hour) {
					for(int i=0; hour <= 21; i++) {
						tableData[i][0] = new Boolean(false);
						tableData[i][1] = date;
						tableData[i][2] = hour;
						int bashoId = Integer.parseInt(data[1]);
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
						hour++;
					}
				}
			}
		}
		
		return tableData;
		
	}
}
