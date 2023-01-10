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

public class LoginafterFrame extends JFrame implements ActionListener{
	private JPanel contentPane;
	private JButton btnLogout;
	private JButton btnYoyakuKakunin;
	private JButton btnYoyakuToroku;

	 static int pass;
	public LoginafterFrame(  int input) {
		setTitle("【メインメニュー】");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 674);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(6, 6, 475, 634);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(220, 20, 60));
		lblNewLabel_1.setBounds(-563, -60, 2048, 1365);
		lblNewLabel_1.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/image/white_00032.jpg")));
		panel.add(lblNewLabel_1);
		
		btnLogout = new JButton("ログアウト");
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setBounds(616, 6, 117, 29);
		contentPane.add(btnLogout);
		getContentPane().add(btnLogout);
		btnLogout.addActionListener(this);
		
		
		btnYoyakuKakunin = new JButton("予約確認");
		btnYoyakuKakunin.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnYoyakuKakunin.setBounds(506, 482, 227, 58);
		contentPane.add(btnYoyakuKakunin);
		getContentPane().add(btnYoyakuKakunin);
		btnYoyakuKakunin.addActionListener(this);
		
		btnYoyakuToroku = new JButton("予約登録");
		btnYoyakuToroku.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnYoyakuToroku.setBounds(506, 567, 227, 58);
		contentPane.add(btnYoyakuToroku);
		getContentPane().add(btnYoyakuToroku);
		btnYoyakuToroku.addActionListener(this);
		
		setVisible(true);
		pass = input;
		System.out.println(pass);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnLogout) {
			setVisible(false);
			Controller.mainMenuDisplay();
			
			
		}else if(e.getSource() == btnYoyakuToroku) {
			setVisible(false);
			Controller.yoyakuDisplay(pass);
			
			
		}else if (e.getSource() == btnYoyakuKakunin) {
			setVisible(false);
			Controller.YoyakukakuninDisplay(pass);
		}
	}
}
