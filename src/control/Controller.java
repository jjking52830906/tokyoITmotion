package control;

import action.AccountRegisterAction;
import action.AkiSearchDisplayAction;
import action.LoginDisplayAction;
import action.MainMenuDisplayAction;
import action.PasswordRegisterAction;
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
	
	public static int accountRegister(String id, String fname, String lname, String year, String month, String day ,String radio, String fAddress, String lAddress, String tel) throws Exception {
		AccountRegisterAction action = new AccountRegisterAction();
		int res = action.execute(id, fname, lname, year, month, day, radio, fAddress, lAddress, tel);
		return res;
	}
	
	public static int passwordRegister(String pass) throws Exception {
		PasswordRegisterAction action = new PasswordRegisterAction();
		int rel = action.execute(pass);
		return rel;
	}
	
}
