<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Employee Page</title>
</head>
<body>
	<form action="./updateemployee" method="post">
		Employee id : <input type="text" name="id" value="${employee.id}" readonly><br>
		Employee Name : <input type="text" name="name" value="${employee.name}"><br>
		Employee Organization : <input type="text" name="organization" value="${employee.organization}"><br>
		Employee Salary : <input type="text" name="salary" value="${employee.salary}"> <br>
		<input type="submit" value="Update employee">		
	</form>
	
	<br><br>
		<a href="<c:url value="/resources/index.html"/>"> Go to home </a>
</body>
</html>