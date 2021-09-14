<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String username = request.getParameter("usern");
		String password = request.getParameter("newpass");
	%>

	<div class = "loginbox">
	<img src = "C:\Users\Didula\Desktop/Admin.jpg" class = "user">
	<form action ="editp" method = "post">
	User Name <input type = "text" name = "uid" value = "<%= username%>" readonly><br>
	New Password<input type = "password" name = "npass" required><br>
	
	<input type = "submit" name = "submit" value = "Change Password">
	</form>
	</div>
</body>
</html>