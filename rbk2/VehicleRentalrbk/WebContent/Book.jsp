<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function call(days,fromdate,todate)
{
	var days=document.getElementById("id1").value;
	var fromdate=document.getElementById("id2").value;
	var todate=document.getElementById("id3").value;
	
	var date1=new Date(fromdate);
	var date2=new Date(todate);
	
	if(date2<date1)
		{
		alert("to date is lesser than from date");	
		return false;
		}
	 
	var day1=date1.getDate();
	var day2=date2.getDate();
	/* document.write(day1);
	document.write(day2); */
	
	if(day1>day2)
		{
		var diff1=day1-day2;
		/* document.write(diff1); */
		if(diff1!=days)
			alert("not valid date");
		return false;
		}

	if(day1<day2)
		{
		var diff2=day2-day1;
		//document.write(diff2);
		if(diff2!=days)
			alert("not valid date");
		return false;
		}
	else{
		return true;
	}
	
}

function call1(fromdate)
{
	var curdate=new Date();
	var fromdate=document.getElementById("id2").value;
	var date1=new Date(fromdate);
	//document.write(curdate);
	if(date1 < curdate)
	{
	alert("from date not valid");	
	return false;
	}
	else
		{
		return true;
		}
	
}
</script>
</head>
<body bgcolor="#ECF6CE">
<img src="speed.jpg" alt="" height="200" width="1500">
<h1 align="center">BOOKING PAGE</h1>
<form action="./PayServlet" method="post">
<a href="./User.jsp">Home</a>
<table border=1 align="center">
<tr><td>CustomerId:</td><td><input type="text"  value="${userid}" name="userid" readonly="readonly"></td></tr>

<tr><td>VehicleId:</td><td><input type="text" name="vid"></td></tr>

<tr><td>Number of days:</td><td><input type="text" name="days" id="id1"></td></tr>

<tr><td>From date:</td><td><input type="date" name="fromdate" id="id2" onblur="return call1(fromdate)"></td></tr>

<tr><td>To date:</td><td><input type="date" name="todate"  id="id3" onblur="return call(days,fromdate,todate)"></td></tr>

<tr><td>Distance:</td><td><input type="text" name="distance"></td></tr>

<tr><td><input type="submit" value="View bill"></td></tr>
<c:if test="${msg == 'fail'}">
<font color=red>Vehicle not Available</font>
</c:if>
<c:if test="${msg1 == 'fail'}">
<font color=red>Vehicle not Available</font>
</c:if>
</table>
</form>
<form action="./BookServlet" method="post">
<table border=1 align="center">
<tr><td>Amount:</td><td><input type="text" value="${amount}" name="amount" readonly="readonly"></td></tr>

<tr><td><input type="submit" value="book"></td></tr>
</table>
</form>

</body>
</html>