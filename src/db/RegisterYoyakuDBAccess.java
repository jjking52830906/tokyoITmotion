package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Yoyaku;

public class RegisterYoyakuDBAccess extends ControlDBAccess {
	public int registerYoyaku(ArrayList<Yoyaku>list, int pass) throws Exception{
		int result = 0;
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		int listSize = list.size();
		Date[] date = new Date[listSize];
		int[] hour = new int[listSize];
		int[] bashoId = new int[listSize];
		for(int i=0; i<listSize; i++) {
			Yoyaku yoyaku = list.get(i);
			date[i] = yoyaku.getDate();
			hour[i] = yoyaku.getHour();
			bashoId[i] = yoyaku.getBashoId();
		}
		try {
			for(int i=0; i<listSize; i++) {
				String sql = "INSERT INTO YOYAKU (DATE, HOUR, BASHOID, STATUS, CUSTID)VALUES(?, ?, ?, 1, ?);";
				pstmt = con.prepareStatement(sql);
				pstmt.setDate(i, date[i]);
				pstmt.setInt(2, hour[i]);
				pstmt.setInt(3, bashoId[i]);
				pstmt.setInt(4, pass);
				result = pstmt.executeUpdate();
			}	
		}catch(SQLException e){
			e.printStackTrace();
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