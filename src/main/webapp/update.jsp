<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="./base.jsp"%>
</head>
<body style="background-color: #0dcaf0">
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1>Update Student Details</h1>
				<form action="updateStudent" method="post">
					<div class="form-group">
						<label>RollNo</label> <input type="number"  readonly="readonly"
							class="form-control" value="${student.rollnumber }" name="rollnumber">
					</div>

					<div class="form-group">
						<label>FirstName</label> <input type="text"
							class="form-control" value="${student.firstname }" name="firstname">
					</div>

					<div class="form-group">
						<label>LastName</label> <input type="text"
							class="form-control" value="${student.lastname }" name="lastname">
					</div>

					<div class="form-group">
						<label>Address</label> <input type="text"
							class="form-control" value="${student.address }" name="address">
					</div>

					<div class="container text-center">
						<button type="submit" class="btn btn-warning" onsubmit="">Update</button>
					</div>
				</form>
			</div>

		</div>
		
	</div>
</body>
</html>