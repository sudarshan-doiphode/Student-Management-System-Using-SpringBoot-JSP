<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp"%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark"
		style="background-color: black; height: 80px;">
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="index.jsp"
					style="font-family: sans-serif; font-size: 22px">Home <span
						class="sr-only">(current)</span></a></li>
			</ul>
		</div>
	</nav>
	<fieldset>
		<table class="table" border="2"
			style="margin-top: 25px; text-align: center">
			<thead class="thead-dark">
				<tr>
					<th scope="col">RollNo</th>
					<th scope="col">Firstname</th>
					<th scope="col">LastName</th>
					<th scope="col">Address</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="s" items="${studentlist}">
					<tr>
						<td>${s.rollnumber}</td>
						<td>${s.firstname}</td>
						<td>${s.lastname}</td>
						<td>${s.address}</td>
						<td scope="col"><a href="delete/${s.rollnumber }"><i
								class="fa-solid fa-trash text-danger" style="font-size: 20px"></i></a>
							<a href="update?rollnumber=${s.rollnumber}"><i
								class="fa-solid fa-pen text-primary" style="font-size: 20px"></i></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="container text-center">
			<a href="index.jsp" class="btn btn-outline-warning">Go Back</a> <a
				href="add.jsp" class="btn btn-outline-success">Add Student</a>
		</div>
	</fieldset>
</body>
</html>