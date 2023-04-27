<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FetchAllEmployee</title>
</head>
<body>

	<h1>${msg }</h1>
	
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Salary</th>
			<th>DOB</th>
			<th>Phone Number</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		
		<x:forEach var="a" items="${list}">
			<tr>
				<td>${a.getId() }</td>
				<td>${a.getName() }</td>
				<td>${a.getSal() }</td>
				<td>${a.getDob() }</td>
				<td>${a.getPhoneNo() }</td>
				<td><a href="edit?id=${a.getId()}"><button>Edit</button></a></td>
				<td><a href="delete?id=${a.getId()}"><button>Delete</button></a></td>
			</tr>
		</x:forEach>
	</table>
</body>
</html>