package BankSystem;

public class Customer {

	private int CusId;
	private String CusName;
	private String AccountNo;
	private String IDNo;
	private String MobileNo;
	private String Email;
	private String UserName;
	private String Password;
	
	public Customer(int cusId, String cusName, String accountNo, String iDNo, String mobileNo, String email,
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
	
	
}
