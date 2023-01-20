package action;

import java.util.ArrayList;

import db.AkiSearchDBAccess;
import model.ControlUtility2;
import model.Yoyaku;

public class AkiSearchAction {
	public Object[][] execute(String[] data)throws Exception{
		
		ArrayList<Yoyaku> list = null;
		AkiSearchDBAccess dao = new AkiSearchDBAccess();
		
		list = dao.akiSearch(data[0], data[1]);
		Object[][] tableData = null;
		tableData = ControlUtility2.akiSearchToTable(list, data);
		return tableData;
	}
}
