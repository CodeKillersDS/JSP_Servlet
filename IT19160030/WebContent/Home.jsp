<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action ="register" method = "post">
	Name <input type = "text" name = "name" required><br>
	Account Number<input type = "number" name = "accno" required><br>
	ID Number<input type = "text" name = "idn" pattern = "([0-9]{10})(v)" required><br>
	Mobile Number<input type = "number" name = "mobile" required><br>
	Email<input type = "email" name = "email" required><br>
	User Name<input type = "text" name = "uname" required><br>
	Password<input type = "password" name = "psw" required><br>
	
	<input type = "submit" name = "submit" value = "Register">
	</form>
</body>
</html>