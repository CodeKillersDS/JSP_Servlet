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

import com.bank.model.User;
import com.bank.service.Userservices;

/**
 * Servlet implementation class MyAccount
 */
@WebServlet("/MyAccount")
public class MyAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/**
		 * once you go back after you come to profile it get those attributes and display correct user details
		 */
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		String password = (String) session.getAttribute("password");
		
		/**
		 * create object for User
		 */
		User user = new User();
		
		/**
		 * set username and password 
		 */
		user.setUserName(username);
		user.setPassword(password);
		
		
		
		try {
			List<User> userDetails = Userservices.validate(username, password);
			
			/**
			 * set attribute
			 */
			request.setAttribute("userDetails", userDetails);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
			/**
			 * servlet into navigate page
			 */
			RequestDispatcher dis = request.getRequestDispatcher("Useraccount.jsp");
			dis.forward(request, response);
	}

}
