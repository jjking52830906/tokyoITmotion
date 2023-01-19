package control;

import java.sql.Date;
import java.util.ArrayList;

import action.AccountRegisterAction;
import action.AkiSearchDisplayAction;
import action.AkihyojiAction;
import action.AkikekkaDisplayAction;
import action.IdCheckAction;
import action.IdSearchAction;
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
import model.Yoyaku;

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
	
	public static int loginRegister(String id, String pass,String custid)throws Exception{
		LoginRegisterAction action = new LoginRegisterAction();
		int rel = action.execute(id, pass,custid);
		return rel;
	}
	
	public static int registerYoyaku(ArrayList<Yoyaku>list, int pass) {
		RegisterYoyakuAction action = new RegisterYoyakuAction();
		int in = action.execute(list, pass);
		return in;
	}
	
	//アクション系
	public static int ninshou(String id, String pass)throws Exception{
		LoginNinshouAction action = new LoginNinshouAction();
		int nin = action.execute(id, pass);
		return nin;
	}
	//新
	public static Object[][] akiHyoji(String[] data)throws Exception{
		AkihyojiAction action = new AkihyojiAction();
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
	public static Object[][] yoyakukakunin(int pass)throws Exception{
		YoyakukakuninAction action = new YoyakukakuninAction();
		String[][] tableData = (String[][])action.execute(pass);
		return tableData;
		
	}
	
	public static int loginIdCheck(String logId)throws Exception{
		IdCheckAction action = new IdCheckAction();
		return action.execute(logId);
	}
	
	public static String IdSearch()throws Exception{
		IdSearchAction action = new IdSearchAction();
		return action.execute();  
	}
}
