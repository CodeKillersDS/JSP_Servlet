<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var = "cus" items= "${cusDetails}">
	
	<c:set var = "usern" value = "${cus.userName}"/>
	<c:set var = "newpass" value = "${cus.password}"/>
	
	${cus.cusId}
	${cus.cusName}
	${cus.accountNo}
	${cus.IDNo}
	${cus.mobileNo}
	${cus.email}
	${cus.userName}
	${cus.password}

	</c:forEach>
	
	<c:url value = "editpass.jsp" var = "editpass">
		<c:param name = "usern" value = "${usern}"/>
		<c:param name = "newpass" value = "${newpass}"/>
	</c:url>
	
	<a href = "${editpass}">
	<input type = "button" name = "update" value = "Change Password">
	</a>
</body>
</html>