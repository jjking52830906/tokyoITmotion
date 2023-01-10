package model;

import java.io.Serializable;
import java.sql.Date;

public class Yoyaku implements Serializable{
	private Date date;
	private String hour;
	private String bashoId;
	private String status;
	private int custId;
	
	public Yoyaku() {
	}
	
	public Yoyaku(Date date, String hour, String bashoId, String status, int custId) {
		setDate(date);
		setHour(hour);
		setBashoId(bashoId);
		setStatus(status);
		setCustId(custId);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getBashoId() {
		return bashoId;
	}

	public void setBashoId(String bashoId) {
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


