package action;

import java.util.ArrayList;

import db.LoginNinshouDBAccess;
import model.Customer;

public class LoginNinshouAction {
	public String[][] execute(String[] data)throws Exception{
		
		data[0] = data[0].replaceAll("　", "");
		data[0] = data[0].replaceAll(" ", "");
		data[1] = data[1].replaceAll("　", "");
		data[1] = data[1].replaceAll(" ", "");
		ArrayList<Customer> list = null;
		LoginNinshouDBAccess dao = new LoginNinshouDBAccess();
		if(!data[0].equals("") && !data[1].equals("")) {
			list = dao.loginNinshou(data[0], data[1]);
		}
		String[][] tableData = null;
		if(list != null)
		
		return tableData;
	}
}
