package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Controller;

public class MainMenuFrame extends JFrame implements ActionListener{

	private JPanel GazouPane;
	private JButton Login;
	private JButton Register;
	private JButton YoyakuToroku;
	private JButton AkiSearch;
	private JButton btnReserve;

	/**
	 * Create the frame.
	 */
	public MainMenuFrame() {
		setTitle("【メインメニュー】");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 30, 757, 674);
		GazouPane = new JPanel();
		GazouPane.setBackground(new Color(255, 255, 255));
		GazouPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(GazouPane);
		GazouPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(6, 6, 475, 619);
		GazouPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(220, 20, 60));
		lblNewLabel_1.setBounds(-563, -60, 2048, 1365);
		lblNewLabel_1.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/image/white_00032.jpg")));
		panel.add(lblNewLabel_1);
		
		Login = new JButton("ログイン");
		Login.setBackground(new Color(255, 255, 255));
		Login.setBounds(487, 6, 117, 29);
		Login.addActionListener(this);
		GazouPane.add(Login);
		add(Login);
		
		
		Register = new JButton("登録");
		Register.setBackground(Color.WHITE);
		Register.setBounds(616, 6, 117, 29);
		GazouPane.add(Register);
		Register.addActionListener(this);
		add(Register);
		
		
		AkiSearch = new JButton("空き状況");
		AkiSearch.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		AkiSearch.setBounds(506, 385, 227, 58);
		GazouPane.add(AkiSearch);
		AkiSearch.addActionListener(this);
		add(AkiSearch);
		
		
		btnReserve = new JButton("予約確認");
		btnReserve.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnReserve.setBounds(506, 467, 227, 58);
		GazouPane.add(btnReserve);
		add(btnReserve);
		btnReserve.addActionListener(this);
		
		
		YoyakuToroku = new JButton("予約登録");
		YoyakuToroku.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		YoyakuToroku.setBounds(506, 556, 227, 58);
		GazouPane.add(YoyakuToroku);
		add(YoyakuToroku);
		YoyakuToroku.addActionListener(this);
		
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Login) {
			setVisible(false);
			
			Controller.loginDisplay();
		}else if(e.getSource() == Register) {
			setVisible(false);
			
			Controller.registerDisplay();
		}else if(e.getSource() == YoyakuToroku) {
			setVisible(false);
			
			Controller.yoyakuDisplay();
		}else if (e.getSource() == AkiSearch) {
			setVisible(false);
			
			Controller.AkiSearchDisplay();
		}else if (e.getSource() == btnReserve) {
			setVisible(false);
			
			Controller.mainMenuDisplay();
		}
	}
}
