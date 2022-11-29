package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import control.Controller;
public class RegisterFrame extends JFrame implements ActionListener{
    private JPanel contentPane;
    
    private JLabel lblId;
    private JLabel lblIdNote;
    private JTextField txtId;
    
    private JLabel lblPass;
    private JLabel lblPassNote;
    private JTextField txtPass;
    
    private JLabel lblName;
    
    private JLabel lblFName;
    private JTextField txtFName;
    
    private JLabel lblLName;
    private JTextField txtLName;
    
    private JLabel lblBirth;
    private JComboBox cbYear;
    private JComboBox cbMonth;
    private JComboBox cbDay;
    
    private JLabel lblAddress;
    private JLabel lblFAddress;
    private JComboBox cbFAddress;
    private JLabel lblLAddress;
    private JTextField txtLAddress;
    
    private JLabel lblSex;
    private JRadioButton[] rbSex;
    
    
    private JLabel lblTel;
    private JLabel lblTelNote;
    private JTextField txtTel;
    
    private JButton Return;
    private JButton Register;
    /**
     * Create the frame.
     */
    public RegisterFrame() {
        setTitle("【登録画面】");
        setDefaultCloseOperation(RegisterFrame.EXIT_ON_CLOSE);
        setBounds(420, 150, 625, 463);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lblId = new JLabel("ログインID");
        lblId.setBounds(12, 32, 90, 27);
        getContentPane().add(lblId);
        
        lblIdNote = new JLabel("※半角英数字");
        lblIdNote.setBounds(105, 56, 96, 13);
        contentPane.add(lblIdNote);
        
        txtId = new JTextField();
        txtId.setBounds(105, 36, 152, 19);
        getContentPane().add(txtId);
        txtId.setColumns(10);
        
        lblPass = new JLabel("パスワード");
        lblPass.setBounds(12, 79, 90, 27);
        getContentPane().add(lblPass);
        
        lblPassNote = new JLabel("※半角英数字6文字以上16字以内");
        lblPassNote.setBounds(105, 108, 199, 13);
        getContentPane().add(lblPassNote);
        
        txtPass = new JTextField();
        txtPass.setBounds(105, 83, 152, 19);
        getContentPane().add(txtPass);
        txtPass.setColumns(10);
        
        lblName = new JLabel("氏名");
        lblName.setBounds(12, 142, 50, 13);
        getContentPane().add(lblName);
        
        lblLName = new JLabel("姓");
        lblLName.setBounds(74, 145, 14, 13);
        getContentPane().add(lblLName);
        
        txtLName = new JTextField();
        txtLName.setBounds(105, 142, 152, 19);
        getContentPane().add(txtLName);
        txtLName.setColumns(10);
        
        lblFName = new JLabel("名");
        lblFName.setBounds(294, 145, 24, 13);
        getContentPane().add(lblFName);
        
        txtFName = new JTextField();
        txtFName.setBounds(329, 142, 152, 19);
        getContentPane().add(txtFName);
        txtFName.setColumns(10);
        
        lblBirth = new JLabel("生年月日");
        lblBirth.setBounds(12, 185, 66, 13);
        getContentPane().add(lblBirth);
        
        String[] year = {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"};
        cbYear = new JComboBox(year);
        cbYear.setBounds(105, 181, 66, 21);
        getContentPane().add(cbYear);
        cbYear.addActionListener(this);
        
        String[] month = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        cbMonth = new JComboBox(month);
        cbMonth.setBounds(228, 181, 54, 21);
        getContentPane().add(cbMonth);
        cbMonth.addActionListener(this);
        
        String[] day = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        cbDay = new JComboBox(day);
        cbDay.setBounds(341, 181, 56, 21);
        getContentPane().add(cbDay);
        cbDay.addActionListener(this);
        
        lblAddress = new JLabel("住所");
        lblAddress.setBounds(12, 259, 50, 13);
        getContentPane().add(lblAddress);
                
        lblFAddress = new JLabel("都道府県");
        lblFAddress.setBounds(49, 259, 50, 13);
        getContentPane().add(lblFAddress);
        
        String[] fAddress = {"北海道", "青森県", "岩手県", "宮城県", "秋田県", "山形県", "福島県", "茨城県", "栃木県", "群馬県", "埼玉県", "千葉県", "東京都", "神奈川県", "新潟県", "富山県", "石川県", "福井県", "山梨県", "長野県", "岐阜県", "静岡県", "愛知県", "三重県", "滋賀県", "京都府", "大阪府", "兵庫県", "奈良県", "和歌山県", "鳥取県", "島根県", "岡山県", "広島県", "山口県", "徳島県", "香川県", "愛媛県", "高知県", "福岡県", "佐賀県", "長崎県", "熊本県", "大分県", "宮崎県", "鹿児島県", "沖縄県"};
        cbFAddress = new JComboBox(fAddress);
        cbFAddress.setBounds(105, 255, 79, 21);
        getContentPane().add(cbFAddress);
        
        lblLAddress = new JLabel("市区町村以下");
        lblLAddress.setBounds(199, 259, 78, 13);
        getContentPane().add(lblLAddress);
        
        txtLAddress = new JTextField();
        txtLAddress.setBounds(277, 256, 306, 19);
        getContentPane().add(txtLAddress);
        txtLAddress.setColumns(10);
        
        lblSex = new JLabel("性別");
        lblSex.setBounds(12, 223, 50, 13);
        getContentPane().add(lblSex);
        
        rbSex = new JRadioButton[3];
        
        rbSex[0] = new JRadioButton("男性");
        rbSex[1] = new JRadioButton("女性", true);
        rbSex[2] = new JRadioButton("どちらでもない");
        
        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(rbSex[0]);
        bgroup.add(rbSex[1]);
        bgroup.add(rbSex[2]);
        
        rbSex[0].setSelected(true);
        rbSex[0].setBounds(105, 217, 56, 21);
        rbSex[1].setBounds(183, 217, 56, 21);
        rbSex[2].setBounds(264, 217, 113, 21);
        
        contentPane.add(rbSex[0]);
        contentPane.add(rbSex[1]);
        contentPane.add(rbSex[2]);
        
        lblTel = new JLabel("電話番号");
        lblTel.setBounds(12, 302, 50, 13);
        contentPane.add(lblTel);
        
        
        lblTelNote = new JLabel("※ハイフンなし");
        lblTelNote.setBounds(105, 322, 92, 13);
        contentPane.add(lblTelNote);
        
        
        txtTel = new JTextField();
        txtTel.setBounds(105, 299, 261, 19);
        contentPane.add(txtTel);
        txtTel.setColumns(10);
                
        Register = new JButton("登録");
        Register.setBounds(123, 351, 113, 41);
        contentPane.add(Register);
        Register.addActionListener(this);
        
        Return = new JButton("キャンセル");
        Return.setBounds(312, 350, 126, 43);
        contentPane.add(Return);
        Return.addActionListener(this);
        
        
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == Register) {
             String id = txtId.getText();
             String pass = txtPass.getText();
             String fname = txtFName.getText();
             String lname = txtLName.getText();
             String year = (String)cbYear.getSelectedItem();
             String month = (String)cbMonth.getSelectedItem();
             String day = (String)cbDay.getSelectedItem();
             String fAddress = (String)cbFAddress.getSelectedItem();
             String lAddress = txtLAddress.getText();
             String tel = txtTel.getText();
             String strDate = year + "-" + month + "-" + day;
             Date date = Date.valueOf(strDate);
             
             
             String radio = "";
             for (int i = 0 ; i < rbSex.length; i++){
                 if (rbSex[i].isSelected()){
                   radio = rbSex[i].getText();
                 }
             }
             
             int passlength = pass.length();
             String regex_AlphaNum = "^[A-Za-z0-9]+$" ; // 半角英数字のみ
             if(!(id.equals("")) && !(pass.equals("")) && !(fname.equals("")) && !(lname.equals("")) && !(lAddress.equals("")) && !(tel.equals(""))) {
                 if(!(checkLogic(regex_AlphaNum, id) == true)) {
                     JOptionPane.showMessageDialog(this, "ログインIDには半角英数字のみ入力してください", "入力エラー", JOptionPane.WARNING_MESSAGE);
                     return;
                 }else if(!((checkLogic(regex_AlphaNum, pass) == true) && passlength > 6 && passlength <= 16)){
                     JOptionPane.showMessageDialog(this, "パスワードには半角英数字で6文字以上16文字以内で入力してください", "入力エラー", JOptionPane.WARNING_MESSAGE);
                     return;
                 }
                 try {
                     Long.parseLong(tel);
                 }catch(NumberFormatException n) {
                     JOptionPane.showMessageDialog(this, "電話番号には数字を入力してください", "入力値エラー", JOptionPane.WARNING_MESSAGE);
                     return;
                 }
                 try {
                	 int rel = Controller.passwordRegister(pass);
                	 if(rel == 1) {
                		 JOptionPane.showMessageDialog(this, "パスワード登録に成功しました。！");
                	 }else {
                		 JOptionPane.showMessageDialog(this, "パスワード登録に失敗しました。！");
                	 }
                 }catch(Exception ex) {
                	 ErrorDialogUtility.systemErrorMessage(this, ex);
                 }
                 try {
                     int res = Controller.accountRegister(id, fname, lname, date, radio, fAddress, lAddress, tel);
                     if(res == 1) {
                         JOptionPane.showMessageDialog(this, "アカウント登録に成功しました！", "登録完了", JOptionPane.INFORMATION_MESSAGE);
                     }else {
                         JOptionPane.showMessageDialog(this, "アカウント登録に失敗しました", "登録失敗", JOptionPane.WARNING_MESSAGE);
                     }
                 }catch(Exception ex) {
                     ErrorDialogUtility.systemErrorMessage(this, ex);
                 }
                 
                 txtId.setText("");
                 txtPass.setText("");
                 txtFName.setText("");
                 txtLName.setText("");
                 txtLAddress.setText("");
                 txtTel.setText("");
             }else {
                 JOptionPane.showMessageDialog(this, "未入力の項目があります", "エラー", JOptionPane.WARNING_MESSAGE);
             }
        }else if(e.getSource() == Return) {
            setVisible(false);
            Controller.mainMenuDisplay();
        }
    }
    //半角英数字判定処理
    private boolean checkLogic(String regex, String target) {
         boolean result = true;
            if( target == null || target.isEmpty() ) return false ;
            // 3. 引数に指定した正規表現regexがtargetにマッチするか確認する
            Pattern p1 = Pattern.compile(regex); // 正規表現パターンの読み込み
            Matcher m1 = p1.matcher(target); // パターンと検査対象文字列の照合
            result = m1.matches(); // 照合結果をtrueかfalseで取得
            return result;
    }
}