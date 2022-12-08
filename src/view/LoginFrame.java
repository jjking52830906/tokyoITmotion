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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import control.Controller;

public class LoginFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
		
	private ImageIcon imIcon;
	private JLabel lblLabel;
	
	private JLabel lblLogin;
	
	private JLabel lblLoginId;
	private JTextField txtLoginID;
	
	private JLabel lblPassword;
	private JTextField txtPassword;
	
	private JButton btnLogin;
	private JButton Return;
	

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(220, 50, 900, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		imIcon = new ImageIcon(LoginFrame.class.getResource("/image/white_00032.jpg"));
		
		lblLabel = new JLabel(imIcon);
		lblLabel.setBounds(0, 0, 900, 650);
		contentPane.add(lblLabel);
		lblLabel.setLayout(null);
		
		JPanel panel1 = new JPanel();
		lblLabel.add(panel1);
		panel1.setBackground(new Color(224, 255, 255));
		panel1.setBounds(230,140,410,330);
		panel1.setLayout(null);
		
		
		
		lblLogin = new JLabel("ログイン");
		lblLogin.setFont(new Font("MS UI Gothic", Font.PLAIN, 25));
		lblLogin.setBounds(171, 43, 134, 50);
		panel1.add(lblLogin);
		
		lblLoginId = new JLabel("ログインID");
		lblLoginId.setBounds(57, 106, 68, 13);
		panel1.add(lblLoginId);
		
		txtLoginID = new JTextField();
		txtLoginID.setBounds(127, 103, 168, 19);
		panel1.add(txtLoginID);
		txtLoginID.setColumns(10);
				
		lblPassword = new JLabel("パスワード");
		lblPassword.setBounds(57, 147, 68, 13);
		panel1.add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(127, 144, 168, 19);
		panel1.add(txtPassword);
		txtPassword.setColumns(10);
		
		btnLogin = new JButton("ログイン");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(0,0,0));
		btnLogin.setFont(new Font("MS UI Gothic", Font.PLAIN, 14));
		btnLogin.setBounds(145, 205, 115, 33);
		panel1.add(btnLogin);
		btnLogin.addActionListener(this);
		
		Return = new JButton("キャンセル");
		Return.setForeground(new Color(255, 255, 255));
		Return.setBackground(Color.BLACK);
		Return.setFont(new Font("MS UI Gothic", Font.PLAIN, 14));
		Return.setBounds(145, 252, 115, 33);
		panel1.add(Return);
		Return.addActionListener(this);
		
		
		setVisible(true);
	}
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnLogin) {
			setVisible(false);
			Controller.LoginafterDisplay();
		}else if(e.getSource() == Return) {
            setVisible(false);
            Controller.mainMenuDisplay();
        }
	}
}
