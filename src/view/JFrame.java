package view;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JFrame extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
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
	public JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ログインID");
		lblNewLabel.setBounds(12, 31, 90, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("パスワード");
		lblNewLabel_1.setBounds(12, 82, 90, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("氏名");
		lblNewLabel_2.setBounds(12, 147, 50, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("生年月日");
		lblNewLabel_3.setBounds(12, 201, 66, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("住所");
		lblNewLabel_4.setBounds(12, 276, 50, 13);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(105, 35, 152, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(105, 86, 152, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(105, 144, 133, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("姓");
		lblNewLabel_5.setBounds(88, 147, 14, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("名");
		lblNewLabel_6.setBounds(312, 189, 50, -11);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("名");
		lblNewLabel_7.setBounds(250, 147, 24, 13);
		contentPane.add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setBounds(286, 144, 152, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("性別");
		lblNewLabel_8.setBounds(12, 237, 50, 13);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("年");
		lblNewLabel_9.setBounds(183, 201, 14, 13);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("月");
		lblNewLabel_10.setBounds(274, 201, 14, 13);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("日");
		lblNewLabel_11.setBounds(374, 201, 24, 13);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("都道府県");
		lblNewLabel_12.setBounds(48, 276, 50, 13);
		contentPane.add(lblNewLabel_12);
		
		textField_7 = new JTextField();
		textField_7.setBounds(105, 273, 115, 19);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("市区群以下");
		lblNewLabel_13.setBounds(232, 276, 66, 13);
		contentPane.add(lblNewLabel_13);
		
		textField_8 = new JTextField();
		textField_8.setBounds(312, 273, 306, 19);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("電話番号");
		lblNewLabel_14.setBounds(12, 311, 50, 13);
		contentPane.add(lblNewLabel_14);
		
		textField_9 = new JTextField();
		textField_9.setBounds(105, 308, 205, 19);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton = new JButton("登録");
		btnNewButton.setBounds(123, 351, 113, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("キャンセル");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(312, 350, 126, 43);
		contentPane.add(btnNewButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("男性");
		rdbtnNewRadioButton.setBounds(105, 233, 56, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("女性");
		rdbtnNewRadioButton_1.setBounds(222, 233, 56, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("どちらでもない");
		rdbtnNewRadioButton_2.setSelected(true);
		rdbtnNewRadioButton_2.setBounds(325, 233, 113, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_15 = new JLabel("※半角英数字8文字以上16字以内");
		lblNewLabel_15.setBounds(105, 121, 199, 13);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("※半角英数字");
		lblNewLabel_16.setBounds(105, 63, 96, 13);
		contentPane.add(lblNewLabel_16);  
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"}));
		comboBox.setBounds(105, 197, 66, 21);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setBounds(209, 197, 54, 21);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_2.setBounds(306, 197, 56, 21);
		contentPane.add(comboBox_2);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}