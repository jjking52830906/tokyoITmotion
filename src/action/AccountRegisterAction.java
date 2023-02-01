package action;

import java.sql.Date;

import db.AccountRegisterDBAccess;

public class AccountRegisterAction {

	public int execute(String fname, String lname, Date date, String radio, String fAddress, String lAddress, String tel) throws Exception {
		AccountRegisterDBAccess crdb = new AccountRegisterDBAccess();
		int res = crdb.registerAccount(fname, lname, date, radio, fAddress, lAddress, tel);
		return res;
	}
}
