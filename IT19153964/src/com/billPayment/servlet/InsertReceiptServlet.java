package com.billPayment.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.billPayment.service.ReceiptService;

/**
 * Servlet implementation class insertReceiptServlet
 */
public class InsertReceiptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String Name = request.getParameter("company");
		String ReceiptNo =request.getParameter("receiptNo");
		String UserName = request.getParameter("userName");
		String amount = request.getParameter("amount");
		
		
		ReceiptService.insertreceipt(Name,ReceiptNo, UserName, amount);
		
		
			
		RequestDispatcher dis =  request.getRequestDispatcher("success.jsp");
		dis.forward(request, response);
	}
}
