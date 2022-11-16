package db;

public class AccountRegisterDBAccess extends ControlDBAccess{
	public int registerAccount(String id, String pass, String fname, String lname, String year, String month, String day, String radio, String fAddress, String lAddress, String tel) throws Exception{
		int result = 0;
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		try {
			String sql = ""
		}
	}
}
