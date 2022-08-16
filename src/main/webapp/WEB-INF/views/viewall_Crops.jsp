<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>view all Crops</title>
</head>
<body>
	<div id="table root">
		<table>
			<caption></caption>
			<thead>
				<tr>
					<th>crop id</th>
					<th>crop Name</th>
					<th>description</th>
					<th>duration</th>
					<th>update</th>
					<th>delete</th>


				</tr>
			</thead>
			<tbody>
				<c:forEach var="crop" items="${allcrop}">
					<tr>
						<td>${crop.cropId }</td>
						<td>${crop.cropName  }</td>
						<td>${crop.description}</td>
						<td>${crop.duration}</td>
						<td><a href="/cropdetails/updatecrop?id=${crop.cropId }">update</a>
						<td><a href="/cropdetails/deletecrop?id=${crop.cropId }">delete</a></td>

					</tr>

				</c:forEach>

			</tbody>
		</table>
		<a href="/cropdetails/addcrop"><button class="button">Add</button></a>
	</div>
</body>
</html>