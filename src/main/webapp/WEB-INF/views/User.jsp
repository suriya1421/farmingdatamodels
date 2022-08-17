<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
body {
	background-image:
		url("https://i.pinimg.com/originals/6c/55/bb/6c55bb682541f51946025683440b8d10.jpg");
	background-attachment: fixed;
	background-size: 100% 100%;
}

h1 {
	color: blue;
	margin-left: 450px;
}

label {
	color: blue;
	font-size: 50;
	display: flex;
	margin: 5px;
	font-weight: bold;
	cursor: pointer;
	transition: .5s ease-in-out;
}

#userId {
	width: 250px;
	height: 30px;
	border: none;
	border-radius: 3px;
	padding-left: 8px;
}

#secretword {
	width: 250px;
	height: 30px;
	border: none;
	border-radius: 3px;
	padding-left: 8px;
}

#userType {
	width: 260px;
	height: 30px;
	border: none;
	border-radius: 3px;
	padding-left: 8px;
}

#log {
	width: 150px;
	height: 30px;
	border: black;
	border-radius: 3px;
	padding-left: 8px;
	color: white;
	background-color: maroon;
	display: inline-block;
	margin: 4px 2px;
	cursor: pointer;
	-webkit-transition-duration: 0.4s;
	transition-duration: 0.4s;
}

.box {
	width: 400px;
	height: 240px;
	overflow: hidden;
	border-radius: 10px;
	box-shadow: 5px 20px 50px #000;
	margin: auto;
	padding: 10px;
	text-align: center;
	float: center;
	background-color: #C9DFEC;
}

#log {
	box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0
		rgba(0, 0, 0, 0.19);
}

#cont {
	position: relative;
	left: 100px;
}

.button {
	position: absolute;
	top: 8px;
	left: 16px;
	font-size: 18px;
}
</style>
</head>
<body>
	<br>
	<h1 id="cont">User Login</h1>
	<br>
	<div id="root" class="box">
		<div id="form">
			<table>
			<caption></caption>
			<tr><th></th></tr>
				<form:form action="checkuserlogin" method="post"
					modelAttribute="user">
					<tr>
						<div>
							<td><label for="userName">User Name</label></td>
							<div>
								<td><form:input path="userName"
										title="Please Enter Charactor Only" pattern="^[a-z A-Z]+$"
										class="form-control" required="true" placeholder="Enter Name" /></td>
							</div>
							<form:errors path="userName" cssClass="text-danger" />
						</div>
					</tr>
					<tr>
						<div>
							<td><label for="Password">Password</label></td>
							<div>
								<td><form:input type="password"
										title="password is not in correct format"
										pattern="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" path="password"
										required="true" placeholder="Enter Password"
										class="form-control" /></td>
							</div>
							<form:errors path="password" cssClass="text-danger" />
						</div>
						<br>
					</tr>

					<tr>
						<div>
							<td colspan="5" align="right"><br> <form:button
									id="log">Login</form:button></td>
						</div>

					</tr>
				</form:form>
			</table>
			<a href="/home/homepage1">
				<button class="button">Back</button>
			</a> <br />
		</div>
	</div>
</body>
</html>