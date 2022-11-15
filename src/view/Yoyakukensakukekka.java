package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Yoyakukensakukekka extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Yoyakukensakukekka frame = new Yoyakukensakukekka();
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
	public Yoyakukensakukekka() {
		setTitle("【予約検索結果画面】");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", null, null},
				{null, "", null},
				{null, null, ""},
				{null, null, null},
				{null, null, ""},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"\u65BD\u8A2D\u540D", "\u5E74\u6708\u65E5", "\u6642\u523B"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(0).setMinWidth(29);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setMinWidth(23);
		table.getColumnModel().getColumn(2).setPreferredWidth(83);
		table.getColumnModel().getColumn(2).setMinWidth(23);
		table.setBounds(30, 83, 379, 112);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("戻る");
		btnNewButton.setBounds(303, 218, 88, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("施設名");
		lblNewLabel.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		lblNewLabel.setBounds(67, 57, 50, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("年月日");
		lblNewLabel_1.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(191, 57, 50, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("時刻");
		lblNewLabel_2.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(321, 57, 50, 16);
		contentPane.add(lblNewLabel_2);
	}
}
