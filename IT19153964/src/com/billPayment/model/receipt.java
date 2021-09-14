package com.billPayment.model;

public class receipt {

	private String company ;
	private String receiptNo ;
	private String userName ;
	private float amount ;
	
	public receipt()
	{
		
	}
	public receipt(String company,String ReceiptNo, String userName, float amount) 
	{
		this.company = company;
		this.receiptNo = ReceiptNo;
		this.userName = userName;
		this.amount = amount;
	}
	public String getCompany() {
		return company;
	}
	public String getReceiptNo()
	{
		return receiptNo;
	}
	public String getUserName() {
		return userName;
	}
	public float getAmount() {
		return amount;
	}
	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}
	
}
