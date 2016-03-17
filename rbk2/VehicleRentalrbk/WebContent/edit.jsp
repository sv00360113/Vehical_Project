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
<body bgcolor="#ECF6CE">
<a href="./Admin.jsp">Go Home</a>
<form action="./EditServlet" method="post">
<table border=1 align="center">
<!-- <tr><th>vId</th><th>ChassyNo</th><th>regno</th><th>permit</th><th>vtype</th><th>class</th><th>htype</th><th>fueltype</th><th>manufacture company</th><th>vendor</th><th>insurance no</th><th>seats</th><th>availability</th><th>vehicle name</th><th>payment_id</th></tr> -->
<c:forEach var="a" items="${list11}">
<tr><td>vid:</td><td><input type="text" name="vid" value="${a.vId}" readonly="readonly"></td></tr>
<tr><td>Vehicle Name:</td><td><input type="text" name="name" value="${a.vehicleName}"></td></tr>
<tr><td>Chassy number:</td><td><input type="text" name="chassy" value="${a.chassyNo}"></td></tr>
<tr><td>Reg no:</td><td><input type="text" name="reg" value="${a.regNo}"></td></tr>
<tr><td>Permit:</td><td><input type="text" name="permit" value="${a.permit}"></td></tr>
<tr><td>Vehicle Type:</td><td><input type="text" name="vtype" value="${a.vType}"></td></tr>
<tr><td>Class:</td><td><input type="text" name="class" value="${a.vClass}"></td></tr>
<tr><td>Heavy Type:</td><td><input type="text" name="htype" value="${a.hType}"></td></tr>
<tr><td>Fuel Type:</td><td><input type="text" name="fuel" value="${a.fuelType}"></td></tr>
<tr><td>Manufacture company:</td><td><input type="text" name="man" value="${a.manCompany}"></td></tr>
<tr><td>Vendor:</td><td><input type="text" name="vendor" value="${a.vendor}"></td></tr>
<tr><td>Insurance no:</td><td><input type="text" name="ins" value="${a.insPolicy}"></td></tr>
<tr><td>Seats:</td><td><input type="text" name="seats" value="${a.seats}"></td></tr>
<tr><td>Availability:</td><td><input type="text" name="ava" value="${a.availability}"></td></tr>
<tr><td>Payment Id:</td><td><input type="text" name="payment" value="${a.payment_id}"></td></tr>

</c:forEach>

<tr><td><input type="submit"></td></tr>
</table>


</form>
</body>
</html>