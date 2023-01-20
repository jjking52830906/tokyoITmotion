package action;

import db.YoyakukakuninDBaccess;

public class YoyakukakuninAction {
	public Object[][] execute(int pass)throws Exception{
		
		YoyakukakuninDBaccess dao =  new YoyakukakuninDBaccess();
		Object[][] tableData = dao.yoyakuSearch(pass);
		
		
		return tableData;
	}
}
