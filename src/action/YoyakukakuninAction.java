package action;

import db.YoyakukakuninDBaccess;

public class YoyakukakuninAction {
	public Object[][] execute(int pass)throws Exception{
		
		YoyakukakuninDBaccess dao =  new YoyakukakuninDBaccess();
		String[][] tableData = (String[][]) dao.yoyaku(pass);
		return tableData;
	}
}
