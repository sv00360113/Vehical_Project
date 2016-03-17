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


<form action="./ListallavailableServlet1" method="post">

<input type="submit" value="view">

</form>

<table border=1>

<tr><th>vId</th><th>ChassyNo</th><th>regno</th><th>permit</th><th>vtype</th><th>class</th><th>htype</th><th>fueltype</th><th>manufacture company</th><th>vendor</th><th>insurance no</th><th>seats</th><th>availability</th><th>vehicle name</th><th>payment_id</th></tr>
<c:forEach var="a" items="${list}">
<tr><td><c:out value="${a.vId}"></c:out></td>
<td><c:out value="${a.chassyNo}"></c:out></td>
<td><c:out value="${a.regNo}"></c:out></td>
<td><c:out value="${a.permit}"></c:out></td>
<td><c:out value="${a.vType}"></c:out></td>
<td><c:out value="${a.vClass}"></c:out></td>
<td><c:out value="${a.hType}"></c:out></td>
<td><c:out value="${a.fuelType}"></c:out></td>
<td><c:out value="${a.manCompany}"></c:out></td>
<td><c:out value="${a.vendor}"></c:out></td>
<td><c:out value="${a.insPolicy}"></c:out></td>
<td><c:out value="${a.seats}"></c:out></td>
<td><c:out value="${a.availability}"></c:out></td>
<td><c:out value="${a.vehicleName}"></c:out></td>
<td><c:out value="${a.payment_id}"></c:out></td>
</tr>
</c:forEach>

</table>
 <a href="./Admin.jsp">Home</a> 
</body>
</html>