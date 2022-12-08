package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import control.Controller;

public class YoyakukakuninFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton Return;

	/**
	 * Create the frame.
	 */
	public YoyakukakuninFrame() {
		setTitle("【予約確認画面】");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("施設名");
		lblNewLabel.setBounds(55, 45, 50, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("年月日");
		lblNewLabel_1.setBounds(55, 103, 50, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("時刻");
		lblNewLabel_2.setBounds(55, 166, 50, 13);
		contentPane.add(lblNewLabel_2);
		
		
		
		Return = new JButton("キャンセル");
		Return.setBounds(146, 236, 130, 41);
		contentPane.add(Return);
		getContentPane().add(Return);
		Return.addActionListener(this);
		
		textField = new JTextField();
		textField.setBounds(136, 42, 147, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 100, 147, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(136, 163, 147, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) { 
		if(e.getSource() == Return) {
			setVisible(false);
			Controller.mainMenuDisplay();
		}
	}
}