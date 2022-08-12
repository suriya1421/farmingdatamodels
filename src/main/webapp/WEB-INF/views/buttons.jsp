<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>buttons</title>
<style>
body {
	text-align: center;
	background-image:url("https://i.pinimg.com/originals/03/2c/90/032c90f4513c314497e4007ca4b8a926.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
	font-weight: bold;
}

.button {
	position: absolute;
	left: 220px;
	top: 400px;
	background-color: blue;
	padding: 12px 28px;
	border: none;
	color: tomato;
	font-weight: bold;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 40px;
	margin: 6px 3px;
	cursor: pointer;
	width: 25%;
}

.button2 {
	position: absolute;
	left: 640px;
	top: 400px;
	padding: 12px 28px;
	background-color: blue;
	border: none;
	color: tomato;
	font-weight: bold;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 40px;
	margin: 6px 3px;
	cursor: pointer;
	width: 25%;
}

.container {
	height: 50vh;
	display: flex;
	align-items: center;
	justify-content: center;
	position: absolute;
	margin: auto;
}

.button1 {
	position: absolute;
	top: 8px;
	left: 16px;
	font-size: 18px;
}
</style>
</head>
<body>
	<div>

		<p style="font-size: 30px;">Name of the Crop is: ${cropName }
		
	
		</p>
		<p style="font-size: 30px;">The Growing period of this plant is
			: ${duration } Days
		<div></div>
		<p style="font-size: 30px;">Description: ${cropDetailsDiscription}
		<div style="font-size: 30px;"></div>
		<p>
			<a href="/cropfertilizer/getCropFertilizer?cropid=${cropId}">
				<button class="button">Fertilizer</button>
			</a> <br /> <a href="/cropdisease/getCropDisease?cropid=${cropId}">
				<button class="button2">Disease</button>
			</a> <br /> <a href="/home/search">
				<button class="button1">Back</button>
			</a> <br />
	</div>
</body>
</html>