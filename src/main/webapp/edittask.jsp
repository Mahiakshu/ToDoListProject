<%@page import="com.DTO.project.Task"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">



</style>
</head>
<body>
<fieldset>
<legend>UPDATE-TASK</legend>
<% Task task = (Task)request.getAttribute("tasks"); %>

<form action="updatetask" method="post">

<label for="task1">task id::</label>
<input type="text" name="taskid" required class="input" id="task1"><br>

<label for="task2">task title::</label>
<input type="text" name="tasktitle" required class="input" id="task2" value="<%task.getTasktitle();%>"><br>

<label for="task3">task description::</label>
<input type="text" name="taskdescription" class="input" id="task3" value="<%task.getTaskdescription();%>"><br>

Current task priority::<h4><%=task.getTaskpriority() %></h4><br>
<label>options:</label><br>

<label for="opt1" class="label">low</label>
<input type="radio" id="opt1" value="low" name="taskpriority" class="input"><br>

<label for="opt2" class="label">medium</label>
<input type="radio" id="opt2" value="medium" name="taskpriority" class="input"><br>

<label for="opt3" class="label">high</label>
<input type="radio" id="opt3" value="high" name="taskpriority" class="input"><br>

<label for="task4">due date::
</label><input type="date" name="taskduedate" class="input" id="task4" value="<%task.getTaskduedate();%>"><br>

<label for="task5">task status::
</label><input type="text" name="taskstatus" class="input" id="task5" value="<%task.getTaskstatus();%>"><br>

<input type="submit" id="submit">


</form>

</fieldset>

</body>
</html>