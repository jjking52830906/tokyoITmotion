package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginRegisterDBAccess extends ControlDBAccess{
	public int registerLogin(String id, String pass,String custid)throws Exception{
		int result = 0;
		Connection con = createConnection();
		PreparedStatement pstmt = null; 
		try {
			String sql = "INSERT INTO LOGIN(LOGID,LOGPASS,CUSTID) VALUES(HEX(AES_ENCRYPT(?,'ENCRYPT-KEY')),HEX(AES_ENCRYPT( ?,'ENCRYPT-KEY')),?);";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id); 
			pstmt.setString(2, pass);
			pstmt.setString(3, custid);
			result = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			throw new Exception("ログインIDとパスワード登録処理に失敗しました。");
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
