package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Yoyaku;

public class RegisterYoyakuDBAccess extends ControlDBAccess {
	public int registerYoyaku(ArrayList<Yoyaku>list, int pass) throws Exception{
		int result = 0;
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		try {
			String sql = "INSERT INTO YOYAKU (DATE, HOUR, BASHOID, STATUS, CUSTID)VALUES(?, ?, ?, ?, ?);";
			pstmt = con.prepareStatement(1, date);
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new Exception("予約登録処理に失敗しました。");
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
