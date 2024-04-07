<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body
{
background-image: url("https://cdn.pixabay.com/photo/2016/10/10/22/05/jellyfishes-1730018_640.jpg");
background-repeat: no-repeat;
background-size: 100% 100vh;
}
a {
	margin-top: 
}
#div{
display: flex;
}
.nav{
border: 2px solid grey;
height: 25px;
width: 50px;
background-color:blue;
margin-left: 150px;
line-height: 20px;
padding: 10px;
border-radius: 15px;
text-align: center;
}
.nav:hover{
box-shadow: 0px 0px 20px white;
}
.a{
text-decoration: none;
color: white;
}
#div{
margin-top: 70px;
margin-bottom: 70px;
}
#fs{
margin-top: 100px;
width: 600px;
margin-left: 120px;
border: 5px solid black;
}
#fs:hover {
	box-shadow: 0px 0px 20px white;
}
#leg{
color: white;
}
</style>
</head>
<body>
<fieldset id="fs">
<legend id="leg">CLICK TO LOGIN OR SIGNUP</legend>
<div id="div">
<nav class="nav"><a href="login.jsp" class="a">login</a></nav>
<nav class="nav"><a href="signup.jsp" class="a">signup</a></nav>
</div>
</fieldset>


</body>
</html>