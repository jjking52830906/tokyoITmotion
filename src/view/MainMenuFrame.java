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
		
		
		JButton btnRegister = new JButton("登録");
		btnRegister.setBackground(Color.WHITE);
		btnRegister.setBounds(616, 6, 117, 29);
		GazouPane.add(btnRegister);
		
		
		JButton btnAva = new JButton("空き状況");
		btnAva.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnAva.setBounds(506, 385, 227, 58);
		GazouPane.add(btnAva);
		
		
		JButton btnReserve = new JButton("予約確認");
		btnReserve.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnReserve.setBounds(506, 467, 227, 58);
		GazouPane.add(btnReserve);
		
		
		JButton btnReserveRegister = new JButton("予約登録");
		btnReserveRegister.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnReserveRegister.setBounds(506, 556, 227, 58);
		GazouPane.add(btnReserveRegister);
		
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Login) {
			setVisible(false);
			
			Controller.loginDisplay();
		}
	}
}
