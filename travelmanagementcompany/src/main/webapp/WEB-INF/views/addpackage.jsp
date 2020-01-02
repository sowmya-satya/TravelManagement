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
<form class="form" action="addpackages" method="post"
onsubmit="return validate()">
<h1>Add Package</h1>
<div class="form-group">
<label for="season">Season:</label> <select name="season">
<option value="summer">Summer</option>
<option value="rain">Rain</option>
<option value="winter">Winter</option>
<option value="autum">Autumn</option>
</select>
</div>
<br>
<div class="form-group">
<label for="cost">Cost:</label> <input type="text"
class="form-control" id="cost" placeholder="Enter cost" name="cost">
</div>
<br>
<div class="form-group">
<label for="duration">Duration:</label> <select name="duration">
<option value="3days2nights">3Days2Nights</option>
<option value="2days1nights">2Days1Nights</option>
<option value="4days3nights">4Days3Nights</option>
<option value="5days4nights">5Days4Nights</option>
</select>
</div>
<br>
<div class="form-group">
<label for="food">Food:</label> <input type="radio" name="food"
 value="true" checked>Yes<br> <input type="radio"
 name="food" value="false"> No<br>
 
</div>
<br>
<button type="submit" class="btn">AddPackage</button>
</form>
</div>

</body>
</html>