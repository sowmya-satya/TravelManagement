<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/resources/css/style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<form class="form" action="booking" method="post" onsubmit="return validate()">
<h1>Login</h1>
<span>$(alert)</span>
<div class="form-group">
<label for="customerId">ID:</label> <input type="text"
class="form-control" id="customerId" placeholder="Enter id" name="customerId">
</div>
<br>
<div class="form-group">
<label for="password">Password:</label> <input type="password"
class="form-control" id="password" placeholder="Enter password" name="password">
</div>
<br>
<button type="submit" class="btn">Login</button>
</form>
</div>
</body>
</html>