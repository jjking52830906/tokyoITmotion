package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;

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
import model.Yoyaku;

public class YoyakuSearchFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	
	private JLabel lblDate;
	private JComboBox cbYear;
	private JLabel lblYear;
	private JComboBox cbMonth;
	private JLabel lblMonth;
	private JComboBox cbDay;
	private JLabel lblDay;
	
	private JLabel lblInstitution;
	private JComboBox cbInstitution;
	
	private JScrollPane scrollPane;
	private DefaultTableModel tableModel;
	private JTable table;
	
	private JButton register;
	private JButton Search;
	private JButton Return;
	
	private static final long serialversionUID = 1L;

	static int pass;
	public YoyakuSearchFrame(int input) {
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
		cbYear.setModel(new DefaultComboBoxModel(new String[] {"2023"}));
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
		
		String[] before={"9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"};
		
		String[] after={"9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"};
		
		lblInstitution = new JLabel("施設");
		lblInstitution.setBounds(45, 170, 30, 13);
		contentPane.add(lblInstitution);
		
		String[] institution = {"体育館", "野球場", "サッカー場", "テニスコート", "プール"};
		cbInstitution = new JComboBox(institution);
		cbInstitution.setBounds(87, 166, 114, 21);
		getContentPane().add(cbInstitution);
		cbInstitution.addActionListener(this);
		
		Search = new JButton("検索");
		Search.setBounds(251, 444, 131, 41);
		contentPane.add(Search);
		getContentPane().add(Search);
		Search.addActionListener(this);
		
		Return = new JButton("キャンセル");
		Return.setBounds(224, 326, 122, 41);
		contentPane.add(Return);
		getContentPane().add(Return);
		Return.addActionListener(this);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(403, 10, 397, 475);
		contentPane.add(scrollPane);
		Return.addActionListener(this);
		
		String[] columnNames = {"チェック", "年月日", "時刻", "施設名"};
		tableModel = new DefaultTableModel(columnNames, 0) {
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				switch (columnIndex) {
					case 0: return Boolean.class;
					default:
						return super.getColumnClass(columnIndex);
				}
			}
		};
		table = new JTable(tableModel);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		DefaultTableColumnModel columnModel = (DefaultTableColumnModel) table.getColumnModel();
		TableColumn column0 = columnModel.getColumn(0);
		TableColumn column1 = columnModel.getColumn(1);
		TableColumn column2 = columnModel.getColumn(2);
		TableColumn column3 = columnModel.getColumn(3);
		column0.setPreferredWidth(90);
		column1.setPreferredWidth(150);
		column2.setPreferredWidth(100);
		column3.setPreferredWidth(100);
		
		scrollPane.setViewportView(table);
		
		register = new JButton("登録");
		register.setBounds(52, 326, 131, 41);
		contentPane.add(register);
		register.addActionListener(this);
		
		setVisible(true);
		 pass = input;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Search) { 
			String year = (String)cbYear.getSelectedItem();
			String month = (String)cbMonth.getSelectedItem();
			String day = (String)cbDay.getSelectedItem();
			//日付合体
			String strDate = year + "-" + month + "-" + day;
			String basho = (String)cbInstitution.getSelectedItem();
			String bashoId = "0";
			if(basho == "体育館") {
				bashoId = "1";
			}else if(basho == "野球場") {
				bashoId = "2";
			}else if(basho == "サッカー場") {
				bashoId = "3";
			}else if(basho == "テニスコート") {
				bashoId = "4";
			}else if(basho == "プール") {
				bashoId = "5";
			}
			try {
				
				String[] data = {strDate, bashoId};
				Object[][] tableData = Controller.akiHyoji(data);
				
				if(tableData != null) {
					tableModel.setRowCount(0);
					for(Object[] rowData : tableData) {
						
						tableModel.addRow(rowData);
						
					}
				} else {
					JOptionPane.showMessageDialog(this, "一致する情報は見つかりませんでした。", "【確認】", JOptionPane.INFORMATION_MESSAGE);
					tableModel.setRowCount(0);
				}
			}catch (Exception ex) {
				JOptionPane.showMessageDialog(this, "一致する情報は見つかりませんでした。", "【確認】", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource() == Return) {
			setVisible(false);
			try {
				Controller. inputToLoginAfterFrame(pass);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(e.getSource() == register) {
			int rowcount = tableModel.getRowCount();
			Boolean[] bolean = new Boolean[rowcount];
			ArrayList<Yoyaku> list = null;
			
			for(int j=0; j<rowcount; j++) {
				bolean[j] = (Boolean) tableModel.getValueAt(j, 0);
				if(bolean[j] == true) {
					Date getDate = (Date) tableModel.getValueAt(j, 1);
					int getHour = (int) tableModel.getValueAt(j, 2);
					int getBashoId = (int) tableModel.getValueAt(j, 3);
					Yoyaku yoyaku = new Yoyaku(getDate, getHour, getBashoId);
					list.add(yoyaku);
				}
			}
			try {
				int listSize = list.size();
				if(listSize != 0) {
					Controller.registerYoyaku(list, pass);
				}else {
					JOptionPane.showMessageDialog(this, "選択してください。", "【確認】", JOptionPane.INFORMATION_MESSAGE);
				}
			}catch (Exception ex) {
				ErrorDialogUtility.systemErrorMessage(this, ex);
			}
		}
	}
}
