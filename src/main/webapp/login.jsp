<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
background-image: url("https://cdn.pixabay.com/photo/2022/07/20/18/44/reading-7334749_640.png");
background-repeat: repeat;
background-size: 100vh 100vh;
}
#form{
margin-top: 20px;
margin-bottom: 50px;
margin-left: 20px;
text-align: center;
}
#fs{
margin-top:80px;
margin-left: 180px;
border: 5px solid white;
width: 500px;
}
#fs:hover{
box-shadow: 0px 0px 30px blue;
}
.input{
margin-top: 30px;
}
#submit{
margin-top: 20px;
padding: 5px;
background-color:blue;
border-radius: 10px;
}
#leg{
color: white;
}
#submit:hover {
	box-shadow: 0px 0px 20px white;
}
#label1{
margin-left: 25px;
color: white;
font-size: x-large;
}
#label2{
color: white;
font-size: x-large;
}
</style>
</head>
<body>

<fieldset id="fs">
<legend id="leg">ENTER THE EMAIL AND PASSWORD</legend>

<div id="form">

<form action="userlogin" method="post">
<label class="input" id="label1">email::</label> <input type="text" name="email" class="input" id="inp1"><br>
<label class="input" id="label2">password::</label> <input type="text" name="password" class="input" id="inp2"><br>
<input type="submit" id="submit">

</form>
</div>
</fieldset>



</body>
</html>