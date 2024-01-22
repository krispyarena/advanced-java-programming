<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Data</title>
</head>
<body>
<h3 style="color:green">Enter Details properly</h3>
<form action = "SIServlet" method = "post">
Principal : <input type = "text" name = "principal" required> <br><br>
Time : <input type = "text" name = "time" required> <br><br>
Rate : <input type = "text" name = "rate" required> <br><br>

<button type = "submit">Calculate</button>
</form>
</body>
</html>