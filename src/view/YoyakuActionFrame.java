package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class YoyakuActionFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YoyakuActionFrame frame = new YoyakuActionFrame();
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
	public YoyakuActionFrame() {
		setTitle("【予約検索画面】");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("検索");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(128, 277, 86, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("戻る");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(280, 277, 91, 40);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("年月日");
		lblNewLabel.setBounds(47, 60, 50, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("時刻");
		lblNewLabel_1.setBounds(47, 134, 50, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("施設");
		lblNewLabel_2.setBounds(47, 208, 50, 13);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2022", "2023", "2024", "2025", "2026"}));
		comboBox.setBounds(128, 55, 66, 21);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setBounds(234, 56, 42, 21);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_2.setBounds(318, 56, 42, 21);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_3 = new JLabel("月");
		lblNewLabel_3.setBounds(288, 60, 18, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("日");
		lblNewLabel_4.setBounds(372, 60, 50, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("年");
		lblNewLabel_5.setBounds(204, 60, 18, 13);
		contentPane.add(lblNewLabel_5);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"}));
		comboBox_3.setBounds(128, 130, 42, 21);
		contentPane.add(comboBox_3);
		
		JLabel lblNewLabel_6 = new JLabel("時");
		lblNewLabel_6.setBounds(179, 134, 18, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("～");
		lblNewLabel_7.setBounds(222, 134, 24, 13);
		contentPane.add(lblNewLabel_7);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"}));
		comboBox_4.setBounds(264, 130, 42, 21);
		contentPane.add(comboBox_4);
		
		JLabel lblNewLabel_8 = new JLabel("時");
		lblNewLabel_8.setBounds(325, 134, 21, 13);
		contentPane.add(lblNewLabel_8);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"体育館", "野球場", "サッカー場", "テニスコート", "プール"}));
		comboBox_5.setBounds(128, 203, 86, 21);
		contentPane.add(comboBox_5);
		
		JLabel lblNewLabel_9 = new JLabel("※予約可能日は本日から1年後まで");
		lblNewLabel_9.setBounds(131, 83, 181, 13);
		contentPane.add(lblNewLabel_9);
	}
}
