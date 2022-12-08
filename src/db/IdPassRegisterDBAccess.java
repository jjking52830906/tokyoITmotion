package db;

public class IdPassRegisterDBAccess extends ControlDBAccess{
	public int idPassRegister(String id, String pass)throws Exception{
		int result = 0;
		Connection con = createConnection();
		PreparedStatment pstmt = null;
		try {
			String sql = "INSERT INTO "
		}
		return result;
		
	}
}
