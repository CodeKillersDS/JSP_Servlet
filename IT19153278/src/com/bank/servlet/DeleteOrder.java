package com.bank.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.model.Order;
import com.bank.service.OrderServices;

/**
 * Servlet implementation class DeleteOrder
 */
@WebServlet("/DeleteOrder")
public class DeleteOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		/**
		 * declare variable to get id 
		 */
		String id = request.getParameter("orderid");
	
		/**
		 * check 
		 */
		boolean isTrue;
		
		isTrue = OrderServices.deleteorder(id);

		if(isTrue == true) {
			/**
			 * if it delete then navigate this page
			 */
			RequestDispatcher dispatcher = request.getRequestDispatcher("Addorder.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			/**
			 * if not  delete then navigate this page
			 */
			List<Order> orderDetails = OrderServices.validate(id);
			request.setAttribute("orderDetails", orderDetails);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Displayorder.jsp");
			dispatcher.forward(request, response);
		}
	}

}
