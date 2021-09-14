package com.bank.service;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.bank.model.User;
import com.bank.service.Userservices;
import com.bank.util.Constants;
import com.bank.util.OrderDBConnection;
import com.bank.service.IOrder;

public class Userservices {
	
	/**
	 * declare variables and assign values
	 */
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static boolean isSuccess;
	
	/**
	 * logger 
	 */
	public static final Logger log = Logger.getLogger(Userservices.class.getName());
	
		/**
		 * validate user name and password
		 * @param username
		 * @param password
		 * @return
		 */
		public static List<User> validate(String username, String password)
		{
			/**
			 * create arraylist object
			 */
			ArrayList<User> user = new ArrayList<>();
			
			/**
			 * validate
			 */
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
				 * get customer details
				 */
				String sql = "select * from customer where UserName = '"+username+"' and Password = '"+password+"'";
				
				/**
				 * executeQuery to display details
				 */
				rs = stmt.executeQuery(sql);
				
				/**
				 * get values by using getString and column number
				 */
				if(rs.next()) {
					
					int id = rs.getInt(Constants.COLUMN_INDEX_ONE);
					String cusname = rs.getString(Constants.COLUMN_INDEX_TWO);
					String accountno = rs.getString(Constants.COLUMN_INDEX_THREE);
					String idno = rs.getString(Constants.COLUMN_INDEX_FOUR);
					String mobileno = rs.getString(Constants.COLUMN_INDEX_FIVE);
					String email = rs.getString(Constants.COLUMN_INDEX_SIX);
					String uname = rs.getString(Constants.COLUMN_INDEX_SEVEN);
					String pass = rs.getString(Constants.COLUMN_INDEX_EIGHT);
					
					/**
					 * Create user class object and pass values to that
					 */
					User u = new User(id, cusname, accountno, idno, mobileno, email, uname, pass);
					
					/**
					 * call add function
					 */
					user.add(u);
				}
				
			}
			catch(SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
			
			return user;
		}


}

