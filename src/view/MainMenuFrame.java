package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainMenuFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuFrame frame = new MainMenuFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainMenuFrame() {
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
		
		JButton btnlogin = new JButton("ログイン");
		btnlogin.setBackground(new Color(255, 255, 255));
		btnlogin.setBounds(487, 6, 117, 29);
		contentPane.add(btnlogin);
		
		JButton btnRegister = new JButton("登録");
		btnRegister.setBackground(Color.WHITE);
		btnRegister.setBounds(616, 6, 117, 29);
		contentPane.add(btnRegister);
		
		JButton btnNewButton = new JButton("空き状況");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton.setBounds(506, 385, 227, 58);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("予約確認");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_1.setBounds(506, 467, 227, 58);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("予約登録");
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_2.setBounds(506, 556, 227, 58);
		contentPane.add(btnNewButton_2);
	}
}
