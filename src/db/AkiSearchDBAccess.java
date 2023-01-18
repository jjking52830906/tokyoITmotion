package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Yoyaku;

public class AkiSearchDBAccess extends ControlDBAccess{
	public ArrayList<Yoyaku> akiSearch(String strDate, String bashoId)throws Exception{
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Yoyaku> list = new ArrayList<Yoyaku>();
		Date date = Date.valueOf(strDate);
		int IntbashoId = Integer.parseInt(bashoId);
		try {
			if(con != null) {
				String sql = "SELECT  DATE, HOUR, BASHOID FROM YOYAKU WHERE DATE = ? AND BASHOID = ? AND STATUS = 1 AND CUSTID ISNOT null";
				pstmt = con.prepareStatement(sql);
				pstmt.setDate(1, date);
				pstmt.setInt(2, IntbashoId);
				rs = pstmt.executeQuery();
				while(rs.next() == true) {
					Date getDate = rs.getDate("DATE");
					int getHour = rs.getInt("HOUR");
					int getBashoId = rs.getInt("BASHOID");
					Yoyaku yoyaku = new Yoyaku(getDate, getHour, getBashoId);
					list.add(yoyaku);
				}
			}
		}catch(SQLException e) {
			throw new Exception("検索処理に失敗しました！");
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
