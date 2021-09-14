<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
      <a href = "Addorder.jsp">New Orders</a>
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

<h2 style="text-align:center"><font color = "brown">User Profile</font></h2>

<c:forEach var = "cus" items= "${userDetails}">

<div class="card">
<p><button>Customer ID</button></p>
  <p class="title">${cus.cusId}</p>
<p><button>Customer Name</button></p>
  <h1>${cus.cusName}</h1>
<p><button>Account No</button></p>
  <h1>${cus.accountNo}</h1>
<p><button>ID Number</button></p>
  <p>${cus.IDNo}</p>
<p><button>Mobile No</button></p>
  <p>${cus.mobileNo}</p>
<p><button>Email</button></p>
  <p>${cus.email}</p>
<p><button>User Name</button></p>
  <p>${cus.userName}</p>
<p><button>Password</button></p>
  <p>${cus.password}</p>

</div>

</c:forEach>

</body>
</html>