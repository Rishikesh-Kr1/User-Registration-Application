<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String fName = (String)request.getAttribute("fname");
String msg = (String)request.getAttribute("msg");
out.println("Page belongs to : "+fName+"<br>");
out.println(msg);
%>
<a href="view">ViewProfile</a>
<a href="logout">Logout</a>
</body>
</html>