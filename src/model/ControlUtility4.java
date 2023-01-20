package model;

import java.util.ArrayList;

public class ControlUtility4 {
	public static Object[][] yoyakuToTable(ArrayList<Yoyaku>list, ArrayList<Customer>list1)throws Exception{
		Object[][] tableData = new Object[list.size()][4];
		String firstName = null;
		String lastName = null;
		for(int i=0; i<list1.size(); i++) {
			Customer customer = list1.get(i);
			firstName = customer.getFirstName();
			lastName = customer.getLastAddress();
		}
		String custName = firstName + lastName;
		for(int i=0; i<list.size(); i++) {
			Yoyaku yoyaku = list.get(i);
			tableData[i][0] = custName;
			tableData[i][1] = yoyaku.getDate();
			tableData[i][2] = yoyaku.getHour();
			int getbashoId = yoyaku.getBashoId();
			String bashoName = null;
			if(getbashoId = 1) {
				bashoName = "体育館";
			}else if (getbashoId = 2) {
				
			}
			tableData[i][3] = yoyaku.getBashoId();
		}
		
		return tableData;
	}
}
