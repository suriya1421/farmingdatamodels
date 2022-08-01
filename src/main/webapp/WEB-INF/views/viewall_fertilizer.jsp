<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view all fertilizer</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
				    <th>fer id</th>
					<th>ferName</th>
					<th>state</th>
					<th>cost</th>
					<th>stock in hand</th>
					
				</tr>
			</thead>
			<tbody><c:forEach var="fertilizer" items="${allfertilizer}">
					<tr>
						<td>${fertilizer.fer_id }</td>
						<td>${fertilizer.fer_name  }</td>
						<td>${fertilizer.state}</td>
						<td>${fertilizer. cost}</td>
						<td>${fertilizer.stock_in_hand}</td>
					</tr>
				
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>