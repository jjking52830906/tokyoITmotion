package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LoginafterFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton Login;
	private JButton Register;
	private JButton Availability;
	private JButton BookingConfirmation;
	private JButton ReservationRegistration;
	
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
	public LoginafterFrame() {
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
		getContentPane().add(Login);
		
		JButton btnRegister = new JButton("ログアウト");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegister.setBackground(Color.WHITE);
		btnRegister.setBounds(616, 6, 117, 29);
		contentPane.add(btnRegister);
		getContentPane().add(Register);
		
		JButton btnAva = new JButton("空き状況");
		btnAva.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnAva.setBounds(506, 385, 227, 58);
		contentPane.add(btnAva);
		getContentPane().add(Availability);
		
		JButton btnReserve = new JButton("予約確認");
		btnReserve.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnReserve.setBounds(506, 467, 227, 58);
		contentPane.add(btnReserve);
		getContentPane().add(BookingConfirmation);
		
		JButton btnReserveRegister = new JButton("予約登録");
		btnReserveRegister.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnReserveRegister.setBounds(506, 556, 227, 58);
		contentPane.add(btnReserveRegister);
		getContentPane().add(ReservationRegistration);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Login) {
			setVisible(false);
			
			
		}else if(e.getSource() == Register) {
			setVisible(false);
			
			
		}
	}
}
