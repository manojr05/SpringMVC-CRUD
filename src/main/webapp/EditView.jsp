<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<spring:form action="SaveEdit" modelAttribute="emp" method="post">
			<table>
		        <tr>
		            <td><label for="id">Id:</label></td>
		            <td><input type="number" name="id" value="${obj.getId() }"></td>
		        </tr>
		        <tr>
		            <td><label for="name">Name:</label></td>
		            <td><input type="text" name="name" value="${obj.getName() }"></td>
		        </tr>
		        <tr>
		            <td><label for="dob"></label>Date of Birth:</td>
		            <td><input type="date" name="date" value="${obj.getDob() }"></td>
		        </tr>
		        <tr>
		            <td><label for="sal"></label>Salary:</td>
		            <td><input type="number" name="sal" value="${obj.getSal() }"></td>
		        </tr>
		        <tr>
		            <td><label for="mobile">Number:</label></td>
		            <td><input type="number" name="phoneNo" value="${obj.getPhoneNo() }"></td>
		        </tr>
		        <tr>
		            <td><button>Update</button></td>
		            <td><button type="reset">Reset</button></td>
		        </tr>
	    </table>
	</spring:form>
</body>
</html>