<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>crop fertilizer</title>
<style>
table, th, td {
	border: 1px solid black;
	padding: 15px;
	text-align: left;
}

th, td {
	border-color: #96D4D4;
}
</style>
</head>
<body>
	<div id="returnfertilizerdetails">
		<table>
			
				<tr>
		<!-- 		<th>fertilizer id</th> -->
				<th>Fertilizer Name</th>
					<th>State</th>
					<th>Cost</th>
					</tr>
				<c:forEach var="fertilizerList" items="${fertilizerList}">
					<tr>
					 <%--    <td> ${fertilizerList.fertilizerId}</td> --%>
						<td>${fertilizerList.fertilizerName}</td>
						<td>${fertilizerList.state}</td>
						<td>${fertilizerList.cost}</td>
					</tr>
				</c:forEach>
				
			</table>
			<table>
			
			
			
				<tr>
					<!-- <th>crop id</th> -->
					<!-- <th>fertilizer id</th> -->
					<th>quantity</th>
					<th>stage of use</th>
					
			</tr>

				<c:forEach var="cropfer" items="${cropFertilizerDetailslist}">
					<tr>
						<%-- <td>${cropfer.cropId }</td> --%>
						<%-- <td>${cropfer.fertilizerId}</td> --%>
						<td>${cropfer.quantity}</td>
						<td>${cropfer.stageOfUse}</td>
					</tr>	
				</c:forEach>
		
		</table>

	</div>

</body>
</html>