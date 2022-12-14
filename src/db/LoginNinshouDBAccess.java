package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.IdPass;

public class LoginNinshouDBAccess extends ControlDBAccess{
	
	public ArrayList<IdPass> loginNinshou(String id, String pass)throws Exception{
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<IdPass> list = new ArrayList<IdPass>();
		try {
			if(con != null) {
				String sql = "SELECT LOGID, LOGPASS FROM LOGIN WHERE ROGID = ? AND ROGPASS = ?;";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, id);
				pstmt.setString(2, pass);
				rs = pstmt.executeQuery();
				while(rs.next() == true) {
					String getId = rs.getString("LOGID");
					String getPass = rs.getString("LOGPASS");
					IdPass ips = new IdPass(getId, getPass);
					list.add(ips);
				}
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
			try {
				if(pstmt != null) {
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
