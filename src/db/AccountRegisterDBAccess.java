package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountRegisterDBAccess extends ControlDBAccess{
	public int registerAccount(String id, String pass, String fname, String lname, String year, String month, String day, String radio, String fAddress, String lAddress, String tel) throws Exception{
		int result = 0;
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		try {
			String sql = "INSERT INTO CUSTOMER";
			pstmt.setString(1, id);
			pstmt.setString(2, sql);
			result = pstmt.executeUpdate();
		}catch(SQLException e) {
			throw new Exception("アカウント登録処理に失敗しました。");
		}finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		closeConnection(con);
		return result;
	}
}
