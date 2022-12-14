package action;

import java.util.ArrayList;

import db.LoginNinshouDBAccess;
import model.ControlUtility;
import model.IdPass;

public class LoginNinshouAction {
	public String[] execute(String[] ipass)throws Exception{
		
		ipass[0] = ipass[0].replaceAll("　", "");
		ipass[0] = ipass[0].replaceAll(" ", "");
		ipass[1] = ipass[1].replaceAll("　", "");
		ipass[1] = ipass[1].replaceAll(" ", "");
		ArrayList<IdPass> list = null;
		LoginNinshouDBAccess dao = new LoginNinshouDBAccess();
		if(!ipass[0].equals("") && !ipass[1].equals("")) {
			list = dao.loginNinshou(ipass[0], ipass[1]);
		}
		String[] tableIpass = null;
		if(list != null && list.size() != 0) {
			tableIpass = ControlUtility.IdPassToArray(list);
		}
		return tableIpass;
	}
}
