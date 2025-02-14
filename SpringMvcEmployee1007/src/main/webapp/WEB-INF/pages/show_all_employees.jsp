<%@page import="com.nit.model.Employee" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees Details</title>
<script type="text/javascript">
	function addEmployee()
	{
		document.frm.action="addEmployee";
		document.frm.submit();
	}
	function deleteEmployee(id)
	{
		document.frm.emp_id.value=id;
		document.frm.action="deleteEmployee";
		document.frm.submit();
	}
</script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Employee List</h1>
		<form name="frm">
			<input type="hidden" name="emp_id" />
			<button onClick="addEmployee()" type="button" class="btn btn-primary">Add Employee</button>
			
			<table class="table table-success table-striped-columns">
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Address</th>
					<th>Salary</th>
				</tr>
				<c:forEach var="emp" items="${emps}">
					<tr>
						<td><c:out value="${emp.id}" /></td>
						<td><c:out value="${emp.name}" /></td>
						<td><c:out value="${emp.address}" /></td>
						<td><c:out value="${emp.salary}" /></td>
						<td align="center"><button type="button" class="btn btn-success">Edit</button></td>
						<td align="center"><button type="button" class="btn btn-warning" onClick="deleteEmployee(${emp.id})">Delete</button></td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</div>
</body>
</html>