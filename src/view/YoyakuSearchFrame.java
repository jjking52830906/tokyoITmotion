package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import control.Controller;

public class YoyakuSearchFrame extends JFrame implements ActionListener{

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
	
	private JScrollPane scrollPane;
	private DefaultTableModel tableModel;
	private JTable table;
	
	private JButton Search;
	private JButton Return;

	/**
	 * Create the frame.
	 */
	public YoyakuSearchFrame() {
		setTitle("【予約登録画面】");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 828, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDate = new JLabel("年月日");
		lblDate.setBounds(25, 98, 50, 13);
		contentPane.add(lblDate);
		
		cbYear = new JComboBox();
		cbYear.setBounds(87, 94, 96, 21);
		cbYear.setModel(new DefaultComboBoxModel(new String[] {"2022", "2023"}));
		contentPane.add(cbYear);
		
		lblYear = new JLabel("年");
		lblYear.setBounds(201, 98, 21, 13);
		contentPane.add(lblYear);
		
		String[] Month={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		cbMonth = new JComboBox(Month);
		cbMonth.setBounds(234, 94, 39, 21);
		getContentPane().add(cbMonth);
		cbMonth.addActionListener(this);
		
		lblMonth = new JLabel("月");
		lblMonth.setBounds(285, 98, 21, 13);
		contentPane.add(lblMonth);
		
		String[] Day={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		cbDay = new JComboBox(Day);
		cbDay.setBounds(310, 94, 39, 21);
		getContentPane().add(cbDay);
		cbDay.addActionListener(this);
		
		lblDay = new JLabel("日");
		lblDay.setBounds(361, 98, 21, 13);
		contentPane.add(lblDay);
		
		lblPM = new JLabel("時刻");
		lblPM.setBounds(38, 160, 37, 13);
		contentPane.add(lblPM);
		
		String[] before={"9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"};
		cbbefore = new JComboBox(before);
		cbbefore.setBounds(98, 156, 39, 21);
		getContentPane().add(cbbefore);
		cbbefore.addActionListener(this);
		
		lblBefore = new JLabel("時");
		lblBefore.setBounds(149, 160, 21, 13);
		contentPane.add(lblBefore);
		
		JLabel lblNewLabel = new JLabel("～");
		lblNewLabel.setBounds(182, 156, 30, 13);
		contentPane.add(lblNewLabel);
		
		String[] after={"9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"};
		cbafter = new JComboBox(after);
		cbafter.setBounds(224, 156, 39, 21);
		getContentPane().add(cbafter);
		cbafter.addActionListener(this);
		
		lblAfter = new JLabel("時");
		lblAfter.setBounds(285, 160, 21, 13);
		contentPane.add(lblAfter);
		
		lblInstitution = new JLabel("施設");
		lblInstitution.setBounds(38, 215, 30, 13);
		contentPane.add(lblInstitution);
		
		String[] institution = {"体育館", "野球場", "サッカー場", "テニスコート", "プール"};
		cbInstitution = new JComboBox(institution);
		cbInstitution.setBounds(97, 211, 114, 21);
		getContentPane().add(cbInstitution);
		cbInstitution.addActionListener(this);
		
		Search = new JButton("検索");
		Search.setBounds(52, 329, 131, 41);
		contentPane.add(Search);
		getContentPane().add(Search);
		Search.addActionListener(this);
		
		Return = new JButton("キャンセル");
		Return.setBounds(224, 326, 122, 41);
		contentPane.add(Return);
		getContentPane().add(Return);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(403, 10, 397, 475);
		contentPane.add(scrollPane);
		Return.addActionListener(this);
		
		String[] columnNames = {"年月日", "時刻", "施設名"};
		tableModel = new DefaultTableModel(columnNames, 0);
		table = new JTable(tableModel);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		DefaultTableColumnModel columnModel = (DefaultTableColumnModel) table.getColumnModel();
		TableColumn column0 = columnModel.getColumn(0);
		TableColumn column1 = columnModel.getColumn(1);
		TableColumn column2 = columnModel.getColumn(2);
		column0.setPreferredWidth(150);
		column1.setPreferredWidth(100);
		column2.setPreferredWidth(100);
		
		table.addMouseListener(new SearchMouseEvent());
		
		scrollPane.setViewportView(table);
		
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Search) {
			String before =(String)cbbefore.getSelectedItem();
			String after = (String)cbafter.getSelectedItem();
			String year = (String)cbYear.getSelectedItem();
			String month = (String)cbMonth.getSelectedItem();
			String day = (String)cbDay.getSelectedItem();
			String basho = (String)cbInstitution.getSelectedItem();
			int benum = Integer.parseInt(before);
			int afnum = Integer.parseInt(after);
			int bemonth = Integer.parseInt(month);
			int beday = Integer.parseInt(day);
			String strDate = year + "-" + month + "-" + day;
			Date date = Date.valueOf(strDate);
			

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
			try {
				String[] data = {strDate, before, after, basho};
				String[][] tableData = Controller.akiSearch(data);
				
				if(tableData != null) {
					tableModel.setRowCount(0);
					
					for(String[] rowData : tableData) {
						tableModel.addRow(rowData);
					}
				}
			}catch (Exception ex) {
				JOptionPane.showMessageDialog(this, "一致する情報は見つかりませんでした。", "【確認】", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if(e.getSource() == Return) {
			setVisible(false);
			Controller.mainMenuDisplay();
		}
	}
	
	private class SearchMouseEvent extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			setVisible(false);
			
			int rowIndex = table.getSelectedRow();
			String id = (String)table
		}
	}
}
