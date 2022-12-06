package model;
import java.io.Serializable;
import java.sql.Date;
public class Customer implements Serializable{
    private int custId;
    private String rogid;
    private String rogpass;
    private String firstName;
    private String lastName;
    private Date birth;
    private String sex;
    private String firstAddress;
    private String lastAddress;
    private int tel;
    
    public Customer() {
    }
    
    public Customer(String rogid, String rogpass) {
    	this.rogid = rogid;
    	this.rogpass = rogpass;
    }
    
    public Customer(int custId, String rogid, String rogpass, String firstName, String lastName, Date birth, String sex, String firstAddress, String lastAddress, int tel) {
        this.custId = custId;
        this.rogid = rogid;
        this.rogpass = rogpass;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
        this.sex = sex;
        this.firstAddress = firstAddress;
        this.lastAddress = lastAddress;
        this.tel = tel;
    }
    public int getCustId() {
        return custId;
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }
    public String getRogid() {
    	return rogid;
    }
    public void setRogid(String rogid) {
    	this.rogid = rogid;
    }
    public String getRogpass() {
    	return rogpass;
    }
    public void setRogpass(String rogpass) {
    	this.rogpass = rogpass;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Date getBirth() {
        return birth;
    }
    public void setBirth(Date birth) {
        this.birth = birth;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getFirstAddress() {
        return firstAddress;
    }
    public void setFirstAddress(String firstAddress) {
        this.firstAddress = firstAddress;
    }
    public String getLastAddress() {
        return lastAddress;
    }
    public void setLastAddress(String lastAddress) {
        this.lastAddress = lastAddress;
    }
    public int getTel() {
        return tel;
    }
    public void setTel(int tel) {
        this.tel = tel;
    }
    
    
}