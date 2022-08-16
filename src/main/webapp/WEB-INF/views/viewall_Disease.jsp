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
		<table><caption></caption>
			<thead>
				<tr>
				    <th>disease id</th>
					<th>disease Name</th>
					<th>reason</th>
					<th>medicine</th>
					<th>prevention</th>
					<th>update</th>
					<th>delete</th>
					
				</tr>
			</thead>
			<tbody><c:forEach var="disease" items="${allDisease}">
					<tr>
						<td>${disease.diseaseId }</td>
						<td>${disease.diseaseName  }</td>
						<td>${disease.reason}</td>
						<td>${disease.medicine}</td>
						<td>${disease.prevention}</td>
						<td><a href="/disease/updatedisease?update=${disease.diseaseId} ">update</a></td>
						<td><a href="/disease/deletedisease?id=${disease.diseaseId} ">delete</a></td>
					</tr>
				
				</c:forEach>
			</tbody>
		</table>
		<a href="/disease/addnewdisease"><button class="button">add</button></a>

	</div>
</body>
</html>