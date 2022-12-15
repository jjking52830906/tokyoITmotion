package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginNinshouDBAccess extends ControlDBAccess{
	
	public int loginNinshou(String id, String pass)throws Exception{
	
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		
		try {
			if(con != null) {
				String sql = "SELECT LOGID, LOGPASS FROM LOGIN WHERE LOGID = ? AND LOGPASS = ?;";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, id);
				pstmt.setString(2, pass);
				result = pstmt.executeQuery();
				
			}
		}catch (SQLException e) {
			throw new Exception("IDとパスワード情報取得処理に失敗しました。");
		}finally {
			try {
				if(rs != null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		closeConnection(con);
		return list;
	}
}
