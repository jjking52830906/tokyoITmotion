package model;

import java.io.Serializable;

public class IdPass implements Serializable{
	private String id;
	private String pass;
	
	public IdPass() {
		
	}
	
	public IdPass(String getId, String getPass) {
		setId(id);
		setPass(pass);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}