package action;

import db.LoginRegisterDBAccess;

public class LoginRegisterAction {
	public int execute(String id, String pass)throws Exception{
		LoginRegisterDBAccess crdb = new LoginRegisterDBAccess();
		int rel = crdb.registerLogin(id, pass);
		return rel;
	}
}
