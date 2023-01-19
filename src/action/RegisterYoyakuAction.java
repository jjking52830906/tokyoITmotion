package action;

import java.util.ArrayList;

import db.RegisterYoyakuDBAccess;
import model.Yoyaku;

public class RegisterYoyakuAction {
	public int execute(ArrayList<Yoyaku>list, int pass) {
		RegisterYoyakuDBAccess crdb = new RegisterYoyakuDBAccess();
		int in = crdb.registerYoyaku(list, pass);
		return in;
	}
}
