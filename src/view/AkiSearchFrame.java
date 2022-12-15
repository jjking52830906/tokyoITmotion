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
	
	private JLabel lblDate;
	private JComboBox cbYear;
	private JLabel lblYear;
	private JComboBox cbMonth;
	private JLabel lblMonth;
	private JComboBox cbDay;
	private JLabel lblDay;
	
	private JLabel lblPM;
	private JComboBox cbbefore;
	private JLabel lblBefore;
	private JComboBox cbafter;
	private JLabel lblAfter;
	
	private JLabel lblInstitution;
	private JComboBox cbInstitution;
	
	private JButton Search;
	private JButton Return;
	
	

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
		
		lblDate = new JLabel("年月日");
		lblDate.setBounds(25, 45, 50, 13);
		contentPane.add(lblDate);
		
		cbYear = new JComboBox();
		cbYear.setBounds(98, 41, 96, 21);
		cbYear.setModel(new DefaultComboBoxModel(new String[] {"2022", "2023"}));
		contentPane.add(cbYear);
		
		lblYear = new JLabel("年");
		lblYear.setBounds(202, 45, 21, 13);
		contentPane.add(lblYear);
		
		String[] Month={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		cbMonth = new JComboBox(Month);
		cbMonth.setBounds(244, 41, 39, 21);
		getContentPane().add(cbMonth);
		cbMonth.addActionListener(this);
		
		lblMonth = new JLabel("月");
		lblMonth.setBounds(288, 45, 21, 13);
		contentPane.add(lblMonth);
		
		String[] Day={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		cbDay = new JComboBox(Day);
		cbDay.setBounds(321, 41, 39, 21);
		getContentPane().add(cbDay);
		cbDay.addActionListener(this);
		
		lblDay = new JLabel("日");
		lblDay.setBounds(370, 45, 21, 13);
		contentPane.add(lblDay);
		
		lblPM = new JLabel("時刻");
		lblPM.setBounds(38, 108, 37, 13);
		contentPane.add(lblPM);
		
		String[] before={"9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"};
		cbbefore = new JComboBox(before);
		cbbefore.setBounds(98, 104, 39, 21);
		getContentPane().add(cbbefore);
		cbbefore.addActionListener(this);
		
		lblBefore = new JLabel("時");
		lblBefore.setBounds(149, 108, 21, 13);
		contentPane.add(lblBefore);
		
		JLabel lblNewLabel = new JLabel("～");
		lblNewLabel.setBounds(193, 108, 30, 13);
		contentPane.add(lblNewLabel);
		
		String[] after={"9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"};
		cbafter = new JComboBox(after);
		cbafter.setBounds(244, 104, 39, 21);
		getContentPane().add(cbafter);
		cbafter.addActionListener(this);
		
		lblAfter = new JLabel("時");
		lblAfter.setBounds(293, 108, 21, 13);
		contentPane.add(lblAfter);
		
		lblInstitution = new JLabel("施設");
		lblInstitution.setBounds(38, 163, 30, 13);
		contentPane.add(lblInstitution);
		
		String[] institution = {"体育館", "野球場", "サッカー場", "テニスコート", "プール"};
		cbInstitution = new JComboBox(institution);
		cbInstitution.setBounds(98, 159, 114, 21);
		getContentPane().add(cbInstitution);
		cbInstitution.addActionListener(this);
		
		Search = new JButton("検索");
		Search.setBounds(98, 218, 91, 21);
		contentPane.add(Search);
		getContentPane().add(Search);
		Search.addActionListener(this);
		
		Return = new JButton("キャンセル");
		Return.setBounds(244, 218, 104, 21);
		contentPane.add(Return);
		getContentPane().add(Return);
		Return.addActionListener(this);
		

		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Search) {
			setVisible(false);
			
			Controller.AkikekkaDisplay();
			String before =(String)cbbefore.getSelectedItem();
			String after = (String)cbafter.getSelectedItem();
			String year = (String)cbYear.getSelectedItem();
			String month = (String)cbMonth.getSelectedItem();
			String day = (String)cbDay.getSelectedItem();
			String institution = (String)cbInstitution.getSelectedItem();
			int benum = Integer.parseInt(before);
			int afnum = Integer.parseInt(after);
			int bemonth = Integer.parseInt(month);
			int beday = Integer.parseInt(day);
			
			if(benum>=afnum&&bemonth==2&&beday>28) {
				 JOptionPane.showMessageDialog(this, "正しい日付と時刻を入力してください。", "エラー", JOptionPane.WARNING_MESSAGE);
			}else if(benum>=afnum&&bemonth==4&&beday==31) {
				JOptionPane.showMessageDialog(this, "正しい日付と時刻を入力してください。", "エラー", JOptionPane.WARNING_MESSAGE);
			}else if(benum>=afnum&&bemonth==6&&beday==31) {
				JOptionPane.showMessageDialog(this, "正しい日付と時刻を入力してください。", "エラー", JOptionPane.WARNING_MESSAGE);
			}else if(benum>=afnum&&bemonth==9&&beday==31) {
				JOptionPane.showMessageDialog(this, "正しい日付と時刻を入力してください。", "エラー", JOptionPane.WARNING_MESSAGE);
			}else if(benum>=afnum&&bemonth==11&&beday==31) {
				JOptionPane.showMessageDialog(this, "正しい日付と時刻を入力してください。", "エラー", JOptionPane.WARNING_MESSAGE);
			}else if(benum>=afnum) {
				 JOptionPane.showMessageDialog(this, "正しい時刻を入力してください。", "エラー", JOptionPane.WARNING_MESSAGE);
			}else if(bemonth==2&&beday>28) {
				 JOptionPane.showMessageDialog(this, "正しい日付を入力してください。", "エラー", JOptionPane.WARNING_MESSAGE);
			}else if(bemonth==4&&beday==31) {
				JOptionPane.showMessageDialog(this, "正しい日付を入力してください。", "エラー", JOptionPane.WARNING_MESSAGE);
			}else if(bemonth==6&&beday==31) {
				JOptionPane.showMessageDialog(this, "正しい日付を入力してください。", "エラー", JOptionPane.WARNING_MESSAGE);
			}else if(bemonth==9&&beday==31) {
				JOptionPane.showMessageDialog(this, "正しい日付を入力してください。", "エラー", JOptionPane.WARNING_MESSAGE);
			}else if(bemonth==11&&beday==31) {
				JOptionPane.showMessageDialog(this, "正しい日付を入力してください。", "エラー", JOptionPane.WARNING_MESSAGE);
			}
			
		}else if(e.getSource() == Return) {
			setVisible(false);
            Controller.loginafterDisplay();
		}
	}
}
