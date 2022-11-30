package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ControlDBAccess {

	//DBとの接続を確立する
	protected Connection createConnection() throws Exception{
		Connection con = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:65534/東京ITモーション?serverTimezone=JST",
					"user1",
					"pass1");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			throw new Exception("DB接続処理に失敗しました");
		}catch(SQLException e) {
			e.printStackTrace();
			throw new Exception("DB接続処理に失敗しました");
		}
		return con;
	}

	//DBとの接続を閉じる
	protected void closeConnection(Connection con) throws Exception{
		try{
			if(con != null) {
				con.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("DB切断処理に失敗しました");
		}
	}
}
