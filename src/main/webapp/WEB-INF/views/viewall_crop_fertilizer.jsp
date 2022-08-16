<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>view all Crop fertilizer</title>
</head>
<body>
	<div id="table root">
		<table><caption></caption>
			<thead>
				<tr>
				    <th>crop id</th>
					<th>fertilizer id</th>
					<th>quantity</th>
					<th>stage of use</th>
					<th>update</th>
					<th>delete</th>					
					
				</tr>
			</thead>
			<tbody><c:forEach var="cropfer" items="${cropFertilizer}">
					<tr>
						<td>${cropfer.cropId }</td>
						<td>${cropfer.fertilizerId}</td>
						<td>${cropfer.quantity}</td>
						<td>${cropfer.stageOfUse}</td>
						<td><a href="/cropfertilizer/updatequantityandstage?id=${cropfer.cropId }&fertilizerId=${cropfer.fertilizerId}">update</a></td>
						<td><a href="/cropfertilizer/deletequantityandstage?id=${cropfer.cropId }&fertilizerId=${cropfer.fertilizerId}">delete</a></td>
					</tr>
				
				</c:forEach>
			</tbody>
		</table>
		<a href="/cropfertilizer/addquantityandstage"><button class="button">add</button></a>

	</div>
</body>
</html>