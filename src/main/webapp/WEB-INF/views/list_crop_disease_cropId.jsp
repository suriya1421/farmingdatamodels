<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
	border: 1px solid black;
	padding: 15px;
	text-align: left;
}

th, td {
	border-color: #96D4D4;
}
</style>
</head>
<body>
	<div id="table root">
		<table>
			<caption></caption>
			<tr>
				<th>disease Name</th>
				<th>reason</th>
				<th>medicine</th>
				<th>prevention</th>
			</tr>

			<c:forEach var="disease" items="${diseaseList}">
				<tr>
					<td>${disease.diseaseName  }</td>
					<td>${disease.reason}</td>
					<td>${disease.medicine}</td>
					<td>${disease.prevention}</td>
				</tr>

			</c:forEach>
		</table>


		<table>
			<caption></caption>
			<caption></caption>

			<tr>

				<th>affecting stages</th>

			</tr>

			<c:forEach var="cropdisease" items="${cropDiseaseDetailslist}">
				<tr>

					<td>${cropdisease.affectingStages}</td>
				</tr>

			</c:forEach>

		</table>

	</div>


</body>
</html>