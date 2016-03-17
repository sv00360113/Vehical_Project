<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#ECF6CE">
<img src="speed.jpg" alt="" height="200" width="1500">
<c:if test="${msg == 'fail'}">
<font color=red>Enter valid id</font>
</c:if>
<form action="./modifyServlet" method="post">
Enter Vehicle id:<input type="text" name="id">
<br>
<input type="submit">
</form>
 <a href="./Admin.jsp">Home</a> 
</body>
</html>