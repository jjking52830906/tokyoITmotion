package model;

import java.io.Serializable;
import java.sql.Date;

public class Yoyaku implements Serializable{
	private Date date;
	private int hour;
	private int bashoId;
	private String status;
	private int custId;
	
	public Yoyaku() {
	}

	public Yoyaku(Date date, int hour, int bashoId) {
		setDate(date);
		setHour(hour);
		setBashoId(bashoId);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
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


