package com.bank.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.model.Order;
import com.bank.service.IOrder;
import com.bank.service.OrderServices;



/**
 * Servlet implementation class AddOrder
 */
@WebServlet("/AddOrder")
public class AddOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		/**
		 * declare variables to get order details and assign it
		 */
		String accountno = request.getParameter("accountno");
		String accounttype = request.getParameter("accounttype");
		String noofchequebooks = request.getParameter("noofchequebooks");
		String branch = request.getParameter("branch");
		
		/**
		 * create object for order class
		 */
		Order order = new Order();
		
		/**
		 * set account number 
		 */
		order.setAccountNo(accountno);
		
		/**
		 * create object for IOrder interface 
		 */
		IOrder iorder = new OrderServices();
		
		/**
		 * declare boolean variable to check order account number
		 */
		boolean checkorder = iorder.chequeorder(order);
		
		/**
		 * check whether that account number is already in the table or not 
		 */
		if(checkorder == true) {
	
		/**
		 * declare boolean variable
		 */
		boolean isReg;
		
		/**
		 * assign addorder function to that boolean variable
		 */
		isReg = OrderServices.addorder(accountno, accounttype, noofchequebooks, branch);
		if(isReg == true)
		{
			/**
			 * navigate Getorder.jsp
			 */
			RequestDispatcher dis = request.getRequestDispatcher("Getorder.jsp");
			dis.forward(request, response);
			
		}	
		else {
			/**
			 * navigate unsuccess.jsp
			 */
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
			}
	}else {
		/**
		 * navigate AI (this will run if the account number already have in database)
		 */
		RequestDispatcher dis3 = request.getRequestDispatcher("AI.jsp");
		dis3.forward(request, response);
	}
	}
}
