<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Disease</title>
</head>
<body>
	<div id="table root">
		<table><caption></caption>
			<thead>
				<tr>
				    <th>crop id</th>
					<th>disease id</th>
					<th>affecting stages</th>					
					
				</tr>
			</thead>
			<tbody><c:forEach var="cropdisease" items="${cropDiseaseList}">
					<tr>
						<td>${cropdisease.cropId }</td>
						<td>${cropdisease.diseaseId}</td>
						<td>${cropdisease.affectingStages}</td>
					</tr>
				
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>