<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view all Crop disease</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
				    <th>crop id</th>
					<th>disease id</th>
					<th>affecting stages</th>					
					
				</tr>
			</thead>
			<tbody><c:forEach var="cropdisease" items="${allcropDisease}">
					<tr>
						<td>${cropdisease.crop_id }</td>
						<td>${cropdisease.disease_id}</td>
						<td>${cropdisease.affecting_stages}</td>
					</tr>
				
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>