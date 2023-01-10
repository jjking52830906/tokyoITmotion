package action;
import db.IdPassInputDBAccess;
public class idPassInputAction {

	public int execute(String id, String pass) throws Exception{
		
		IdPassInputDBAccess crdn = new IdPassInputDBAccess();
		int input = crdn.idpassInput(id, pass);
		
		return input;
	}
}
