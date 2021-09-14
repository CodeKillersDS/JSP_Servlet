<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String Name = request.getParameter("company");
		String ReceiptNo =request.getParameter("receiptNo");
		String UserName = request.getParameter("userName");
		String amount = request.getParameter("amount");
	%>
	
	<form action ="delete" method="post">
		Company Name <input type="text" name="company" value="<%= Name %>" readonly ><br>
		Receipt No <input type ="text" name ="receiptNo" value="<%= ReceiptNo %>" readonly ><br>
		User Name <input type ="text" name ="userName" value="<%= UserName %> " readonly ><br>
		Amount <input type ="text" name ="amount" value="<%= amount %>"readonly><br>
		
		<input type="submit" name="submit" value ="Delete">
	</form>
</body>
</html>