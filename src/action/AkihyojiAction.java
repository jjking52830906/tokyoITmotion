package action;

import java.util.ArrayList;

import db.AkiSearchDBAccess;
import model.ControlUtility3;
import model.Yoyaku;

public class AkihyojiAction {
	public Object[][] execute(String[] data)throws Exception{
		
		ArrayList<Yoyaku> list = null;
		AkiSearchDBAccess dao = new AkiSearchDBAccess();
		
		list = dao.akiSearch(data[0], data[1]);
		
		Object[][] tableData = null;
		tableData = ControlUtility3.AkihyojiToArray(list, data);
		return tableData;
	}
}
