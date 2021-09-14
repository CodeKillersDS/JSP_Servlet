<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" type = "text/css" href = "Style.css"> 
</head>
<body>

<ul>
  <li><a href="Home.jsp">Home</a></li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Features</a>
    <div class="dropdown-content">
      <a href="#">Bill Payment</a>
          <form action = "order" method = "post">
      <input type = "submit" class = "button" name = "submit" value = "Order">
     </form>
      <a href="transfermoney.jsp">Transfer Money</a>
    </div>
  </li>
   <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Account</a>
    <div class="dropdown-content">
     <form action = "account" method = "post">
      <input type = "submit" class = "button" name = "submit" value = "Profile">
     </form>
      <a href="Login.jsp">Log Out</a>
    </div>
  </li>
   <li><a href="#news">About Us</a></li>
</ul>

	<%
		String orderid = request.getParameter("orderid");
		String accountno = request.getParameter("accountno");
		String accounttype = request.getParameter("accounttype");
		String noofchequebooks = request.getParameter("noofchequebooks");
		String branch = request.getParameter("branch");
	%>
	<div class = "deletebox">
	<form action ="updateorder" method = "post">
	Order ID <input type = "text" name = "orderid" value = "<%=orderid%>" readonly><br>
	Account Number <input type = "text" name = "accountno" value = "<%=accountno%>" readonly><br>
	Account Type <input type = "text" name = "accounttype" value = "<%=accounttype%>"><br>
	No Of Cheque Books <input type = "text" name = "noofchequebooks" value = "<%=noofchequebooks%>"><br>
	Branch <input type = "text" name = "branch" value = "<%=branch%>"><br>
	
	<input type = "submit" name = "submit" value = "Update Order">
	</form>
	</div>
</body>
</html>