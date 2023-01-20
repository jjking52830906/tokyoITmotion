package model;

import java.util.ArrayList;

public class ControlUtility4 {
	public static Object[][] yoyakuToTable(ArrayList<Yoyaku>list, ArrayList<Customer>list1)throws Exception{
		Object[][] tableData = new Object[list.size()][4];
		String[] firstName = new String[list1.size()];
		String[] lastName = new String[list1.size()];
		for(int i=0; i<list1.size(); i++) {
			Customer customer = list1.get(i); 
			firstName[i] = customer.getFirstName();
			lastName[i] = customer.getLastName();
		}
		String custName = lastName[0] + " " + firstName[0];
		for(int i=0; i<list.size(); i++) {
			Yoyaku yoyaku = list.get(i);
			tableData[i][0] = custName;
			tableData[i][1] = yoyaku.getDate();
			tableData[i][2] = yoyaku.getHour();
			int getbashoId = yoyaku.getBashoId();
			String bashoName = null;
			if(getbashoId == 1) {
				bashoName = "体育館";
			}else if(getbashoId == 2) {
				bashoName = "野球場";
			}else if(getbashoId == 3) {
				bashoName = "サッカー場";
			}else if(getbashoId == 4) {
				bashoName = "テニスコート";
			}else if(getbashoId == 5) {
				bashoName = "プール";
			}
			tableData[i][3] = bashoName;
		}
		
		return tableData;
	}
}
