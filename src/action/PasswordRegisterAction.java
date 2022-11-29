package action;

import db.PasswordRegisterDBAccess;

public class PasswordRegisterAction {
	public int execute(String pass)throws Exception{
		PasswordRegisterDBAccess crdb = new PasswordRegisterDBAccess();
		int rel = crdb.passwordRegister(pass);
		return rel;
	}
}
