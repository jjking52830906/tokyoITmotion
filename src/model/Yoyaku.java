package model;

public class Yoyaku {
	private String strDate;
	private String before;
	private String after;
	private String basho;
	
	public Yoyaku() {
	}
	
	public void Yoyaku(String strDate, String getBefore, String getAfter, String getBasho) {
		this.strDate = strDate;
		this.before = getBefore;
		this.after = getAfter;
		this.basho = getBasho;
	}
	
	public String getStrDate() {
		return strDate;
	}

	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}

	public String getBefore() {
		return before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public String getAfter() {
		return after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public String getBasho() {
		return basho;
	}

	public void setBasho(String basho) {
		this.basho = basho;
	}
}
