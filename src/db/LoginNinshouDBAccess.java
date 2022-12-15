package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginNinshouDBAccess extends ControlDBAccess{
	
	public int loginNinshou(String id, String pass)throws Exception{
	
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int i = 0;
		try {
			if(con != null) {
				String sql = "SELECT LOGID, LOGPASS FROM LOGIN WHERE LOGID = ? AND LOGPASS = ?;";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, id);
				pstmt.setString(2, pass);
				rs = pstmt.executeQuery();
				while(rs.next()) 
				i++;
			}
		}catch (SQLException e) {
			throw new Exception("IDとパスワード情報取得処理に失敗しました。");
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
		return i;
	}
}
