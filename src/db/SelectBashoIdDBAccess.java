package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectBashoIdDBAccess extends ControlDBAccess{
	public int selectBashoId(String bashoName) throws Exception{
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int bashoId = 0;
		try {
			if(con != null) {
				String sql = "SELECT BASHOID FROM BASHO WHERE BASHONAME = ?;";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, bashoName);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					bashoId = rs.getInt("BASHOID");
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
			throw new Exception("検索処理に失敗しました！");
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		closeConnection(con);
		return bashoId;
	}
}
