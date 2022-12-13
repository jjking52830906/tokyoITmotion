package action;

import java.sql.Date;
import java.util.ArrayList;

import db.AkiSearchDBAccess;
import model.Yoyaku;

public class AkiSearchAction {
	public String[][][][] execute(String[] data)throws Exception{
		ArrayList<Yoyaku> list = null;
		AkiSearchDBAccess dao = new AkiSearchDBAccess();
		String strDate = data[0];
		Date date = Date.valueOf(strDate);
		list = dao.akiSearch(date, data[1], data[2], data[3]);
		
		String[][][][] tableData = null;
		if(list != null && list.size() != 0) {
			tableData = 
		}
		
		return tableData;
	}
}
