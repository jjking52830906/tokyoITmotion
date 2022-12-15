package action;

import db.LoginNinshouDBAccess;

public class LoginNinshouAction {
	public int execute(String id, String pass)throws Exception{
		
		LoginNinshouDBAccess crdb = new LoginNinshouDBAccess();
		int nin = crdb.loginNinshou(id, pass);
		return nin;
	}
}
