package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Yoyaku;

public class SelectYoyaku extends ControlDBAccess{
	public aaa(Yoyaku yoyaku) throws Exception{
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			String sql = "SELECT DATE, HOUR, BASHOID FROM YOYAKU WHERE STATUS = 1 AND CUSTID = ?;";
			Date date = yoyaku.getDate();
			String hour = yoyaku.getHour();
			String bashoId = yoyakuBashoId();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, custId);
			
		}catch(SQLException e) {
			throw new Exception("予約情報取得処理に失敗しました！");
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
