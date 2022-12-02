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
		
		
		return tableData;
	}
}
