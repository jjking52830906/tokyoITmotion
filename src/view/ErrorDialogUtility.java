package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ErrorDialogUtility {
	public static void systemErrorMessage(JFrame frame, Exception e) {
		JOptionPane.showMessageDialog(frame, e + "：管理者に連絡してください。", "【システムエラー】", JOptionPane.ERROR_MESSAGE);
	}
}
