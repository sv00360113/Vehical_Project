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
<form action="./ListallBookingServlet" method="post">
<input type="submit" value="view">
</form>
<c:if test="${msg == 'fail'}">
<font color=red>No Bookings</font>
</c:if>

<table border=1>
<tr><th>CustId</th><th>vehicleId</th><th>bookingId</th><th>no_of_days</th><th>from date</th><th>to date</th><th>distance</th><th>Amount</th></tr>

<c:forEach var="a" items="${list}">
<tr><td><c:out value="${a.custId}"></c:out></td>
<td><c:out value="${a.vId}"></c:out></td>
<td><c:out value="${a.bookId}"></c:out></td>
<td><c:out value="${a.days}"></c:out></td>
<td><c:out value="${a.fromDate}"></c:out></td>
<td><c:out value="${a.toDate}"></c:out></td>
<td><c:out value="${a.distance}"></c:out></td>
<td><c:out value="${a.amount}"></c:out></td>
</tr>
</c:forEach>
</table>
<a href="./Admin.jsp">Home</a>
</body>
</html>