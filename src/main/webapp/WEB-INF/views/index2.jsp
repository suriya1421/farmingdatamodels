<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Crop Details</title>
<style>
body {
	text-align: center;
	background-image:
		url("https://images.pexels.com/photos/628281/pexels-photo-628281.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
	font-weight: bold;
}

.button {
	background: linear-gradient(to bottom right, #EF4765, #FF9A5A);
	border: 6;
	border-radius: 12px;
	color: #FFFFFF;
	cursor: pointer;
	display: inline-block;
	font-family: -apple-system, system-ui, "Segoe UI", Roboto, Helvetica,
		Arial, sans-serif;
	font-size: 16px;
	font-weight: 500;
	line-height: 2.5;
	outline: transparent;
	padding: 0 1rem;
	text-align: center;
	text-decoration: none;
	transition: box-shadow .2s ease-in-out;
	user-select: none;
	-webkit-user-select: none;
	touch-action: manipulation;
	white-space: nowrap;
	margin-top: 25px;
}


.button2 {
	position: absolute;
	top: 8px;
	left: 16px;
	font-size: 18px;
}
</style>
</head>
<body>
	<a href="/cropdetails/croplist"><button class="button">Crops
			Details</button></a>
	<br />
	<a href="/disease/alldiseaselist"><button class="button">
			Disease Details</button></a>
	<br />
	<a href="/cropdisease/viewallcropdiseaselist"><button
			class="button">Crop Disease Details</button></a>
	<br />
	<a href="/fertilizer/allfertilizerlist"><button class="button">
			Fertilizer Details</button></a>
	<br />
	<a href="/cropfertilizer/allcropfertilizerlist"><button
			class="button">Crop Fertilizer Details</button></a>
	<br />
	<a href="/user/alluserlist"><button class="button">Users
			Details</button></a>
	<br />
	<a href="/admin/adminlist"><button class="button">Admin
			Details</button></a>
	<br />
</body>
<button class="button2" onclick="history.back()">Back</button>
</html>