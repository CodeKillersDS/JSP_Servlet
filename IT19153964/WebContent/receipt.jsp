<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix ="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var ="rc" items="${receiptDetails}">
	
	<c:set var ="company" value ="${rc.company}"/>
	<c:set var ="receiptNo" value ="${rc.receiptNo}"/>
	<c:set var ="userName" value ="${rc.userName}"/>
	<c:set var ="amount" value ="${rc.amount}"/>

	
	<table border="1">
	<tr>
		<td>Company name</td>
		<td>${rc.company}</td>
	</tr>
	<tr>
		<td>Receipt No</td>
		<td>${rc.receiptNo}</td>
	</tr>
	<tr>
		<td>User name</td>
		<td>${rc.userName}</td>
	</tr>
	<tr>
		<td>Amount</td>
		<td>${rc.amount}</td>	
	</tr>
	</table>
	

	
	</c:forEach>
	
	<c:url value ="updateAmount.jsp" var="updateAmount">
		<c:param name ="company" value ="${company}"/>
		<c:param name ="receiptNo" value ="${receiptNo}"/>
		<c:param name ="userName" value ="${userName}"/>
		<c:param name ="amount" value ="${amount}"/>
	</c:url>
	
	<a href="${updateAmount}">
	<input type ="button" name="updateAmount" value="Update Amount">
	</a>
	
	<c:url value ="deleteReceipt.jsp" var="receiptDelete">
		<c:param name ="company" value ="${company}"/>
		<c:param name ="receiptNo" value ="${receiptNo}"/>
		<c:param name ="userName" value ="${userName}"/>
		<c:param name ="amount" value ="${amount}"/>
	</c:url>
	<a href="${receiptDelete}">
	<input type ="button" name="deleteReceipt" value="Delete Receipt">
	</a>
	</body>
</body>
</html>