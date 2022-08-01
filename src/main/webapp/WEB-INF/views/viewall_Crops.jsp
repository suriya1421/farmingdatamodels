<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view all Crops</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
				    <th>crop id</th>
					<th>crop Name</th>
					<th>description</th>
					<th>duration</th>
					
					
				</tr>
			</thead>
			<tbody><c:forEach var="crop" items="${allcrop}">
					<tr>
						<td>${crop.cropId }</td>
						<td>${crop.cropName  }</td>
						<td>${crop.description}</td>
						<td>${crop.duration}</td>
					</tr>
				
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>