package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class YoyakukakuteiFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YoyakukakuteiFrame frame = new YoyakukakuteiFrame();
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
	public YoyakukakuteiFrame() {
		setTitle("【予約確定確認画面】");
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
		
		JButton btnNewButton = new JButton("確定");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(115, 240, 91, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("キャンセル");
		btnNewButton_1.setBounds(263, 240, 91, 34);
		contentPane.add(btnNewButton_1);
	}

}
