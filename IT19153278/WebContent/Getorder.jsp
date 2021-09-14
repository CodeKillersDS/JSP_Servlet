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
      <a href="Addorder.jsp">Orders</a>
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

	<div class = "logs">
	<form action = "getorder" method = "post">
					
	<font color = "yellow">Account Number<input type = "number" name = "accountno" required></font>
	<input type = "submit" name = "submit" value = "GetOrder">
	</form>
	</div>
	
</body>
</html>