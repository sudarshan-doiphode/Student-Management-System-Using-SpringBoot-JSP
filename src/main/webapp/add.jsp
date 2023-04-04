<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp"%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: #0dcaf0">
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1>Fill The Student Details</h1>
				<form action="add" method="post">
					<div class="form-group">
						<label>RollNumber</label> <input type="text"
							class="form-control" id="rollnumber" name="rollnumber">
					</div>

					<div class="form-group">
						<label>FirstName</label> <input type="text"
							class="form-control" id="firstname" name="firstname">
					</div>

					<div class="form-group">
						<label>LastName</label> 
						<input type="text" class="form-control" id="lastname" name="lastname">
					</div>
					
					<div class="form-group">
						<label>Address</label> 
						<input type="text" class="form-control" id="address" name="address">
					</div>

					<div class="container text-center">
						<button type="submit" class="btn btn-primary" onsubmit="">Add</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>