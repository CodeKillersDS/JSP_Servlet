package com.bank.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class OrderDBConnection {

	/**
	 * declare variable and assign database details
	 */
	private static String url = "jdbc:mysql://localhost:3306/bank";
	private static String user = "root";
	private static String pass = "Mydbit19153278";
	private static Connection con;
	
	
	/**
	 * create database connection
	 * @return
	 */
	public static Connection getConnection() {
		
		
		/**
		 * check database connection whether success or not
		 */
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		
			con = DriverManager.getConnection(url, user, pass);
			
			
		}
		catch(Exception e) {
			System.out.println("Error in Database connection");
		}
		
		return con;
	}
}