package control;

import action.MainMenuDisplayAction;

public class Controller {
	
	public static void mainMenuDisplay() {
		MainMenuDisplayAction action = new MainMenuDisplayAction();
		action.execute();
	}
}
