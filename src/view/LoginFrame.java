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

public class LoginFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	

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
		btnNewButton.setEnabled(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(0,0,0));
		btnNewButton.setFont(new Font("MS UI Gothic", Font.PLAIN, 14));
		btnNewButton.setBounds(145, 205, 115, 33);
		panel1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("キャンセル");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setFont(new Font("MS UI Gothic", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(145, 252, 115, 33);
		panel1.add(btnNewButton_1);
		
		setVisible(true);
		}



	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
