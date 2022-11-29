package action;

import db.AccountRegisterDBAccess;

public class AccountRegisterAction {
	
	public int execute(String id, String fname, String lname, String year, String month, String day, String radio, String fAddress, String lAddress, String tel) throws Exception {
		AccountRegisterDBAccess crdb = new AccountRegisterDBAccess();
		int res = crdb.registerAccount(id, fname, lname, year, month, day, radio, fAddress, lAddress, tel);
		return res;
	}
}
