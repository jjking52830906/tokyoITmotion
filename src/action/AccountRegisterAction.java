package action;

import java.sql.Date;

import db.AccountRegisterDBAccess;

public class AccountRegisterAction {
	
	public int execute(String id, String pass, String fname, String lname, Date date, String radio, String fAddress, String lAddress, String tel) throws Exception {
		AccountRegisterDBAccess crdb = new AccountRegisterDBAccess();
		int res = crdb.registerAccount(id, pass, fname, lname, date, radio, fAddress, lAddress, tel);
		return res;
	}

	
}
