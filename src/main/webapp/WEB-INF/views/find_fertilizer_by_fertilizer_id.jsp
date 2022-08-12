<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>find fertilizer by fertilizer id</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="getFertilizer">
				<div>
					<label for="fertilizerId">fertilizer id</label>
					<div>
						<form:input path="fertilizerId" readonly="true" />
					</div>
				</div>
				<div>
					<label for="fertilizerName">fertilizer Name</label>
					<div>
						<form:input path="fertilizerName" readonly="true" />
					</div>
					<div>
						<label for="state">state</label>
						<div>
							<form:input path="state" readonly="true" />
						</div>
					</div>

				</div>
				<label for="cost">cost</label>
				<div>
					<form:input path="cost" readonly="true" />
				</div>
			</form:form>
		</div>
		<div id="returnfertilizerdetails">
		<table>
			<thead>
				<tr>
					<th>crop id</th>
					<th>fertilizer id</th>
					<th>quantity</th>
					<th>stage of use</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="cropfer" items="${getFertilizerAndFertilizerDetails}">
					<tr>
						<td>${cropfer.cropId }</td>
						<td>${cropfer.fertilizerId}</td>
						<td>${cropfer.quantity}</td>
						<td>${cropfer.stageOfUse}</td>
					</tr>

				</c:forEach>
			</tbody>
		</table>

	</div>
	</div>

	
</body>
</html>