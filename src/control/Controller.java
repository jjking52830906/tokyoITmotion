package control;

import java.sql.Date;

import action.AccountRegisterAction;
import action.AkiSearchDisplayAction;
import action.IDPassRegisterAction;
import action.LoginDisplayAction;
import action.LoginNinshouAction;
import action.LoginafterDisplayAction;
import action.MainMenuDisplayAction;
import action.RegisterDisplayAction;
import action.YoyakuDisplayAction;

public class Controller {

	public static void loginDisplay() {
		LoginDisplayAction action = new LoginDisplayAction();
		action.execute();
	}
	
	public static void mainMenuDisplay() {
		MainMenuDisplayAction action = new MainMenuDisplayAction();
		action.execute();
	}
	
	public static void registerDisplay() {
		RegisterDisplayAction action = new RegisterDisplayAction();
		action.execute();
	}
	
	public static void yoyakuDisplay() {
		YoyakuDisplayAction action = new YoyakuDisplayAction();
		action.execute();
	}
	
	public static void AkiSearchDisplay() {
		AkiSearchDisplayAction action = new AkiSearchDisplayAction();
		action.execute();
	}
	
	public static int accountRegister(String fname, String lname, Date date, String radio, String fAddress, String lAddress, String tel) throws Exception {
		AccountRegisterAction action = new AccountRegisterAction();
		int res = action.execute(fname, lname, date, radio, fAddress, lAddress, tel);
		return res;
	}
	
	public static String[][] ninshou(String[] data)throws Exception{
		LoginNinshouAction action = new LoginNinshouAction();
		String[][] tableData = action.execute(data);
		return tableData;
	}
	
	public static void LoginafterDisplay() {
		LoginafterDisplayAction action = new LoginafterDisplayAction();
		action.execute();
	}
	
	public static int idpassRegister(String id, String pass) throws Exception{
		IDPassRegisterAction action = new IDPassRegisterAction();
		int rel = action.execute(id, pass);
		return rel;
	}
}
