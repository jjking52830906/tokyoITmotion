package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

public class YoyakuRegisterDBAccess extends ControlDBAccess{
	public int registerYoyaku(int insid, Date resdate, Time strtime, Time fintime, int custid, String purpose, String place) throws Exception{
        int result = 0;
        Connection con = createConnection();
        PreparedStatement pstmt = null;
        try {
            String sql = "INSERT INTO RESERVE(INSID, RESDATE, STRTIME, FINTIME, CUSTID, PURPOSE, PLACE) VALUES(?, ?, ?, ?, ?, ?, ?);";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, insid);
            pstmt.setDate(2, resdate);
            pstmt.setTime(3, strtime);
            pstmt.setTime(4, fintime);
            pstmt.setInt(5, custid);
            pstmt.setString(6, purpose);
            pstmt.setString(7, place);
            result = pstmt.executeUpdate();
        }catch(SQLException e) {
            throw new Exception("予約登録処理に失敗しました。");
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
