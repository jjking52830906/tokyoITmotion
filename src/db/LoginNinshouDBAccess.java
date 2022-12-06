package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Customer;

public class LoginNinshouDBAccess extends ControlDBAccess{
	
	public ArrayList<Customer> loginNinshou(String id, String pass)throws Exception{
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Customer> list = new ArrayList<Customer>();
		try {
			if(con != null) {
				String sql = "SELECT ROGID, ROGPASS FROM CUSTOMER WHERE ROGID = ? AND ROGPASS = ?;";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, id);
				pstmt.setString(2, pass);
				rs = pstmt.executeQuery();
				
			}
		}catch (SQLException e) {
			throw new Exception("IDとパスワード情報取得処理に失敗しました。");
		}finally {
			try {
				if(rs != null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		closeConnection(con);
		return list;
	}
}
