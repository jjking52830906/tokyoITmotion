package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Customer;

public class YoyakuGetCustNameDBAccess extends ControlDBAccess{
	public ArrayList<Customer> yoyakuGetCustName(int pass)throws Exception{
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Customer> list = new ArrayList<Customer>();
		try {
			if(con != null) {
				String sql = "SELECT FIRSTNAME, LASTNAME FROM CUSTOMER WHERE CUSTID = ?;";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, pass);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					String firstName = rs.getString("FIRSTNAME");
					String lastName = rs.getString("LASTNAME");
					Customer customer = new Customer(firstName, lastName);
					list.add(customer);
				}
			}
		}catch(SQLException e) {
			throw new Exception("氏名検索処理に失敗しました！");
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
