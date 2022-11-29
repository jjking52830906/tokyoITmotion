package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Controller;

public class AkiSearchFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton Return;
	private JComboBox cbbefore;
	private JComboBox cbafter;
	private JButton Search;
	

	/**
	 * Create the frame.
	 */
	public AkiSearchFrame() {
		setTitle("【空き検索画面】");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("年月日");
		lblNewLabel.setBounds(25, 45, 50, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("年");
		lblNewLabel_1.setBounds(202, 45, 21, 13);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(244, 41, 39, 21);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("月");
		lblNewLabel_2.setBounds(288, 45, 21, 13);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(321, 41, 39, 21);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("日");
		lblNewLabel_3.setBounds(370, 45, 21, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("時刻");
		lblNewLabel_4.setBounds(38, 108, 37, 13);
		contentPane.add(lblNewLabel_4);
		
		String[] before={"9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"};
		cbbefore = new JComboBox(before);
		cbbefore.setBounds(98, 104, 39, 21);
		getContentPane().add(cbbefore);
		cbbefore.addActionListener(this);
		
		JLabel lblNewLabel_5 = new JLabel("～");
		lblNewLabel_5.setBounds(193, 108, 30, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("時");
		lblNewLabel_6.setBounds(149, 108, 21, 13);
		contentPane.add(lblNewLabel_6);
		
		String[] after={"9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"};
		cbafter = new JComboBox(after);
		cbafter.setBounds(244, 104, 39, 21);
		getContentPane().add(cbafter);
		cbafter.addActionListener(this);
		
		JLabel lblNewLabel_7 = new JLabel("時");
		lblNewLabel_7.setBounds(293, 108, 21, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("施設");
		lblNewLabel_8.setBounds(38, 163, 30, 13);
		contentPane.add(lblNewLabel_8);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(98, 159, 114, 21);
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"体育館", "野球場", "サッカー場", "テニスコート", "プール"}));
		contentPane.add(comboBox_4);
		
		Search = new JButton("検索");
		Search.setBounds(98, 218, 91, 21);
		contentPane.add(Search);
		Search.addActionListener(this);
		
		Return = new JButton("キャンセル");
		Return.setBounds(244, 218, 104, 21);
		contentPane.add(Return);
		getContentPane().add(Return);
		Return.addActionListener(this);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(98, 41, 96, 21);
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"2022", "2023"}));
		contentPane.add(comboBox_5);
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Search) {
			String before =(String)cbbefore.getSelectedItem();
			String after = (String)cbafter.getSelectedItem();
			int benum = Integer.parseInt(before);
			int afnum = Integer.parseInt(after);
			if(benum>=afnum) {
				 JOptionPane.showMessageDialog(this, "正しい時刻を入力してください。", "エラー", JOptionPane.WARNING_MESSAGE);
			}
		}
		if(e.getSource() == Return) {
			setVisible(false);
			
			Controller.mainMenuDisplay();
		}
	}
}
