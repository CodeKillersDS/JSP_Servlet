<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" type = "text/css" href = "css/bootstrap.css">
<link rel = "stylesheet" type = "text/css" href = "js/bootstrap.js">
<link rel = "stylesheet" type = "text/css" href = "NewFile.css">
</head>
<body>
<div class = "container">
	<div class = "row">
		<div class = "col-md-2"></div>
		<div class = "col-md-8">
			<div class = "row" style = "margin-top: 120px;box-shadow: -1px 1px 50px 10px black;">
				<div class = "col-md-6">
					<ul>
						<a href = "#" style = "border-bottom: 2px solid #f44c89;padding: 10px;">Sign in </a>
						<a href = "#">/ Sign up</a>
					</ul>
					<form action = "login" method = "post">
					
					<input type = "text" class = "design" name = "uid" required>
					
					<input type = "password" class = "design" name = "pass" required>
					<input type = "submit" name = "submit" value = "Login" class = "btn btn-info">
					</form>
				</div>
				<div class = "col-md-6">
					<img src = "C:\Users\Didula\Desktop/black.jpg">
				</div>
			</div>
		</div>
		<div class = "col-md-2"></div>
	</div>
</div>

</body>
</html>