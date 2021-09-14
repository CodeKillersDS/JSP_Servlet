package BankSystem;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Customerregister
 */
@WebServlet("/Customerregister")
public class Customerregister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		String accno = request.getParameter("accno");
		String idn = request.getParameter("idn");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String username = request.getParameter("uname");
		String password = request.getParameter("psw");
		
		boolean isReg;
		isReg = CustomerDB.registercustomer(name, accno, idn, mobile, email, username, password);
		
		if(isReg == true)
		{
			RequestDispatcher dis = request.getRequestDispatcher("Login.jsp");
			dis.forward(request, response);
			
		}	
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
			}
	}
}
