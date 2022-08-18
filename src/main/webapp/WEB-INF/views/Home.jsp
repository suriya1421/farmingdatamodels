<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>

 <style><%@include file="/WEB-INF/views/css/homepage.css"%></style>
</head>
<body>
	<nav>
		<div Class="logo">
			<p>FARM DATA MODEL</p>
	</div>
	
		<ul>
			<li><a href="/home/userlogin">User Signin</a></li></a>
			<li><a href="/user/addnewuser">User Signup</a></li>
			<li><a href="/admin/loginform">Admin</a></li></a>
			<li><a href="/home/about">About Us</a></li></a>
			
		</ul>
	</nav>

</body>
</html>