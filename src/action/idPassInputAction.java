package action;

public class idPassInputAction {

	public int execute(String id, String pass) throws Exception{
		
		IdPassInputDBAccess crdn = new IdPassInputDBAccess();
		int input = crdb.ipassInput(id, pass);
		
		return input;
	}
}
