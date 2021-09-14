<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <style>
body {
  background-image: url('u1.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed; 
  background-size: cover;
}
</style>
</head>
<body>
<nav class="navbar bg-dark navbar-dark">
  <a class="navbar-brand" href="#">Welcome To Online Banking</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="Home.jsp">Home</a>
      </li>
      <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        Features
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="Login.jsp">Order Cheque Books</a>
        <a class="dropdown-item" href="Login.jsp">Bill Payment</a>
        <a class="dropdown-item" href="Login.jsp">Transfer Money</a>
      </div>
    </li>
          <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        Account
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="Login.jsp">Profile</a>
        <a class="dropdown-item" href="Home.jsp">Log Out</a>
      </div>
    </li>
      <li class="nav-item">
        <a class="nav-link" href="#">About Us</a>
      </li>   
    </ul>
  </div>  
</nav>

   
</body>
</html> 