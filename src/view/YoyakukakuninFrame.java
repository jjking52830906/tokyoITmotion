package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import control.Controller;

public class YoyakukakuninFrame extends JFrame implements ActionListener{

	private JPanel contentPane;

	private JScrollPane scrollPane;
	private DefaultTableModel tableModel;
	private JTable table;

	private JButton Return;

	static int pass;
	public YoyakukakuninFrame(int input) {
		setTitle("【予約確認画面】");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		Return = new JButton("戻る");
		Return.setBounds(373, 347, 130, 41);
		contentPane.add(Return);
		getContentPane().add(Return);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 491, 327);
		contentPane.add(scrollPane);
		Return.addActionListener(this);

		String[] columnNames = {"氏名", "年月日", "時刻", "施設名"};
		tableModel = new DefaultTableModel(columnNames, 0);
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

		setVisible(true);
		pass = input;
		System.out.println(pass);

		try {
			Object[][] tableData = Controller.yoyakukakunin(pass);
			if(tableData != null) {

				tableModel.setRowCount(0);

				for(Object[] rowData : tableData) {

					tableModel.addRow(rowData);
				}
			}else {
				JOptionPane.showMessageDialog(this, "一致する情報は見つかりませんでした。", "【確認】", JOptionPane.INFORMATION_MESSAGE);
				tableModel.setRowCount(0);
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "一致する情報は見つかりませんでした。", "【確認】", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void actionPerformed(ActionEvent e) { 
		if(e.getSource() == Return) {
			setVisible(false);
			try {
				Controller. inputToLoginAfterFrame(pass);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}