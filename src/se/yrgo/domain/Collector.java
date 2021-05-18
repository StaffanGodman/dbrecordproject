package se.yrgo.domain;

public class Collector implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int collectorId; // primary key
	private String userName;
	private String email;
	
	public Collector() {}

	public Collector(String userName, String email) {
		this.userName = userName;
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCollectorId() {
		return collectorId;
	}

	@Override
	public String toString() {
		return "Collector [collectorId=" + collectorId + ", userName=" + userName + ", email=" + email + "]";
	}
	
	
	
}