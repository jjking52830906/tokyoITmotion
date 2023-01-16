package action;

import db.IdSearchDBAccess;

public class IdSearchAction {
public String execute() throws Exception{
		
		IdSearchDBAccess crdn = new IdSearchDBAccess();
		return crdn.IdSearch(); 
	} 

}
