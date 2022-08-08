<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
text-align:center;
background-image:url("https://dharani.telangana.gov.in/img/slider10.jpg");
background-repeat: no-repeat;
background-attachment:fixed;
background-size:100% 100%;
font-weight:bold;
}
</style>
</head>
<body>
	<form action="">
		<label for="crop">Choose a crop</label> <select id="crops"
			name="crops">
			<option value="tomato">Tomato</option>
			<option value="chilly">Chilly</option>
			<option value="onion">Onion</option>
			<option value="potato">Potato</option>
		</select> <input type="submit">
		
	</form>
</body>
</html>