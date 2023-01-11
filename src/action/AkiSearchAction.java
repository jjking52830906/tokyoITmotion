package action;

import java.util.ArrayList;

import db.AkiSearchDBAccess;
import model.ControlUtility2;
import model.Yoyaku;

public class AkiSearchAction {
	public Object[][] execute(String[] data)throws Exception{
		
		ArrayList<Yoyaku> list = null;
		AkiSearchDBAccess dao = new AkiSearchDBAccess();
		//日付と場所IDが一致しておりかつステータスが0、custIdがnullの状態
		list = dao.akiSearch(data[0], data[1]);
		
		Object[][] tableData = null;
		if(list != null && list.size() != 0) {
			tableData = ControlUtility2.akiSearchToArray(list);
		}
		
		return tableData;
	}
}
