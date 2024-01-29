<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loop</title>
</head>
<body>
<h3 style="color:green; font-family:consolas" align="left">JSP file to display "Lalitpur,Nepal" 10 Times</h3>

<p align="left">
<% 
int i = 1;
do{
	
	out.println(i + ". Lalitpur,Nepal");
	
	out.println("<br><hr>");
	
	i++;
	
}while (i<=10);
%>
</p>
</body>
</html>