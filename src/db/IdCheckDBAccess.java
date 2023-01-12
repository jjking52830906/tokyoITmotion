package db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IdCheckDBAccess extends ControlDBAccess {
	public int IdCheck(String id)throws Exception{
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int i = 0;
		try {
			if(con != null) {
				String sql = "SELECT * FROM LOGIN WHERE LOGID = ? ;";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				while(rs.next()) 
				i++;
			}
		}catch (SQLException e) {
			throw new Exception("処理に失敗しました。");
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
		return i;
	}

}
