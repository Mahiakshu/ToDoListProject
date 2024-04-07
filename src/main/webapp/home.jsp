<%@page import="java.util.List"%>
<%@page import="com.DTO.project.Task"%>
<%@page import="java.util.Base64"%>
<%@page import="com.DTO.project.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#parent{
  border: 2px solid black;
  display: flex;
}
#user{
text-align:center;
margin-top:30px;
margin-left:30px;
width: 1200px;
height: 150px;
}
#image{
width: 100%;
height: 250px;
position: relative;
top: 15px;
left:100px;
}
#nav{
margin-top:20px;
border: 1px solid black;
height: 15px;
width: 70px;
background-color: orange;
line-height: 14px;
padding: 5px;
border-radius: 15px;
}
#a{
text-decoration: none;
color: black;
margin-left: 4px;
}
#table,.tr{
border: 1px solid black;
border-collapse: collapse;
padding: 10px;
}
</style>
</head>
<body>
<div id="parent">
<div id="user">
<%User user =(User) request.getSession().getAttribute("user"); %>
<h1>welcome::<%=user.getUsername()%></h1>
<h1>email ::<%=user.getUseremail()%></h1>
</div>
<div id="image">
<% String image = new String(Base64.getEncoder().encode(user.getUserimage())); %>
<img alt="" src="data:image/jpeg;base64,<%= image %>" width="200px" height="200px">
</div>

</div>

<nav id="nav"><a href="addtask.jsp" id="a">add task</a></nav>

<h2>TASKS</h2>
<%List<Task> tasks = (List)request.getAttribute("tasks"); %>
<table id="table">
<tr class="tr">
<th class="tr">task id</th>
<th class="tr">title</th>
<th class="tr">description</th>
<th class="tr">priority</th>
<th class="tr">due date</th>
<th class="tr">status</th>
<th>delete</th>
<th class="tr">update</th>
</tr>
<% int num=1; %>
<% for(Task task:tasks){ %>
<tr class="tr">
<td class="tr"><%=num++%></td>
<td class="tr"><%=task.getTasktitle()%></td> 

<td class="tr"><%= task.getTaskdescription() %></td>
<td class="tr"><%=task.getTaskpriority()%></td>
<td class="tr"><%=task.getTaskduedate()%></td>
<td class="tr"><%=task.getTaskstatus()%></td>
<td class="tr"><a href="delete?taskid=<%=task.getTaskid()%>">delete</a> </td>
<td class="tr"><a href="edit?taskid=<%=task.getTaskid()%>">update</a> </td>
</tr>
<%} %>

</table>

</body>
</html>