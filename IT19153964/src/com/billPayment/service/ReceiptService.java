package com.billPayment.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.billPayment.Util.ReceiptDBConnection;
import com.billPayment.model.receipt;

public class ReceiptService implements IReceipt{
	
	public static final Logger log = Logger.getLogger(ReceiptService.class.getName());
	
	static boolean result = false ;
	public static Connection con;
	
	public static boolean insertreceipt(String company,String ReceiptNo,String UserName,String amount)
	{
		
		try
		{	
			con = ReceiptDBConnection.getConnection();
			Statement st = con.createStatement();
			
			String sql ="insert into receipt values(0,'"+ReceiptNo+"','"+UserName+"',"+Float.parseFloat(amount)+",'"+company+"')";
			int rs = st.executeUpdate(sql);
			
			if(rs < 0)
			{
				result = true ;
			}
			else
			{
				result = false ;
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return result;
		
	}
	public static List<receipt> validate(String ReceiptNo)
	{
		ArrayList<receipt> rc = new ArrayList<>();
		

		try 
		{
			con = ReceiptDBConnection.getConnection();
			Statement st = con.createStatement();
			String sql = "select * from receipt where no = '"+ReceiptNo+"'";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				String receiptNo = rs.getString(2);
				String userName = rs.getString(3);
				float amount = rs.getFloat(4);
				String company = rs.getString(5);
				
				receipt r = new receipt(company,receiptNo,userName,amount);
				rc.add(r);
				
			}
		}catch (Exception e)
		{
			log.log(Level.SEVERE, e.getMessage());
		}
		return rc ;
	}
	public static boolean updateReceipt(String company,String receiptNo,String userName,String amount)
	{

		try
		{
			con = ReceiptDBConnection.getConnection();
			Statement st = con.createStatement();
			String sql ="Update receipt set balance="+Float.parseFloat(amount)+"where no ='"+receiptNo+"'";
			
			int rs = st.executeUpdate(sql);
			if(rs<0)
			{
				result = true ;
			}
			else
			{
				result = false ;
			}
			
		}catch(Exception e)
		{
			log.log(Level.SEVERE, e.getMessage());
		}
		return result;
	}
	public static boolean deleteReceipt(String receiptNo)
	{
		String url = "jdbc:mysql://localhost:3306/billpayment?autoReconnect=true&useSSL=false";
		String User = "root";
		String pw = "@tdkasmithsliit";
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,User,pw);
			Statement st = con.createStatement();
			String sql ="delete from receipt where no ='"+receiptNo+"'";
			
			int rs = st.executeUpdate(sql);
			if(rs<0)
			{
				result = true ;
			}
			else
			{
				result = false ;
			}
			
		}catch(Exception e)
		{
			log.log(Level.SEVERE, e.getMessage());
		}
		return result;
	}
	@Override
	public boolean checkReceiptNo(receipt receipt) {
		
		boolean checkReceiptNo = false;
		
		try {
			con = ReceiptDBConnection.getConnection();
			Statement st = con.createStatement();
		
			String sql = "select * from receipt";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				String receiptNo = rs.getString(2);
				
				if(receiptNo.equals(receipt.getReceiptNo())) 
				{
					checkReceiptNo = true;
				}
				else
				{
					checkReceiptNo = false ;
				}
			}
		}catch(Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		return checkReceiptNo;
	}

	

}
