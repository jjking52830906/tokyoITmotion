package action;

import db.SelectBashoIdDBAccess;

public class selectBashoIdAction {
	public int execute(String bashoName)throws Exception {
		SelectBashoIdDBAccess  crdb = new SelectBashoIdDBAccess();
		int bashoId = crdb.selectBashoId(bashoName);
		return bashoId;
	}
}
