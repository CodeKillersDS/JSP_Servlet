package com.bank.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.service.OrderServices;

/**
 * Servlet implementation class UpdateOrder
 */
@WebServlet("/UpdateOrder")
public class UpdateOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		/**
		 * set variables and get order update jsp file values in to those varibles and assign
		 */
		String id = request.getParameter("orderid");
		String accountno = request.getParameter("accountno");
		String accounttype = request.getParameter("accounttype");
		String noofchequebooks = request.getParameter("noofchequebooks");
		String  branch = request.getParameter("branch");
		
		/**
		 * create boolean variable
		 */
		boolean isTrue;
		
		/**
		 * call updateorder method and assign that into isTrue variable
		 */
		isTrue = OrderServices.updateorder(id, accountno, accounttype, noofchequebooks, branch);
		
		if(isTrue == true)
		{
			/**
			 * navigate page (If update)
			 */
			RequestDispatcher dis = request.getRequestDispatcher("Getorder.jsp");
			dis.forward(request, response);
		}
		else
		{
			/**
			 * navigate page (If not update)
			 */
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}		
}


