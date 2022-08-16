<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>view all fertilizer</title>
</head>
<body>
	<div id="table root">
		<table><caption></caption>
			<thead>
				<tr>
				    <th>fer id</th>
					<th>ferName</th>
					<th>state</th>
					<th>cost</th>
					<th>update</th>
					<th>delete</th>
					
				</tr>
			</thead>
			<tbody><c:forEach var="fertilizer" items="${allfertilizer}">
					<tr>
						<td>${fertilizer.fertilizerId }</td>
						<td>${fertilizer.fertilizerName  }</td>
						<td>${fertilizer.state}</td>
						<td>${fertilizer. cost}</td>
						<td><a href="/fertilizer/updatefertilizer?id=${fertilizer.fertilizerId }">update</a><td>
						<td><a href="/fertilizer/deletefertilizer?id=${fertilizer.fertilizerId }">delete</a>
						
					</tr>
				
				</c:forEach>
			</tbody>
		</table>
		<a herf=/fertilizer/addfertilizer><button class="button">add</button></a>

	</div>
</body>
</html>