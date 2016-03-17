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
<form action="./customerServlet" method="post">
<input type="submit" value="view">
<table border=1>

<tr><th>cId</th><th>Fname</th><th>Lname</th><th>phone</th><th>email</th><th>address</th></tr>
<c:forEach var="a" items="${list}">
<tr><td><c:out value="${a.cId}"></c:out></td>
<td><c:out value="${a.fname}"></c:out></td>
<td><c:out value="${a.lname}"></c:out></td>
<td><c:out value="${a.phone}"></c:out></td>
<td><c:out value="${a.email}"></c:out></td>
<td><c:out value="${a.address}"></c:out></td>
</tr>
</c:forEach>
</table>
<c:if test="${msg == 'fail'}">
<font color=red>No Bookings</font>
</c:if>
</form>
<a href="./Admin.jsp">Home</a>
</body>
</html>