<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view all Crop fertilizer</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
				    <th>crop id</th>
					<th>fertilizer id</th>
					<th>quantity</th>
					<th>stage of use</th>					
					
				</tr>
			</thead>
			<tbody><c:forEach var="cropfer" items="${cropFertilizer}">
					<tr>
						<td>${cropfer.crop_id }</td>
						<td>${cropfer.fer_id}</td>
						<td>${cropfer.quantity}</td>
						<td>${cropfer.stage_of_use}</td>
					</tr>
				
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>