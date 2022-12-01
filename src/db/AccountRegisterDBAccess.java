package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountRegisterDBAccess extends ControlDBAccess{
	public int registerAccount(String id, String pass, String fname, String lname, Date date, String radio, String fAddress, String lAddress, String tel) throws Exception{
		int result = 0;
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		try {
			String sql = "INSERT INTO CUSTOMER(ROGID, ROGPASS, FIRSTNAME, LASTNAME, BIRTH, SEX, FIRSTADDRESS, LASTADDRESS, TEL) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			pstmt.setString(3, fname);
			pstmt.setString(4, lname);
			pstmt.setDate(5, date);
			pstmt.setString(6, radio);
			pstmt.setString(7, fAddress);
			pstmt.setString(8, lAddress);
			pstmt.setString(9, tel);
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
