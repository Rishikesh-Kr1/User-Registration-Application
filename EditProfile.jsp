<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.user.bean.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String fName = (String)request.getAttribute("fname");
UserBean ub = (UserBean)application.getAttribute("ubean");
out.println("Page belongs to User : "+ub.getfName()+"<br>");
%>
<form action="update" method="post">
Address:<input type="text" name="addr" value=<%=ub.getAddress()%>><br>
MailId:<input type="text" name="mid" value=<%=ub.getMailId() %>><br>
PhoneNo:<input type="text" name="phno" value=<%=ub.getPhNo() %>><br>
<input type="submit" value="UpdateProfile">
</body>
</html>