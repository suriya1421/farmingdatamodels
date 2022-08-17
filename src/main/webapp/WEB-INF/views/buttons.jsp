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

.cont .button:hover {
	box-shadow: rgba(44, 187, 99, .35) 0 -25px 18px -14px inset,
		rgba(44, 187, 99, .25) 0 1px 2px, rgba(44, 187, 99, .25) 0 2px 4px,
		rgba(44, 187, 99, .25) 0 4px 8px, rgba(44, 187, 99, .25) 0 8px 16px,
		rgba(44, 187, 99, .25) 0 16px 32px;
	transform: scale(1.05) rotate(-1deg);
	color: red;
}

.con .button2:hover {
	box-shadow: rgba(44, 187, 99, .35) 0 -25px 18px -14px inset,
		rgba(44, 187, 99, .25) 0 1px 2px, rgba(44, 187, 99, .25) 0 2px 4px,
		rgba(44, 187, 99, .25) 0 4px 8px, rgba(44, 187, 99, .25) 0 8px 16px,
		rgba(44, 187, 99, .25) 0 16px 32px;
	transform: scale(1.05) rotate(-1deg);
	color: red;
}


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

.cont .button{
   margin-top: 400px;
   margin-right: 330px;
   position:absolute; 
   top:0; 
   right:0;
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
		text-decoration: none;
	transition: all 250ms;
	font-size: 16px;
	user-select: none;
	-webkit-user-select: none;
	touch-action: manipulation;
	padding: 12px 28px;
}

.con .button2{
    margin-top: 24px;
    margin-right: 400px;
     position:absolute; 
    top:370px; 
    right:400px;
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
		text-decoration: none;
	transition: all 250ms;
	font-size: 16px;
	user-select: none;
	-webkit-user-select: none;
	touch-action: manipulation;
	padding: 12px 28px;
	
    }
</style>
</head>
<body>
	<div>

		<p style="font-size: 30px;">Name of the Crop is: ${cropName }</p>
		<p style="font-size: 30px;">The Growing period of this plant is :
			${duration } Days
		<p style="font-size: 30px;">Description: ${cropDetailsDiscription}   </p>
       <div class="cont">
			<a href="/cropfertilizer/getCropFertilizer?cropid=${cropId}">
				<button class="button">Fertilizer</button>
			</a> </div>
			<div class="con">
			 <br /> <a href="/cropdisease/getCropDisease?cropid=${cropId}">
				<button class="button2">Disease</button>
			</a>  </div>
			 <br /> <a href="/home/search">
				<button class="button1">Back</button>
			</a> <br />
	</div>
</body>
</html>