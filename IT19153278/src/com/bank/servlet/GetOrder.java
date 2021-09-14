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
import com.bank.service.OrderServices;

/**
 * Servlet implementation class GetOrder
 */
@WebServlet("/GetOrder")
public class GetOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		/**
		 * get account number as paramemter
		 */
		String accountno = request.getParameter("accountno");
		
		/**
		 * create object  for Order class
		 */
		Order order = new Order();
		
		/**
		 * set account number
		 */
		order.setAccountNo(accountno);
		
		/**
		 * once you go back after you came to order page order details will never lose
		 */
		HttpSession session = request.getSession();
		session.setAttribute("Accountno", accountno);
		
		
			try {
				/**
				 * call account number validation method
				 */
				List<Order> orderDetails = OrderServices.validate(accountno);
				
				/**
				 * set attribute name and parameter
				 */
				request.setAttribute("orderDetails", orderDetails);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			
				/**
				 * navigation page
				 */
				RequestDispatcher dis = request.getRequestDispatcher("Displayorder.jsp");
				dis.forward(request, response);
		
	}

}
