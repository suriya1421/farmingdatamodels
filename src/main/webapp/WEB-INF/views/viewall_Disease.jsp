<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>view all Disease</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
				    <th>disease id</th>
					<th>disease Name</th>
					<th>reason</th>
					<th>medicine</th>
					<th>prevention</th>
					
				</tr>
			</thead>
			<tbody><c:forEach var="disease" items="${allDisease}">
					<tr>
						<td>${disease.diseaseId }</td>
						<td>${disease.diseaseName  }</td>
						<td>${disease.reason}</td>
						<td>${disease.medicine}</td>
						<td>${disease.prevention}</td>
					</tr>
				
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>