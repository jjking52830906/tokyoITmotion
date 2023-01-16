package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IdSearchDBAccess extends ControlDBAccess {
	public String IdSearch()throws Exception{
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String id = null;
		try {
			if(con != null) {
				String sql = "SELECT MAX(CUSTID) FROM CUSTOMER ;";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) 
				id =rs.getString("MAX(CUSTID)");
			}
		}catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("処理に失敗しました。");
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
		return id;
	}
}
