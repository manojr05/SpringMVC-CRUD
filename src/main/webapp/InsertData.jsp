<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InsertData</title>
</head>
<body>
	<spring:form method="post" modelAttribute="employee" action="saveEmployee">
		<table>
	        <tr>
	            <td><label for="name">Name:</label></td>
	            <td><input type="text" name="name" placeholder="enter your name"></td>
	        </tr>
	        <tr>
	            <td><label for="dob"></label>Date of Birth:</td>
	            <td><input type="date" name="date" placeholder="enter your dob"></td>
	        </tr>
	        <tr>
	            <td><label for="sal"></label>Salary:</td>
	            <td><input type="number" name="sal" placeholder="enter your monthly salary"></td>
	        </tr>
	        <tr>
	            <td><label for="mobile">Number:</label></td>
	            <td><input type="number" name="phoneNo" placeholder="enter your mobile number"></td>
	        </tr>
	        <tr>
	            <td><button>Submit</button></td>
	            <td><button type="reset">Cancel</button></td>
	        </tr>
	    </table>
	</spring:form>
</body>
</html>