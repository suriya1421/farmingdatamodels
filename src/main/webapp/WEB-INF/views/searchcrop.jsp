<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	text-align: center;
	background-image:
		url("https://dharani.telangana.gov.in/img/slider10.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
	font-weight: bold;
  justify-content: center;
}
h1{
	 font-size: 50px;
   padding: 5%;
   color: #ADD8E6;
}
.button {
	position: absolute;
	top: 8px;
	left: 16px;
	font-size: 18px;
}

label {
	border: 2px solid;
	border-radius: 4px;
	font-size: 1rem;
	margin: 0.25rem;
	min-width: 12px;
	padding: 15%;
	transition: background-color 0.5s ease-out;
	margin-bottom: 900px;
}

.submit {
	border: 2px solid;
	border-radius: 4px;
	font-size: 1rem;
	margin: 0.25rem;
	min-width: 125px;
	padding: 0.5rem;
	transition: background-color 0.5s ease-out;
}
.select
{
 border: 2px solid;
	border-radius: 4px;
	font-size: 1rem;
	margin: 0.25rem;
	min-width: 125px;
	padding: 0.5rem;
	transition: background-color 0.5s ease-out;
}
</style>
</head>
<body>
	<form:form action="button" method="post" modelAttribute="cropDetails">
		<h1>Search Crop </h1>
		<form:select class="select" path="cropId">
			<c:forEach var="croplist" items="${croplist}">
				<form:option value="${croplist.cropId}" label="${croplist.cropName}" />
			</c:forEach>
		</form:select>

		<form:button class="submit">SUBMIT</form:button>
	</form:form>
		<button class="button" onclick="history.back()">Back</button>
	<br />
</body>
</html>