package com.billPayment.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.billPayment.service.ReceiptService;

/**
 * Servlet implementation class DeleteReceiptServlet
 */
public class deleteReceiptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ReceiptNo =request.getParameter("receiptNo");
		
		ReceiptService.deleteReceipt(ReceiptNo);
		
		RequestDispatcher dis =  request.getRequestDispatcher("deleteSuccess.jsp");
		dis.forward(request, response); 
	}
}
