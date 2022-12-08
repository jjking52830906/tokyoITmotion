package view;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import control.Controller;

public class AkijyoukyoukensakukekkaFrame extends JFrame {

	private JPanel contentPane;
	
	private JScrollPane scrollPane;
	private DefaultTableModel tableModel;
	private JTable table;
	
	private JButton Return;
	

	/**
	 * Create the frame.
	 */
	public AkijyoukyoukensakukekkaFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(12, 10, 544, 338);
		contentPane.add(scrollPane);
		
		String[] columnNames = {"年月日", "開始時刻", "終了時刻", "施設名"};
		tableModel = new DefaultTableModel(columnNames, 0);
		table = new JTable(tableModel);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		DefaultTableColumnModel columnModel = (DefaultTableColumnModel) table.getColumnModel();
		TableColumn column0 = columnModel.getColumn(0);
		TableColumn column1 = columnModel.getColumn(1);
		TableColumn column2 = columnModel.getColumn(2);
		TableColumn column3 = columnModel.getColumn(3);
		column0.setPreferredWidth(40);
		column1.setPreferredWidth(90);
		column2.setPreferredWidth(90);
		column3.setPreferredWidth(240);
		
		table.addMouseListener(new AkiSearchMouseEvent());
		
		scrollPane.setViewportView(table);
		
		Return = new JButton("キャンセル");
		Return.setBounds(428, 358, 128, 31);
		contentPane.add(Return);
		Return.addActionListener(this);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Return) {
			setVisible(false);
			
			Controller.mainMenuDisplay();
		}
	}
	
	private class AkiSearchMouseEvent extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			setVisible(false);
		}
	}
	
}