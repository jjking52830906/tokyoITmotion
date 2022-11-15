package control;

import action.AccountRegisterAction;
import action.AkiSearchDisplayAction;
import action.LoginDisplayAction;
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
	
	public static void accountRegister(String id, String pass, String fname, String lname, String year, String month, String day, String fAddress, String lAddress, String tel) {
		AccountRegisterAction action = new AccountRegisterAction();
		int res = action.execute(id, pass, fname, lname, year, month, day, fAddress, lAddress, tel);
		return res;
	}
}
