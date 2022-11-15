package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import control.Controller;

public class LoginFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
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
		ImageIcon icon = new ImageIcon(LoginFrame.class.getResource("/image/white_00032.jpg"));
		
		
		
		JLabel Label1 = new JLabel(icon);
		Label1.setBounds(0, 0, 900, 650);
		contentPane.add(Label1);
		Label1.setLayout(null);
		
		JPanel panel1 = new JPanel();
		Label1.add(panel1);
		panel1.setBackground(new Color(224, 255, 255));
		panel1.setBounds(230,140,410,330);
		panel1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ログイン");
		lblNewLabel_1.setFont(new Font("MS UI Gothic", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(171, 43, 134, 50);
		panel1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(127, 103, 168, 19);
		panel1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 144, 168, 19);
		panel1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ログインID");
		lblNewLabel_2.setBounds(57, 106, 68, 13);
		panel1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("パスワード");
		lblNewLabel_3.setBounds(57, 147, 68, 13);
		panel1.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("ログイン");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(0,0,0));
		btnNewButton.setFont(new Font("MS UI Gothic", Font.PLAIN, 14));
		btnNewButton.setBounds(145, 205, 115, 33);
		panel1.add(btnNewButton);
		
		Return = new JButton("キャンセル");
		Return.setForeground(new Color(255, 255, 255));
		Return.setBackground(Color.BLACK);
		Return.setFont(new Font("MS UI Gothic", Font.PLAIN, 14));
		Return.setBounds(145, 252, 115, 33);
		panel1.add(Return);
		Return.addActionListener(this);
		
		setVisible(true);
		}	
	public static void systemErrorMessage(JFrame frame, Exception e) {

		JOptionPane.showMessageDialog(frame, e + "DB接続に失敗しました。", "【システムエラー】", JOptionPane.ERROR_MESSAGE);
	}



	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Return) {
			setVisible(false);
			
			try {
				Controller.mainMenuDisplay();
			}catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
