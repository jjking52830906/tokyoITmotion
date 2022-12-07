package action;

public class IDPassRegisterAction {
	public int execute(String id, String pass) {
		IdPassRegisterDBAccess crdb = new IdPassRegisterDBAccess();
		int res = crdb.idPassRegister(id, pass);
		return rel;
	}
}
