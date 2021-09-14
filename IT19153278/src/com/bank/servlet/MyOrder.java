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
 * Servlet implementation class MyOrder
 */
@WebServlet("/MyOrder")
public class MyOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		/**
		 * once you go back to another page then come to order page order details never lose
		 */
		/**
		 * that order details validate in here and pass values to that page
		 */
		HttpSession session = request.getSession();
		String accountno = (String) session.getAttribute("Accountno");
		Order order = new Order();
		order.setAccountNo(accountno);
		
		
			try {
				List<Order> orderDetails = OrderServices.validate(accountno);
				
				/**
				 * set attribute
				 */
				request.setAttribute("orderDetails", orderDetails);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				/**
				 * servlet into navigate page
				 */
				RequestDispatcher dis = request.getRequestDispatcher("Displayorder.jsp");
				dis.forward(request, response);
		
	}
}

