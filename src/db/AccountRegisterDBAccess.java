package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountRegisterDBAccess extends ControlDBAccess{
	public int registerAccount(String fname, String lname, Date date, String radio, String fAddress, String lAddress, String tel) throws Exception{
		int result = 0;
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		try {
			String sql = "INSERT INTO CUSTOMER(FIRSTNAME, LASTNAME, BIRTH, SEX, FIRSTADDRESS, LASTADDRESS, TEL) VALUES(?, ?, ?, ?, ?, ?, ?);";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, fname);
			pstmt.setString(2, lname);
			pstmt.setDate(3, date);
			pstmt.setString(4, radio);
			pstmt.setString(5, fAddress);
			pstmt.setString(6, lAddress);
			pstmt.setString(7, tel);
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
