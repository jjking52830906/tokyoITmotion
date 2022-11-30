package db;

import java.sql.Connection;
<<<<<<< HEAD
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountRegisterDBAccess extends ControlDBAccess{
	public int registerAccount(String id, String pass, String fname, String lname, Date date, String radio, String fAddress, String lAddress, String tel) throws Exception{
		int result = 0;
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		try {
			String sql = "INSERT INTO CUSTOMER(ID, PASS, FNAME, LNAME, DATE, RADIO, FADDRESS, LADDRESS, TEL) VALUES(?, ?, ?, ?, ?, ?);";
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
=======
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
		
>>>>>>> branch 'master' of https://github.com/jjking52830906/tokyoITmotion.git
		}catch(SQLException e) {
			throw new Exception("アカウント登録処理に失敗しました。!");
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
