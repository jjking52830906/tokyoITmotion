package control;

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
}
