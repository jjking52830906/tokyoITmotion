package model;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControlUtility {
	public static String[] IdPassToArray(ArrayList<IdPass> list) {
		
		int listSize = list.size();
		String[] tableIpass = null;
		IdPass ips = list.get(listSize);
		tableIpass[0] = ips.getId();
		tableIpass[1] = ips.getPass();
		
		return tableIpass;
	}
	
	public static void systemErrorMessage(JFrame frame, Exception e) {
		JOptionPane.showMessageDialog(frame, e + "：管理者に連絡してください。", "【システムエラー】", JOptionPane.ERROR_MESSAGE);
	}
}
