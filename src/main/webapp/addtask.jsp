<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>ADD-TASK</legend>
<form action="addtask" method="post">

task id <input type="text" name="taskid" required class="input"><br>

task title<input type="text" name="tasktitle" required class="input"><br>

task description<input type="text" name="taskdescription" class="input"><br>

options:<br>

<label for="opt1" class="label">low</label>
<input type="radio" id="opt1" value="low" name="taskpriority" class="input"><br>

<label for="opt2" class="label">medium</label>
<input type="radio" id="opt2" value="medium" name="taskpriority" class="input"><br>

<label for="opt3" class="label">high</label>
<input type="radio" id="opt3" value="high" name="taskpriority" class="input"><br>

due date:<input type="date" name="taskduedate" class="input"><br>
<input type="submit" id="submit">

</form>

</fieldset>







</body>
</html>