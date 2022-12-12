package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginRegisterFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginRegisterFrame frame = new LoginRegisterFrame();
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
	public LoginRegisterFrame() {
		setTitle("【ログイン情報登録画面】");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ログインID");
		lblId.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		lblId.setBounds(48, 63, 65, 27);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(140, 62, 157, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("パスワード");
		lblPass.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		lblPass.setBounds(48, 133, 65, 19);
		contentPane.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(140, 125, 157, 27);
		contentPane.add(textField_1);
		
		JLabel lblPassNote = new JLabel("※半角英数字6文字以上16字以内");
		lblPassNote.setFont(new Font("MS UI Gothic", Font.PLAIN, 13));
		lblPassNote.setBounds(140, 159, 199, 13);
		contentPane.add(lblPassNote);
		
		JLabel lblNewLabel = new JLabel("※半角英数字");
		lblNewLabel.setFont(new Font("MS UI Gothic", Font.PLAIN, 13));
		lblNewLabel.setBounds(140, 102, 90, 13);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("登録");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(134, 211, 96, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("キャンセル");
		btnNewButton_1.setBounds(265, 211, 96, 39);
		contentPane.add(btnNewButton_1);
	}
}
