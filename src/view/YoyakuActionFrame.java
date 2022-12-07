package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Controller;

public class YoyakuActionFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton Return;
	private JComboBox cbbefore;
	private JComboBox cbafter;
	private JButton Search;
	private JComboBox cbMonth;
	private JLabel lblMonth;
	private JComboBox cbDay;
	private JLabel lblDay;

	/**
	 * Create the frame.
	 */
	public YoyakuActionFrame() {
		setTitle("【予約登録画面】");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 448, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		Search = new JButton("検索");
		Search.setBounds(128, 277, 86, 39);
		contentPane.add(Search);
		Search.addActionListener(this);

		Return = new JButton("戻る");
		Return.setBounds(280, 277, 91, 40);
		contentPane.add(Return);
		getContentPane().add(Return);
		Return.addActionListener(this);

		JLabel lblNewLabel = new JLabel("年月日");
		lblNewLabel.setBounds(47, 60, 50, 13);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("時刻");
		lblNewLabel_1.setBounds(47, 134, 50, 13);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("施設");
		lblNewLabel_2.setBounds(47, 208, 50, 13);
		contentPane.add(lblNewLabel_2);

		Calendar cl = Calendar.getInstance();
		int ye = cl.get(Calendar.YEAR);
		int ye1 = ye++;
		Integer yex = Integer.valueOf(ye);
		Integer yex1 = Integer.valueOf(ye1);
		String yez = yex.toString();
		String yez1 = yex1.toString();

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {yez1, yez}));
		comboBox.setBounds(128, 55, 66, 21);
		contentPane.add(comboBox);

		int d = cl.get(Calendar.MONTH);
		int dd = d + 1;
		int ddd = d + 1;


		String M[];
		M = new String[12];

		for(int count=0;count<12;count++) {

			Integer dx = Integer.valueOf(dd);
			String d2 = dx.toString();

			M[count]=d2;

			dd++;
			if(dd==13) {
				dd=1;
			}
		}

		String[] Month={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		cbMonth = new JComboBox(M);
		cbMonth.setBounds(234, 56, 39, 21);
		getContentPane().add(cbMonth);
		cbMonth.addActionListener(this);

		int dayy = cl.get(Calendar.DATE);
		int day1 = dayy;

		String D[];
		D = new String[31];

		if(ddd==2) {
			for(int count=0;count<28;count++) {

				Integer dda = Integer.valueOf(day1);
				String dax = dda.toString();

				D[count]=dax;

				day1++;
				if(day1==29) {
					day1=1;
				}
			}
		}
		
		if(ddd==4 || ddd==6 || ddd==9 || ddd==11) {
			for(int count=0;count<29;count++) {

				Integer dda = Integer.valueOf(day1);
				String dax = dda.toString();

				D[count]=dax;

				day1++;
				if(day1==30) {
					day1=1;
				}
			}
		}

		if(ddd==1 || ddd==3 || ddd==5 || ddd==7 || ddd==8 || ddd==10 || ddd==12) {
			for(int count=0;count<30;count++) {

				Integer dda = Integer.valueOf(day1);
				String dax = dda.toString();

				D[count]=dax;

				day1++;
				if(day1==31) {
					day1=1;
				}
			}
		}



		String[] Day={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		cbDay = new JComboBox(D);
		cbDay.setBounds(321, 56, 39, 21);
		getContentPane().add(cbDay);
		cbDay.addActionListener(this);


		JLabel lblNewLabel_3 = new JLabel("月");
		lblNewLabel_3.setBounds(288, 60, 18, 13);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("日");
		lblNewLabel_4.setBounds(372, 60, 50, 13);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("年");
		lblNewLabel_5.setBounds(204, 60, 18, 13);
		contentPane.add(lblNewLabel_5);

		String[] before={"9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"};
		cbbefore = new JComboBox(before);
		cbbefore.setBounds(128, 130, 42, 21);
		getContentPane().add(cbbefore);
		cbbefore.addActionListener(this);


		JLabel lblNewLabel_6 = new JLabel("時");
		lblNewLabel_6.setBounds(179, 134, 18, 13);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("～");
		lblNewLabel_7.setBounds(222, 134, 24, 13);
		contentPane.add(lblNewLabel_7);

		String[] after={"9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"};
		cbafter = new JComboBox(after);
		cbafter.setBounds(264, 130, 42, 21);
		getContentPane().add(cbafter);
		cbafter.addActionListener(this);

		JLabel lblNewLabel_8 = new JLabel("時");
		lblNewLabel_8.setBounds(325, 134, 21, 13);
		contentPane.add(lblNewLabel_8);

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"体育館", "野球場", "サッカー場", "テニスコート", "プール"}));
		comboBox_5.setBounds(128, 204, 109, 21);
		contentPane.add(comboBox_5);

		JLabel lblNewLabel_9 = new JLabel("※予約可能日は本日から1年後まで");
		lblNewLabel_9.setBounds(131, 83, 215, 13);
		contentPane.add(lblNewLabel_9);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Search) {
			String before =(String)cbbefore.getSelectedItem();
			String after = (String)cbafter.getSelectedItem();
			String month = (String)cbMonth.getSelectedItem();
			String day = (String)cbDay.getSelectedItem();
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
		}
		if(e.getSource() == Return) {
			setVisible(false);
			Controller.mainMenuDisplay();
		}
	}
}
