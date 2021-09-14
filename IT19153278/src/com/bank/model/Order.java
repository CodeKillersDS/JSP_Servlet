package com.bank.model;

public class Order {

	/**
	 * declare variables
	 */
	private int OrderID;
	private String AccountNo;
	private String AccountType;
	private String NoOfChequeBooks;
	private String Branch;
	
	/**
	 * constructor
	 * @param orderID
	 * @param accountNo
	 * @param accountType
	 * @param noOfChequeBooks
	 * @param branch
	 */
	public Order(int orderID, String accountNo, String accountType, String noOfChequeBooks, String branch) {
		super();
		OrderID = orderID;
		AccountNo = accountNo;
		AccountType = accountType;
		NoOfChequeBooks = noOfChequeBooks;
		Branch = branch;
	}
	
	/**
	 * overload constructor
	 */
	public Order() {
		
	}
	
	/**
	 * getters and setters for get and set values
	 * @return
	 */
	public int getOrderID() {
		return OrderID;
	}
	public String getAccountNo() {
		return AccountNo;
	}
	public String getAccountType() {
		return AccountType;
	}
	public String getNoOfChequeBooks() {
		return NoOfChequeBooks;
	}
	public String getBranch() {
		return Branch;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
	}
	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public void setNoOfChequeBooks(String noOfChequeBooks) {
		NoOfChequeBooks = noOfChequeBooks;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
}
