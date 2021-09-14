package com.bank.model;

public class User {
	
	/**
	 * declare variables
	 */
	private int CusId;
	private String CusName;
	private String AccountNo;
	private String IDNo;
	private String MobileNo;
	private String Email;
	private String UserName;
	private String Password;
	
	/**
	 * constructor
	 * @param cusId
	 * @param cusName
	 * @param accountNo
	 * @param iDNo
	 * @param mobileNo
	 * @param email
	 * @param userName
	 * @param password
	 */
	public User(int cusId, String cusName, String accountNo, String iDNo, String mobileNo, String email,
			String userName, String password) {
		super();
		CusId = cusId;
		CusName = cusName;
		AccountNo = accountNo;
		IDNo = iDNo;
		MobileNo = mobileNo;
		Email = email;
		UserName = userName;
		Password = password;
	}
	
	/**
	 * overload constructor
	 */
	public User() {
		
	}

	/**
	 * setters and getters
	 * @return
	 */
	public int getCusId() {
		return CusId;
	}

	public String getCusName() {
		return CusName;
	}

	public String getAccountNo() {
		return AccountNo;
	}

	public String getIDNo() {
		return IDNo;
	}

	public String getMobileNo() {
		return MobileNo;
	}

	public String getEmail() {
		return Email;
	}

	public String getUserName() {
		return UserName;
	}

	public String getPassword() {
		return Password;
	}

	public void setCusId(int cusId) {
		CusId = cusId;
	}

	public void setCusName(String cusName) {
		CusName = cusName;
	}

	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}

	public void setIDNo(String iDNo) {
		IDNo = iDNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	

}
