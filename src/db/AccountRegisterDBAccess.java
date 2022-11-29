package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountRegisterDBAccess extends ControlDBAccess{
	public int registerAccount(String id, String fname, String lname, String year, String month, String day, String radio, String fAddress, String lAddress, String tel) throws Exception{
		int result = 0;
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		try {
			String sql = "INSERT INTO CUSTOMER(ID, FNAME, LNAME, FADDRESS, LADDRESS, TEL) VALUES(?, ?, ?, ?, ?, ?);";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, fname);
			pstmt.setString(3, lname);
			pstmt.setString(4, fAddress);
			pstmt.setString(5, lAddress);
			pstmt.setString(6, year);
			pstmt.setString(7, month);
			pstmt.setString(8, day);
			pstmt.setString(9, radio);
			pstmt.setString(10, tel);
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
