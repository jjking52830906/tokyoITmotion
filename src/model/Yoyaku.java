package model;

import java.io.Serializable;

public class Yoyaku implements Serializable{
	private String strDate;
	private String hour;
	private int bashoId;
	private String status;
	private int custId;
	
	public Yoyaku() {
	}

	public Yoyaku(String strDate, String hour, int bashoId) {
		setStrDate(strDate);
		setHour(hour);
		setBashoId(bashoId);
	}

	public String getStrDate() {
		return strDate;
	}

	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public int getBashoId() {
		return bashoId;
	}

	public void setBashoId(int bashoId) {
		this.bashoId = bashoId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}
	
	
}


