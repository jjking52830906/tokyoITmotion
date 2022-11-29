package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountRegisterDBAccess extends ControlDBAccess{
	public int registerAccount(String firstname, String lastname, String birth, String sex, String firstaddress, String lastaddress, String tel) throws Exception{
	
		int result = 0;
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		try {
			String sql = "INSERT INTO CUSTOMER(FIRSTNAME,LASTNAME,BIRTH,,SEX,FIRSTADDRESS,LASTADDRESS,TEL) VALUES(?,?,?,?,?,?,?);";
			
			pstmt = con.prepareStatement(sql);
			
			String fn = firstname;
			pstmt.setString(1, fn);
			
			String ln = lastname;
			pstmt.setString(2, ln);
			
			String birthday = birth;
			pstmt.setString(3, birthday);
			
			String sexx = sex;
			pstmt.setString(4, sexx);
			
			String fa = firstaddress;
			pstmt.setString(5, fa);
			
			String la = lastaddress;
			pstmt.setString(6, la);
			
			int tell = Integer.parseInt(tel);
			pstmt.setInt(7, tell);
	
			pstmt.executeUpdate();
		
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
