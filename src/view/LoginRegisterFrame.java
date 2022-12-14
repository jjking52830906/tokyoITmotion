package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import control.Controller;

public class LoginRegisterFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblLoginID;
	private JTextField txtID;
	
	private JLabel lblPass;
	private JTextField txtPass;
	
	private JButton btnRegister;
	private JButton btnReturn;

	

	/**
	 * Create the frame.
	 */
	public LoginRegisterFrame() {
		setTitle("【ログイン情報登録画面】");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblLoginID = new JLabel("ログインID");
		lblLoginID.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		lblLoginID.setBounds(48, 63, 65, 27);
		contentPane.add(lblLoginID);
		
		txtID = new JTextField();
		txtID.setBounds(140, 62, 157, 30);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		lblPass = new JLabel("パスワード");
		lblPass.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		lblPass.setBounds(48, 133, 65, 19);
		contentPane.add(lblPass);
		
		txtPass = new JTextField();
		txtPass.setColumns(10);
		txtPass.setBounds(140, 125, 157, 27);
		contentPane.add(txtPass);
		
		JLabel lblPassNote = new JLabel("※半角英数字6文字以上16字以内");
		lblPassNote.setFont(new Font("MS UI Gothic", Font.PLAIN, 13));
		lblPassNote.setBounds(140, 159, 199, 13);
		contentPane.add(lblPassNote);
		
		JLabel lblNewLabel = new JLabel("※半角英数字");
		lblNewLabel.setFont(new Font("MS UI Gothic", Font.PLAIN, 13));
		lblNewLabel.setBounds(140, 102, 90, 13);
		contentPane.add(lblNewLabel);
		
		btnRegister = new JButton("登録");
		btnRegister.setBounds(134, 211, 96, 39);
		contentPane.add(btnRegister);
		btnRegister.addActionListener(this);
		
		btnReturn = new JButton("キャンセル");
		btnReturn.setBounds(265, 211, 96, 39);
		contentPane.add(btnReturn);
		btnReturn.addActionListener(this);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnRegister	) {
			String id = txtID.getText();
            String pass = txtPass.getText();
            
            int passlength = pass.length();
            String regex_AlphaNum = "^[A-Za-z0-9]+$" ; // 半角英数字のみ
            if(!(id.equals("")) && !(pass.equals(""))) {
            	if(!(checkLogic(regex_AlphaNum, id) == true)) {
                    JOptionPane.showMessageDialog(this, "ログインIDには半角英数字のみ入力してください", "入力エラー", JOptionPane.WARNING_MESSAGE);
                    return;
                }else if(!((checkLogic(regex_AlphaNum, pass) == true) && passlength >= 6 && passlength <= 16)){
                    JOptionPane.showMessageDialog(this, "パスワードには半角英数字で6文字以上16文字以内で入力してください", "入力エラー", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            	try {
            		int rel = Controller.loginRegister(id, pass);
            		if(rel == 1) {
            			JOptionPane.showMessageDialog(this, "IDとパスワード登録に成功しました", "登録完了", JOptionPane.INFORMATION_MESSAGE);
            			setVisible(false);
            			Controller.mainMenuDisplay();
            		}else {
            			JOptionPane.showMessageDialog(this, "IDとパスワード登録に失敗しました", "登録失敗", JOptionPane.WARNING_MESSAGE);
            		}
            	}catch(Exception ex) {
            		ex.printStackTrace();
            		ErrorDialogUtility.systemErrorMessage(this, ex);
            	}
            }
            
		}else if(e.getSource() == btnReturn) {
			setVisible(false);
			Controller.mainMenuDisplay();
		}
	}
	
	private boolean checkLogic(String regex, String target) {
        boolean result = true;
           if( target == null || target.isEmpty() ) return false ;
           // 3. 引数に指定した正規表現regexがtargetにマッチするか確認する
           Pattern p1 = Pattern.compile(regex); // 正規表現パターンの読み込み
           Matcher m1 = p1.matcher(target); // パターンと検査対象文字列の照合
           result = m1.matches(); // 照合結果をtrueかfalseで取得
           return result;
   }
}
