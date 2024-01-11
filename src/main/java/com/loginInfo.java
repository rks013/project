package com;

public class loginInfo {

	String userName;
	String password;
	
	public loginInfo() {
		
	}
	
	public loginInfo(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginInfo [userName=" + userName + ", Password=" + password + "]";
	}
	
}