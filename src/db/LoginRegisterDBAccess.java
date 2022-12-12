package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginRegisterDBAccess extends ControlDBAccess{
	public int registerLogin(String id, String pass)throws Exception{
		int result = 0;
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		try {
			String sql = "INSERT INTO LOGIN(ID, PASS) VALUES(?, ?);";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			result = pstmt.executeUpdate();
		}catch(SQLException e) {
			throw new Exception("ログインIDとパスワード登録処理に失敗しました。");
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
