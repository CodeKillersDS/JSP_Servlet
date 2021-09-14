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
      <a href="Getorder.jsp">Order</a>
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


	<div class = "orderbox">
	<form action ="addorder" method = "post">
	<font color = "yellow">Account Number <input type = "text" name = "accountno" pattern = "[1-9]{10}" required><br>
	Account Type <input type = "text" name = "accounttype"  required><br>
	No Of Cheque Books <input type = "text" name = "noofchequebooks" required><br>
	Branch <input type = "text" name = "branch" required><br></font>
	<input type = "submit" name = "submit" value = "Order">
	</form>
	</div>
</body>
</html>