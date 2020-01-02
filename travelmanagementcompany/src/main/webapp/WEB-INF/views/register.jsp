<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<form class="form" action="welcome" method="post" onsubmit="return validation()">
<h1>User Registration</h1>
<div class="form-group">
<label for="customerName"> Name:</label> <input type="text"
class="form-control" id="customerName" placeholder="Enter name"
name="customerName">
</div>
<br>
<div class="form-group">
<label for="password"> Password:</label> <input type="password"
class="form-control" id="password" placeholder="Enter password"
name="password">
</div>
<div class="form-group">
<label for="email"> Email:</label> <input type="email"
class="form-control" id="email" placeholder="Enter email"
name="email">
</div>
<div class="form-group">
<label for="phoneNo"> Phone Number:</label> <input type="tel"
class="form-control" id="phoneNo" placeholder="Enter phoneno"
name="phoneNo">
</div>
<div class="button">
<button type="submit" class="btn">Submit</button>
If Already Registered<a href="/login">Login</a>
</div>
</form>
</div>

</body>
</html>