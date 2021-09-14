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
      <a href="Login.jsp">Bill Payment</a>
      <a href="Login.jsp">Orders</a>
      <a href="Login.jsp">Transfer Money</a>
    </div>
  </li>
   <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Account</a>
    <div class="dropdown-content">
    <a href="createaccount.jsp">Create Account</a>
      <a href="Login.jsp">Profile</a>
      <a href="Login.jsp">Log Out</a>
    </div>
  </li>
   <li><a href="#news">About Us</a></li>
</ul>


<div class = "logs">
	<form action = "login" method = "post">
	<img src = "C:\Users\Didula\Desktop/Admin.jpg" class = "user">
	<font color = "yellow">User Name<input type = "text" class = "design" name = "uid" required>
	Password <input type = "password" class = "design" name = "pass" required></font>
	<input type = "submit" name = "submit" value = "Login">
	</form>
	</div>
</body>
</html>