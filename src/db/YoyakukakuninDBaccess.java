package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import model.Yoyaku;

public class YoyakukakuninDBaccess extends ControlDBAccess{
	public Object[][] yoyaku()throws Exception{
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			if(con != null) {
				String sql = "SELECT  FIRSTNAME, Date, Hour,INSNAME FROM YOYAKU WHERE DATE = ? AND BASHOID = ? AND STATUS = 0 AND CUSTID IS null";
				pstmt = con.prepareStatement(sql);
				pstmt.setDate(1, date);
				pstmt.setInt(2, IntbashoId);
				rs = pstmt.executeQuery();
				while(rs.next() == true) {
					Date getDate = rs.getDate("DATE");
					SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
					String getStrDate = new SimpleDateFormat("yyyy-MM-dd").format(getDate);
					String getHour = rs.getString("HOUR");
					int getBashoId = rs.getInt("BASHOID");
					Yoyaku yoyaku = new Yoyaku(getStrDate, getHour, getBashoId);
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
		return null;
	}
}
