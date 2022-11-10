package control;

import action.LoginDisplayAction;

public class Controller {

	public static void loginDisplay() {
		LoginDisplayAction action = new LoginDisplayAction();
		action.execute();
	}
}
