package com.bank.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.sql.SQLException;


import org.xml.sax.SAXException;



import com.bank.model.Order;
import com.bank.util.Constants;
import com.bank.util.OrderDBConnection;

public class OrderServices implements IOrder{

	/**
	 * declare variables and assign values 
	 */
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static boolean isSuccess;
	
	/**
	 * call method where we declare in interface
	 */
	public static final Logger log = Logger.getLogger(OrderServices.class.getName());
	
	/**
	 * Insert into order table method
	 * @param accountno
	 * @param accounttype
	 * @param noofchequebooks
	 * @param branch
	 * @return
	 */
	public static boolean addorder (String accountno , String accounttype , String noofchequebooks , String branch)
	{
		
		/**
		 * check any exception error or not
		 */
		try {
			/**
			 * call the database connection
			 */
			con = OrderDBConnection.getConnection();
			stmt = con.createStatement();
			
			/**
			 * sql code for insert order
			 */
			String sql = "insert into orders values (0 , '"+accountno+"' , '"+accounttype+"' , '"+noofchequebooks+"' , '"+branch+"')";
			
			/**
			 * executeupdate method to insert
			 */
			int rs = stmt.executeUpdate(sql);
			
			/**
			 * check that success or not
			 */
			if(rs > 0)
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false;
			}
			
			
		}catch(SQLException e)
		{
			log.log(Level.SEVERE, e.getMessage());
		}
		return isSuccess;
	}
	
	
	/**
	 * array method to diplay order details
	 * @param accountno
	 * @return
	 */
public static List<Order> validate(String accountno)
	{
		/**
		 * create object
		 */
		ArrayList<Order> order = new ArrayList<>();
		
		/**
		 * validate
		 */
		try {
			/**
			 * call connection
			 */
			con = OrderDBConnection.getConnection();
			stmt = con.createStatement();
			
			/**
			 * sql code to get order details
			 */
			String sql = "select * from orders where AccountNo = '"+accountno+"'";
			
			/**
			 * executeQuery to display details
			 */
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				/**
				 * get details by column name
				 */
				int id = rs.getInt(Constants.COLUMN_INDEX_ONE);
				String accno = rs.getString(Constants.COLUMN_INDEX_TWO);
				String accounttype = rs.getString(Constants.COLUMN_INDEX_THREE);
				String noofchequebooks = rs.getString(Constants.COLUMN_INDEX_FOUR);
				String branch = rs.getString(Constants.COLUMN_INDEX_FIVE);
				
				/**
				 * assign values to order class object and call as method
				 */
				Order o = new Order(id, accno, accounttype, noofchequebooks, branch);
				order.add(o);
			}
			
		}
		catch(SQLException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		
		return order;
	}
	

	/**
	 * update order method
	 * @param id
	 * @param accountno
	 * @param accounttype
	 * @param noofchequebooks
	 * @param branch
	 * @return
	 */
	public static boolean updateorder (String id, String accountno , String accounttype , String noofchequebooks , String branch)
	{
		
		/**
		 * check errors
		 */
		try {
			/**
			 * call database connection
			 */
			con = OrderDBConnection.getConnection();
			stmt = con.createStatement();
			
			/**
			 * update sql code 
			 */
			String sql = "update orders set AccountNo = '"+accountno+"', AccountType = '"+accounttype+"', NoOfChequeBooks = '"+noofchequebooks+"', Branch = '"+branch+"' where OrderID = '"+id+"'" ;
			
			/**
			 * executeUpdate to update details
			 */
			int rs = stmt.executeUpdate(sql);
			
			/**
			 * check sucess or not
			 */
			if(rs > 0)
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false;
			}
			
		}
		catch(SQLException e){
			log.log(Level.SEVERE, e.getMessage());
		}
		
		return isSuccess;
	}
	
	
	/**
	 * delete order method
	 * @param id
	 * @return
	 */
	public static boolean deleteorder (String id)
   {
		/**
		 * declare integer variable and convert string id to integer and assign 
		 */
		int Oid = Integer.parseInt(id);
		
		/**
		 * check errors
		 */
		try {
			/**
			 * call database connection
			 */
			con = OrderDBConnection.getConnection();
			stmt = con.createStatement();
			
			/**
			 * delete sql code
			 */
			String sql = "delete from orders where OrderID = '"+Oid+"'";
			
			/**
			 * executeUpdate to delete details
			 */
			int rs = stmt.executeUpdate(sql);
			
			/**
			 * check success or not
			 */
			if(rs > 0)
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false;
			}
		}catch(SQLException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		return isSuccess;
		
   }
	
	
	/**
	 * check order method
	 */
	public boolean chequeorder(Order order) {
		
		/**
		 * declare boolean variable and set value as true
		 */
		boolean checkorders = true;
		
		/**
		 * check errors
		 */
		try {
			/**
			 * call database connection
			 */
			con = OrderDBConnection.getConnection();
			stmt = con.createStatement();
		
			/**
			 * get details
			 */
			String sql = "select * from orders";
			
			/**
			 * executeQuery to get details
			 */
			rs = stmt.executeQuery(sql);
			
			/**
			 * loop to check order table
			 */
			while(rs.next()) {
				String accountno = rs.getString(Constants.COLUMN_INDEX_TWO);
				
				if(accountno.equals(order.getAccountNo())) {
					checkorders = false;
				}
			}
		}catch(SQLException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		return checkorders;
	}
}



