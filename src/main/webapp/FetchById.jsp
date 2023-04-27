<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<spring:form method="get" action="getById">
		<table>
	        <tr>
	            <td><label for="id">Id:</label></td>
	            <td><input type="number" name="id" placeholder="enter the id"></td>
	        </tr>
	      
	        <tr>
	            <td><button>Submit</button></td>
	            <td><button type="reset">Cancel</button></td>
	        </tr>
	    </table>
	</spring:form>
</body>
</html>