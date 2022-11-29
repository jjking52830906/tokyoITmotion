package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PasswordRegisterDBAccess extends ControlDBAccess{
	public int passwordRegister(String pass) throws Exception {
		int result = 0;
		Connection con = createConnection();
		PreparedStatement pstmt1 = null;
		try {
			String sql = "INSERT INTO ACCOUNT(PASS) VALUES(?);";
			pstmt1 = con.prepareStatement(sql);
			pstmt1.setString(1, pass);
			result = pstmt1.executeUpdate();
		}catch(SQLException e) {
			throw new Exception("パスワード情報登録処理に失敗しました。！");
		}finally{
			try {
				if(pstmt1 != null) {
					pstmt1.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		closeConnection(con);
		return result;
	}
}
