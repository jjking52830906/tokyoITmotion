package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import model.Yoyaku;

public class AkiSearchDBAccess extends ControlDBAccess{
	public ArrayList<Yoyaku> akiSearch(Date date, String before, String after, String basho)throws Exception{
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Yoyaku> list = new ArrayList<Yoyaku>();
		try {
			if(con != null) {
				String sql = "SELECT ";
				pstmt = con.prepareStatement(sql);
				
				rs = pstmt.executeQuery();
				while(rs.next() == true) {
					Date getDate = rs.getDate("DATE");
					SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
					String strDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
					String getBefore = rs.getString("BEFORE");
					String getAfter = rs.getString("AFTER");
					String getBasho = rs.getString("");
					Yoyaku yoyaku = new Yoyaku(strDate, getBefore, getAfter, getBasho);
					list.add(yoyaku);
				}
			}
		}catch(SQLException e) {
			throw new Exception("顧客情報検索処理に失敗しました！");
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		closeConnection(con);
		return list;
	}
}
