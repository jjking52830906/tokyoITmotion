package action;

import java.util.ArrayList;

import db.YoyakuGetCustNameDBAccess;
import db.YoyakukakuninDBaccess;
import model.ControlUtility4;
import model.Customer;
import model.Yoyaku;

public class YoyakukakuninAction {
	public Object[][] execute(int pass)throws Exception{
		
		ArrayList<Yoyaku> list = null;
		ArrayList<Customer> list1 = null;
		
		YoyakukakuninDBaccess dao =  new YoyakukakuninDBaccess();
		YoyakuGetCustNameDBAccess dao1 = new YoyakuGetCustNameDBAccess();
		
		list = dao.yoyakuSearch(pass);
		list1 = dao1.yoyakuGetCustName(pass);
		
		Object[][] tableData = null;
		tableData = ControlUtility4.yoyakuToTable(list, list1);
		
		return tableData;
	}
}
