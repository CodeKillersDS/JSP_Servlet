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

<c:forEach var = "order" items= "${orderDetails}">
	

	<c:set var = "orderid" value = "${order.orderID}"/>
	<c:set var = "accountno" value = "${order.accountNo}"/>
	<c:set var = "accounttype" value = "${order.accountType}"/>
	<c:set var = "noofchequebooks" value = "${order.noOfChequeBooks}"/>
	<c:set var = "branch" value = "${order.branch}"/>
	
	
<div class = "card">
<p><button>Order ID</button></p>	
	<p>${order.orderID}</p>
<p><button>Account Number</button></p>
	<h1>${order.accountNo}</h1>
<p><button>Account Type</button></p>
	<h1>${order.accountType}</h1>
<p><button>Number Of Cheque Books</button></p>
	<h1>${order.noOfChequeBooks}</h1>
<p><button>Branch</button></p>
	<h1>${order.branch}</h1>
</div>
	</c:forEach>
	
	<c:url value = "Updateorder.jsp" var = "updateorder">
		<c:param name = "orderid" value = "${orderid}"/>
		<c:param name = "accountno" value = "${accountno}"/>
		<c:param name = "accounttype" value = "${accounttype}"/>
		<c:param name = "noofchequebooks" value = "${noofchequebooks}"/>
		<c:param name = "branch" value = "${branch}"/>
	</c:url>
	
	<a href = "${updateorder}">
	<center><input type = "button" class = "button1" name = "update" value = "Update Order"></center>
	</a>

	<c:url value = "Deleteorder.jsp" var = "deleteorder">
		<c:param name = "orderid" value = "${orderid}"/>
		<c:param name = "accountno" value = "${accountno}"/>
		<c:param name = "accounttype" value = "${accounttype}"/>
		<c:param name = "noofchequebooks" value = "${noofchequebooks}"/>
		<c:param name = "branch" value = "${branch}"/>
	
	
	</c:url>
	<a href = "${deleteorder}">
	<center><input type = "button" class = "button1" name = "delete" value = "Delete Order"></center>
	</a>
	
</body>
</html>