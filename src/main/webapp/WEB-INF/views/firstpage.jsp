<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">


body{
text-align:center;
background-image:url("https://w0.peakpx.com/wallpaper/1011/21/HD-wallpaper-crop-field-sunset-field-sunset-nature-graphy.jpg");
background-repeat: no-repeat;
background-attachment:fixed;
background-size:100% 100%;
font-weight:bold;
}
.button
{
top:150px;
font-size:40px;
width:25%;
left:60px;
border-radius:10px;
margin:20px;
padding:10px;
}

.container{
max-width:700px;
width:100%;
height:50vh;
display:flex;
align-items:center;
justify-content:center;
position:absolute;
margin:auto;
top:100px;
left:270px;
}


</style>
</head>
<body><div class="container">
	<button class="button" >USER</button>
    <button class="button">ADMIN</button>
	</div>
	
</body>
</html>