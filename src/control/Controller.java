package control;

import java.sql.Date;

import action.AccountRegisterAction;
import action.AkiSearchAction;
import action.AkiSearchDisplayAction;
import action.AkikekkaDisplayAction;
import action.InputToLoginAfterFrameAction;
import action.LoginDisplayAction;
import action.LoginNinshouAction;
import action.LoginRegisterAction;
import action.LoginRegisterDisplayAction;
import action.MainMenuDisplayAction;
import action.RegisterDisplayAction;
import action.YoyakuDisplayAction;
import action.YoyakukakuninAction;
import action.YoyakukauninDisplayAction;
import action.idPassInputAction;

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
	
	public static void yoyakuDisplay(int input) {
		YoyakuDisplayAction action = new YoyakuDisplayAction();
		action.execute(input);
	}
	
	public static void AkiSearchDisplay() {
		AkiSearchDisplayAction action = new AkiSearchDisplayAction();
		action.execute(); 
	}
	
	public static void YoyakukakuninDisplay(int input) {
		YoyakukauninDisplayAction action = new YoyakukauninDisplayAction();
		action.execute(input);
	}
	
	public static void AkikekkaDisplay() {
		AkikekkaDisplayAction action = new AkikekkaDisplayAction();
		action.execute();
	}
	
	
	
	//登録系
	public static int accountRegister(String fname, String lname, Date date, String radio, String fAddress, String lAddress, String tel) throws Exception {
		AccountRegisterAction action = new AccountRegisterAction();
		int res = action.execute(fname, lname, date, radio, fAddress, lAddress, tel);
		return res;
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
	
	public static Object[][] akiSearch(String[] data)throws Exception{
		AkiSearchAction action = new AkiSearchAction();
		Object[][] tableData = action.execute(data);
		return tableData;
	}
	
	public static int idPass(String id, String pass)throws Exception{
		idPassInputAction action = new idPassInputAction();
		int input = action.execute(id, pass);
		return input;
	}
	
	public static void inputToLoginAfterFrame(int input)throws Exception{
		InputToLoginAfterFrameAction action = new	InputToLoginAfterFrameAction();
		action.execute(input);
	}
	public static Object[][] yoyakukakunin()throws Exception{
		YoyakukakuninAction action = new YoyakukakuninAction();
		Object[][] tableData = action.execute();
		return null;
		
	}
}
