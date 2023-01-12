package action;

import db.IdCheckDBAccess;

public class IdCheckAction {
	public int execute(String id)throws Exception{
		IdCheckDBAccess crdb = new IdCheckDBAccess();
		int sol =crdb.IdCheck(id);
		return sol;
	}

}
