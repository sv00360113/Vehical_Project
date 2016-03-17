<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	var fname=document.getElementById("id3").value;
	var lname=document.getElementById("id4").value;
	var phone=document.getElementById("id5").value;
	var email=document.getElementById("id6").value;
	var address=document.getElementById("id7").value;
	
	if(username==""||password==""||fname==""||lname==""||phone==""||email==""||address=="")
		{
		alert("all fields are mandatory");
		return false;
		}
	else
		{
		return true;
		}
}

function chkphone(phone)
{
	var phoneno=/^\d{10}$/;
	if(phone.value.match(phoneno))
		{
		return true;
		}
	else
		{
		alert("Please enter 10 digit  phone no");
		return false;
		}
	}
</script>
<script type="text/javascript"> 
function validatemail() {
     var x = document.getElementById("id6").value;
     var atpos = x.indexOf("@");
     var dotpos = x.lastIndexOf(".");
     if (atpos< 1 || dotpos<atpos+2 || dotpos+2>=x.length) {
         alert("Not a valid e-mail address. Dot or @ is missing");
         return false;
         }
     }     
</script>

<script type="text/javascript"> 
function valfname(fname) {
	//var fname=document.getElementById("id3").value;
	var letters=/^[A-Za-z]+$/;
	if(fname.value.match(letters))
		{
		return true;
		}
	else{
		alert("first name must have alphabets only");
		return false;
	}
	
}

function vallname(lname) {
	
	var letters=/^[A-Za-z]+$/;
	if(lname.value.match(letters))
		{
		return true;
		}
	else{
		alert("last name must have alphabets only");
		return false;
	}
	
}

</script>
	
</head>
<body bgcolor="#ECF6CE">
<img src="speed.jpg" alt="" height="200" width="1500">
<h1 align="center">REGISTRATION PAGE</h1>
<form onsubmit="return chklogin()" action="./RegisterServlet" method="post">
<table border=1 align="center">
<tr><td><font color=red>*</font>CustomerId:</td><td><input type="text" name="customerid" id="id1"></td></tr>

<tr><td><font color=red>*</font>Password:</td><td><input type="password" name="password" id="id2"></td></tr>

<tr><td><font color=red>*</font>First Name:</td><td><input type="text" name="fname" id="id3" onblur="return valfname(fname)"></td></tr>

<tr><td><font color=red>*</font>Last Name:</td><td><input type="text" name="lname"id="id4" onblur="return vallname(lname)"></td></tr>

<tr><td><font color=red>*</font>Phone:</td><td><input type="text" name="phone" id="id5" onblur="return chkphone(phone)"></td></tr>

<tr><td><font color=red>*</font>Email:</td><td><input type="text" name="email" id="id6" onblur="validatemail()"></td></tr>

<tr><td><font color=red>*</font>Address:</td><td><textarea rows="10" cols="10" name="address" id="id7"></textarea></td></tr>
<tr><td><input type="submit" value="register">
</table>
</form>
</body>
</html>