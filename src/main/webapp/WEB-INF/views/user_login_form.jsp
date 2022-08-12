<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>USER DETAILS</h1>
	<form:form action="checkuserlogin" method="post" modelAttribute="user">
		<div>
			<label for="userName">User Name:</label>
			<form:input path="userName" type="text" />
		</div>
		<div>
			<label for="Password">User Password:</label>
			<form:input path="Password" type="password" />
		</div>
		<div>
			<form:button type="submit" class="register">DONE</form:button>
		</div>
	</form:form>
</body>
</html>