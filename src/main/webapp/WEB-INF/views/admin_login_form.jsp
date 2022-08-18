<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Admin login form</title>
<style>
body {
	text-align: center;
	background-image:
		url("https://cdn.wallpapersafari.com/70/22/VBrzE9.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
	font-weight: bold;
	
}

input[type=text] {
	width: 25%;
	padding: 12px 20px;
	margin: 8px 0;
	box-sizing: border-box;
}
input[type=password] {
	width: 25%;
	padding: 12px 20px;
	margin: 8px 0;
	box-sizing: border-box;
}
.button2 {
	position: absolute;
	top: 8px;
	left: 16px;
	font-size: 18px;
}
.sign{
 font-size:20px;
 
}



</style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="checkadminlogin" method="post"
				modelAttribute="adminlogin">
				<div>
					<h1>Admin Login</h1>
				</div>
				<div>
					<label for="email">Admin Email</label>
					<div>
						<form:input path="email" required="true" placeholder="Enter Email" />
					</div>
				</div>
				<div>
					<label for="password">Password</label>
					<div>
						<form:input path="password" type="password" required="true"
							placeholder="Enter Password" />
					</div>
				</div>
				<div>
				<a href="/user/alluserlist"> 
				 <form:button class="sign" value="SignIn">SignIn</form:button></a>
					<form:button class="sign" type="reset" value="Clear">Reset</form:button>
				</div>
			</form:form>
		</div>
	</div>
	<div>${result}</div>
	<button class="button2" onclick="history.back()">Back</button>
</body>
</html>