<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
 function chk(vehicle)
{
	var vehicletype=document.getElementById("id1").value;
	var Class=document.getElementById("id2").value;
	var htype=document.getElementById("id3").value;
	
	if(vehicletype=="heavy")
		{
		document.getElementById("id3").disabled=false;
		}
	else if(vehicletype=="4 wheeler")
		{
		document.getElementById("id2").disabled=false;
		}
	}
 function chklogin()
{
	var vid=document.getElementById("id4").value;
	var name=document.getElementById("id5").value;
	var chassy=document.getElementById("id6").value;
	var regno=document.getElementById("id7").value;
	var permit=document.getElementById("id8").value;
	var fuel=document.getElementById("id9").value;
	var vehicle=document.getElementById("id1").value;
	var man=document.getElementById("id10").value;
	var vendor=document.getElementById("id11").value;
	var ins=document.getElementById("id12").value;
	var seats=document.getElementById("id13").value;
	var ava=document.getElementById("id14").value;
	var payment=document.getElementById("id15").value;
	if(vid==""||name==""||chassy==""||regno==""||permit==""||fuel==""||vehicle==""||man==""||vendor==""||ins==""||seats==""||ava==""||payment=="")
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
<body bgcolor="#ECF6CE">
<img src="speed.jpg" alt="" height="200" width="1500">
<h1 align="center">ADD VEHICLE DETAILS</h1>
</body>
<form onsubmit="return chklogin()" action="./AddServlet" method="post">
<a href="./Admin.jsp">Home</a>
<table border=1 align="center">
<tr><td>vid:</td><td><input type="text" name="vid" id="id4"></td></tr>
<tr><td>Vehicle Name:</td><td><input type="text" name="name" id="id5"></td></tr>
<tr><td>Chassy number:</td><td><input type="text" name="chassy" id="id6"></td></tr>
<tr><td>Reg no:</td><td><input type="text" name="reg" id="id7"></td></tr>
<tr><td>Permit:</td><td><input type="text" name="permit" id="id8"></td></tr>
<tr><td>Vehicle Type:</td><td><input type="text" name="vtype" id="id1" onblur="return chk(this.value)"></td></tr>
< <tr><td>Class:</td><td><input type="text" name="class"  id="id2" disabled="disabled" ></td></tr>
<tr><td>Heavy Type:</td><td><input type="text" name="htype" id="id3" disabled="disabled"></td></tr> 
<tr><td>Fuel Type:</td><td><input type="text" name="fuel" id="id9"></td></tr>
<tr><td>Manufacture company:</td><td><input type="text" name="man" id="id10"></td></tr>
<tr><td>Vendor:</td><td><input type="text" name="vendor" id="id11"></td></tr>
<tr><td>Insurance no:</td><td><input type="text" name="ins" id="id12"></td></tr>
<tr><td>Seats:</td><td><input type="text" name="seats" id="id13"></td></tr>
<tr><td>Availability:</td><td><input type="text" name="ava" id="id14"></td></tr>
<tr><td>Payment Id:</td><td><input type="text" name="payment" id="id15"></td></tr>

<tr><td><input type="submit"></td></tr>
</table>
</form>
</body>
</html>