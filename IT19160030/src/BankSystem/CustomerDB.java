package BankSystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDB {

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static boolean isSuccess;
	
	public static boolean registercustomer(String name , String accno , String idn , String mobile , String email , String uname , String passU)
	{
		
		
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into customer values (0 , '"+name+"' , '"+accno+"' , '"+idn+"' , '"+mobile+"' , '"+email+"' , '"+uname+"' , '"+passU+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0)
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false;
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	
	public static List<Customer> validate(String username, String Password)
	{
		ArrayList<Customer> cus = new ArrayList<>();
		
		//validate
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from customer where UserName = '"+username+"' and Password = '"+Password+"'";
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String accno = rs.getString(3);
				String idn = rs.getString(4);
				String mobile = rs.getString(5);
				String email = rs.getString(6);
				String uname = rs.getString(7);
				String pass = rs.getString(8);
				
				Customer c = new Customer(id, name, accno, idn, mobile, email, uname, pass);
				cus.add(c);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return cus;
	}
	
	public static boolean updatenewpass(String username , String newpassword)
	{
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "update customer set Password = '"+newpassword+"' where UserName = '"+username+"'";
			
			int rs = stmt.executeUpdate(sql);
			

			if(rs > 0)
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false;
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
}


