<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body><br>
<b>Login Form</b><hr><br>

<form action = "dbservlet" method = "post">
Username : <input type = "text" name = "username"><br><br>
Password : <input type = "text" name = "password"><br><br>
<input type = "submit" value = "Login">

</form>
</body>
</html>