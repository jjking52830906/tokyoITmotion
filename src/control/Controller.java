package control;

import java.sql.Date;
import java.sql.Time;

import action.AccountRegisterAction;
import action.AkiSearchAction;
import action.AkiSearchDisplayAction;
import action.AkikekkaDisplayAction;
import action.LoginDisplayAction;
import action.LoginNinshouAction;
import action.LoginRegisterAction;
import action.LoginRegisterDisplayAction;
import action.LoginafterDisplayAction;
import action.MainMenuDisplayAction;
import action.RegisterDisplayAction;
import action.YoyakuDisplayAction;
import action.YoyakuRegisterAction;
import action.YoyakukauninDisplayAction;

public class Controller {
	
	//表示系
	public static void loginDisplay() {
		LoginDisplayAction action = new LoginDisplayAction();
		action.execute();
	}
	
	public static void mainMenuDisplay() {
		MainMenuDisplayAction action = new MainMenuDisplayAction();
		action.execute();
	}
	
	public static void registerDisplay() {
		RegisterDisplayAction action = new RegisterDisplayAction();
		action.execute();
	}
	
	public static void loginRegisterDisplay() {
		LoginRegisterDisplayAction action = new LoginRegisterDisplayAction();
		action.execute();
	}
	
	public static void yoyakuDisplay() {
		YoyakuDisplayAction action = new YoyakuDisplayAction();
		action.execute();
	}
	
	public static void AkiSearchDisplay() {
		AkiSearchDisplayAction action = new AkiSearchDisplayAction();
		action.execute();
	}
	
	public static void YoyakukakuninDisplay() {
		YoyakukauninDisplayAction action = new YoyakukauninDisplayAction();
		action.execute();
	}
	
	public static void AkikekkaDisplay() {
		AkikekkaDisplayAction action = new AkikekkaDisplayAction();
		action.execute();
	}
	
	public static void loginafterDisplay() {
		LoginafterDisplayAction action = new LoginafterDisplayAction();
		action.execute();
	}
	
	//登録系
	public static int accountRegister(String fname, String lname, Date date, String radio, String fAddress, String lAddress, String tel) throws Exception {
		AccountRegisterAction action = new AccountRegisterAction();
		int res = action.execute(fname, lname, date, radio, fAddress, lAddress, tel);
		return res;
	}
	
	public static int yoyokuRegister(int insid, Date resdate, Time strtime, Time fintime, int custid, String purpose, String place) throws Exception{
		YoyakuRegisterAction action = new YoyakuRegisterAction();
		int rem = action.execute(insid, resdate, strtime, fintime, custid, purpose, place);
		return rem;
	}
	
	public static int loginRegister(String id, String pass)throws Exception{
		LoginRegisterAction action = new LoginRegisterAction();
		int rel = action.execute(id, pass);
		return rel;
	}
	
	//アクション系
	public static int ninshou(String id, String pass)throws Exception{
		LoginNinshouAction action = new LoginNinshouAction();
		int nin = action.execute(id, pass);
		return nin;
	}
	
	public static String[][] akiSearch(String[] data)throws Exception{
		AkiSearchAction action = new AkiSearchAction();
		String[][] tableData = action.execute(data);
		return tableData;
	}
	
}
