<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loop</title>
</head>
<body>
<% 
int i = 1;
do{
	out.println("<html><body><p>");
	out.println(i + ". Hello World");
	out.println("</p></body></html>");
	
	i++;
	
} while (i<=10);
%>
</body>
</html>