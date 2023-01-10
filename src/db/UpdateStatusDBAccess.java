package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Yoyaku;

public class UpdateStatusDBAccess extends ControlDBAccess{
	public int updateStatus (Yoyaku yoyaku)throws Exception{
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			String sql = "UPDATE Yoyaku SET CUSTID = ?, STATUS = 1 WHERE DATE = ? AND HOUR = ? BASHOID = ?; ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(0, custId);
			pstmt.setDate(0, date);
			pstmt.setString(0, hour);
			pstmt.setString(0, bashoid);
			result = pstmt.executeUpdate();
			
		}catch(SQLException e) {
			throw new Exception("予約登録処理に失敗しました！");
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
