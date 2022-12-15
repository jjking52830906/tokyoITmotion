package model;

public class Yoyaku {
	private String strDate;
	private String hour;
	private String basho;
	
	public Yoyaku() {
		
	}
	
	
	public Yoyaku(String getStrDate, String getHour, String getBasho) {
		setStrDate(getStrDate);
		setHour(getHour);
		setBasho(getBasho);
	}
	
	public String getHour() {
		return hour;
	}


	public void setHour(String hour) {
		this.hour = hour;
	}


	public String getStrDate() {
		return strDate;
	}

	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}

	public String getBasho() {
		return basho;
	}

	public void setBasho(String basho) {
		this.basho = basho;
	}
}
