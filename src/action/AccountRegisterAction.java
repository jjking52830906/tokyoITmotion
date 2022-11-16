package action;

import db.AccountRegisterDBAccess;

public class AccountRegisterAction {
	public int execute(String id, String pass, String fname, String lname, String year, String month, String day, String radio, String fAddress, String lAddress, String tel) {
		AccountRegisterDBAccess ordb = new AccountRegisterAccess();
		int res = crdb.registerAccount(id, pass, fname, lname, year, month, day, radio, fAddress, lAddress, tel);
		return res;
	}
}
