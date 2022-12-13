package db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class IdPassRegisterDBAccess extends ControlDBAccess{
	public int idPassRegister(String id, String pass)throws Exception{
		int result = 0;
		Connection con = createConnection();
		PreparedStatement pstmt = null;
		try {
			String sql = "INSERT INTO "
		}
		return result;
		
	}
}
