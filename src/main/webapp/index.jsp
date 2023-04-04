<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp"%>
<meta charset="UTF-8">
<title>DashBoard of StudentManagement System</title>
</head>
<body style="background-color: #0dcaf0">
	<div class="container mt-3 text-center">
		<h1 style="font-size: 60px">Welcome</h1>
		<br> <br>
		<div class="list-group">
				<a href="./index.jsp" class="list-group-item list-group-item-action"><h3>Home</h3></a> 
				<a href="./add.jsp" class="list-group-item list-group-item-action"><h3>Add New Student</h3></a> 
				<a href="getStudents" class="list-group-item list-group-item-action"><h3>Student list</h3></a>
		</div>
	</div>
</body>
</html>