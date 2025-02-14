<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Add Employee</h1>
		<form action="saveEmployee">
			<div class="form-floating mb-3">
				<input class="form-control" name="emp_name" id="floatingName"
					placeholder="Name"><label for="floatingName">Name</label>
			</div>
			<div class="form-floating">
				<input class="form-control" name="emp_address" id="floatingAddress"
					placeholder="Address"> <label for="floatingAddress">Address</label>
			</div>
			<div class="form-floating">
				<input class="form-control" name="emp_salary" id="floatingSalary"
					placeholder="Address"> <label for="floatingSalary">Salary</label>
			</div>
			<button class="btn btn-primary" type="submit">Save Employee</button>

		</form>
	</div>
</body>
</html>