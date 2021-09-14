package com.billPayment.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ReceiptDBConnection {
	
	
	private static String url = "jdbc:mysql://localhost:3306/billpayment?autoReconnect=true&useSSL=false";
	private static String User = "root";
	private static String pw = "@tdkasmithsliit";
	private static Connection con ;
	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,User,pw);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return con ;
	}

}