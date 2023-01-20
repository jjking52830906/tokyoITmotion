package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class YoyakukakuninDBaccess extends ControlDBAccess{
	public Object[][] yoyakuSearch(int pass)throws Exception{
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String[][] tableData = new String[19][4];
		int a=0;
		try {
			if(con != null) {
				String sql = "SELECT  LASTNAME, FIRSTNAME, Date, Hour,BASHONAME "
						   + "FROM YOYAKU, CUSTOMER,BASHO "
						   + "WHERE YOYAKU.CUSTID = CUSTOMER.CUSTID "
						   + "AND BASHO.BASHOID=YOYAKU.BASHOID "
						   + "AND YOYAKU.CUSTID = ? "
						   + "AND STATUS = 1;";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, pass);
				rs = pstmt.executeQuery();
				while(rs.next() == true) {
					String Name2 = rs.getString("LASTNAME");
					String Name1 = rs.getString("FIRSTNAME");
					String Name = Name2+Name1;
					Date getDate = rs.getDate("DATE");
					SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
					String getStrDate = new SimpleDateFormat("yyyy-MM-dd").format(getDate);
					String getHour = rs.getString("HOUR");
					String Basho = rs.getString("BASHONAME");
					System.out.println(Name+getStrDate+getHour+Basho);
					
					tableData[a][0] = Name;
					tableData[a][1] = getStrDate;
					tableData[a][2] = getHour;
					tableData[a][3] = Basho;
					a++;
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
		return tableData;
	}
}
