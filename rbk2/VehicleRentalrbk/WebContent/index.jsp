<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function chklogin()
{
	var username=document.getElementById("id1").value;
	var password=document.getElementById("id2").value;
	if(username==""||password=="")
		{
		alert("all fields are mandatory");
		return false;
		}
	else
		{
		return true;
		}
}
	</script>
</head>
<body background="1.jpg">
<h1 align="center"><font color=red>RAJ MOTORS</font></h1>
<td><a href="home.jsp">Home</a> 

<table align="center"><tr><td>New user??<a href="./Registration.jsp"> Register here</a></td></tr></table>

<form onsubmit="return chklogin()" action=./LoginServlet method="post">
<table border=1 align="center">
<tr><td><font color=red>*</font>UserId:</td><td><input type="text" name="username" id="id1"></td></tr>
<tr><td><font color=red>*</font>PassWord:</td><td><input type="password" name="password" id="id2"></td></tr>
<tr><td><input type="submit" value="Login"></td></tr>
</table>
</form>
<c:if test="${msg == 'fail'}">
<font color=red>INVALID USER</font>
</c:if>
</body>
</html>