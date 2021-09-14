package com.billPayment.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.billPayment.model.receipt;
import com.billPayment.service.IReceipt;
import com.billPayment.service.ReceiptService;



/**
 * Servlet implementation class ReceiptServlet
 */
public class receiptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String ReceiptNo =request.getParameter("receiptNo");
		
		receipt receipt = new receipt();
		receipt.setReceiptNo(ReceiptNo);
		
		IReceipt ireceipt = new ReceiptService();
		boolean checkReceiptNo = ireceipt.checkReceiptNo(receipt);
		
		try 
			{	
				List<receipt> receiptDetails = ReceiptService.validate(ReceiptNo);
				request.setAttribute("receiptDetails",receiptDetails);
				
				if(checkReceiptNo == true)
				{					
					RequestDispatcher dis =  request.getRequestDispatcher("receipt.jsp");
					dis.forward(request, response);
				}
				else
				{
					RequestDispatcher dis =  request.getRequestDispatcher("error.jsp");
					dis.forward(request, response);
				}
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}
}
