<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
background-image: url("https://media.istockphoto.com/id/1200798366/vector/earth-futuristc-illustration.jpg?s=612x612&w=0&k=20&c=7B-JwdVO71d5aVXjTbpwca1lJ1dG99VTXeFC6rpxshE=");
background-repeat: no-repeat;
background-size: cover;
}
#fs{
border:10px solid white;
width: 600px;
height: 300px;
text-align: center;
margin-left: 130px;
margin-top: 50px;
border-radius: 100px;
background-image: url("https://media.istockphoto.com/id/1371127282/photo/connection-structure-science-background-3d-illustration.jpg?s=612x612&w=0&k=20&c=UpkaoGu00Srn5573NdAL3sl3j4lLM6NzpGsvlnTiflI=");
}
#fs:hover {
	box-shadow: 0px 0px 50px white;
}
#leg{
color: white;
}
#div{

}
#image{
margin-left: 60px;
}
.input{
margin-top: 15px;
}
#submit{
height: 25px;
width: 80px;
line-height: 20px;
background-color: aqua;
border-radius: 15px;
margin-top: 20px;
}
#submit:hover {
	box-shadow: 0px 0px 30px white;
}
.label{
font-size: x-large;
color: white;
text-shadow:blue;
}
</style>
</head>
<body>
<fieldset id="fs">
<legend id="leg">
ENTER THE DETAILS
</legend>
<div id="div">
<form action="saveuser" method="post" enctype="multipart/form-data">

<label for="id" class="label">id ::</label><input type="text" name="id" id="id" class="input"><br>
<label for="name" class="label">name::</label><input type="text" name="name" id="name" class="input"><br>
<label for="email" class="label">email::</label><input type="email" name="email" id="email" class="input"><br>
<label for="contact" class="label">contact::</label><input type="text" name="contact" id="contact" class="input"><br>
<label for="password" class="label">password::</label><input type="text" name="password" id="password" class="input"><br>
<label for="image" id="image" class="label">image::</label><input type="file" name="image" id="image1" class="input"><br>
<input type="submit" id="submit">

</form>
</div>
</fieldset>


</body>
</html>