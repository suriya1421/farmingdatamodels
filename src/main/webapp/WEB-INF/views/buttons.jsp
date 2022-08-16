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
	background-image:
		url("https://i.pinimg.com/originals/03/2c/90/032c90f4513c314497e4007ca4b8a926.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
	font-weight: bold;
}

.button {
	background-color: #c2fbd7;
	border-radius: 100px;
	box-shadow: rgba(44, 187, 99, .2) 0 -25px 18px -14px inset,
		rgba(44, 187, 99, .15) 0 1px 2px, rgba(44, 187, 99, .15) 0 2px 4px,
		rgba(44, 187, 99, .15) 0 4px 8px, rgba(44, 187, 99, .15) 0 8px 16px,
		rgba(44, 187, 99, .15) 0 16px 32px;
	color: green;
	cursor: pointer;
	display: inline-block;
	font-family: CerebriSans-Regular, -apple-system, system-ui, Roboto,
		sans-serif;
	padding: 7px 20px;
	text-align: center;
	text-decoration: none;
	transition: all 250ms;
	border: 0;
	font-size: 16px;
	user-select: none;
	-webkit-user-select: none;
	touch-action: manipulation;
}

.button:hover {
	box-shadow: rgba(44, 187, 99, .35) 0 -25px 18px -14px inset,
		rgba(44, 187, 99, .25) 0 1px 2px, rgba(44, 187, 99, .25) 0 2px 4px,
		rgba(44, 187, 99, .25) 0 4px 8px, rgba(44, 187, 99, .25) 0 8px 16px,
		rgba(44, 187, 99, .25) 0 16px 32px;
	transform: scale(1.05) rotate(-1deg);
	color: red;
}

.button2:hover {
	box-shadow: rgba(44, 187, 99, .35) 0 -25px 18px -14px inset,
		rgba(44, 187, 99, .25) 0 1px 2px, rgba(44, 187, 99, .25) 0 2px 4px,
		rgba(44, 187, 99, .25) 0 4px 8px, rgba(44, 187, 99, .25) 0 8px 16px,
		rgba(44, 187, 99, .25) 0 16px 32px;
	transform: scale(1.05) rotate(-1deg);
	color: red;
}

.button2 {
	background-color: #c2fbd7;
	border-radius: 100px;
	box-shadow: rgba(44, 187, 99, .2) 0 -25px 18px -14px inset,
		rgba(44, 187, 99, .15) 0 1px 2px, rgba(44, 187, 99, .15) 0 2px 4px,
		rgba(44, 187, 99, .15) 0 4px 8px, rgba(44, 187, 99, .15) 0 8px 16px,
		rgba(44, 187, 99, .15) 0 16px 32px;
	color: green;
	cursor: pointer;
	display: inline-block;
	font-family: CerebriSans-Regular, -apple-system, system-ui, Roboto,
		sans-serif;
	padding: 7px 20px;
	text-align: center;
	text-decoration: none;
	transition: all 250ms;
	border: 0;
	font-size: 16px;
	user-select: none;
	-webkit-user-select: none;
	touch-action: manipulation;
	margin-left: 250px;
	/* position: absolute;
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
	width: 25%; */
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

		<p style="font-size: 30px;">Name of the Crop is: ${cropName }</p>
		<p style="font-size: 30px;">The Growing period of this plant is :
			${duration } Days
		<div></div>
		<p style="font-size: 30px;">Description: ${cropDetailsDiscription}
		<p>
			<a href="/cropfertilizer/getCropFertilizer?cropid=${cropId}"><div align = "center">
				<button class="button">Fertilizer</button></div>
			</a> <br /> <a href="/cropdisease/getCropDisease?cropid=${cropId}">
				<div align = "center"><button class="button2">Disease</button></div>
			</a> <br /> <a href="/home/search">
				<button class="button1">Back</button>
			</a> <br />
	</div>
</body>
</html>