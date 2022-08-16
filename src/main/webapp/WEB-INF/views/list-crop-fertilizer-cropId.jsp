<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>crop fertilizer</title>
<style>

body {
	text-align: center;
	background-image:url("https://images.pexels.com/photos/82256/pexels-photo-82256.jpeg?auto=compress&cs=tinysrgb&w=600");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
	font-weight: bold;
}
table, th, td {
	border-style: solid ;
	border-color:#170587;
	padding: 15px;
	text-align: left;
	
}
th{
color:red;
font-size:160%;
font-style:bold;

}
td{
color:black;
font-size:120%;
font-style:bold;
}

th, td {
	border-color:#170587;
}
</style>
</head>
<body>
	<div id="returnfertilizerdetails">
		<table><caption></caption>

			<tr>
				<th>Fertilizer Name</th>
				<th>State</th>
				<th>Cost</th>
			</tr>
			<c:forEach var="fertilizerList" items="${fertilizerList}">
				<tr>
					<td>${fertilizerList.fertilizerName}</td>
					<td>${fertilizerList.state}</td>
					<td>${fertilizerList.cost}</td>
				</tr>
			</c:forEach>

		</table>
		<table>
			<caption></caption>



			<tr>

				<th>quantity</th>
				<th>stage of use</th>

			</tr>

			<c:forEach var="cropfer" items="${cropFertilizerDetailslist}">
				<tr>

					<td>${cropfer.quantity}</td>
					<td>${cropfer.stageOfUse}</td>
				</tr>
			</c:forEach>

		</table>

	</div>

</body>
</html>