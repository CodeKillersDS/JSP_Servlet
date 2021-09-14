package com.bank.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bank.model.Order;
import com.bank.model.User;
import com.bank.service.Userservices;

/**
 * Servlet implementation class Customerlogin
 */
@WebServlet("/Customerlogin")
public class Customerlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/**
		 * get username and password and assign to variables
		 */
		String username = request.getParameter("uid");
		String password = request.getParameter("pass");
		
		/**
		 * once login your account data will not lose it will display in that session 
		 */
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
		session.setAttribute("password", password);
	
		
			try {
				/**
				 * call the validate function in Userservices
				 */
				List<User> userDetails = Userservices.validate(username, password);
				
				/**
				 * set attribute  name and value
				 */
				request.setAttribute("userDetails", userDetails);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			
				/**
				 * Navigate page Useraccount.jsp 
				 */
				RequestDispatcher dis = request.getRequestDispatcher("Useraccount.jsp");
				dis.forward(request, response);	
		}
	}


