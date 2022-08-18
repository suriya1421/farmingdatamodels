<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>view all Crop disease</title>
<style><%@include file="/WEB-INF/views/css/table.css"%></style>
</head>
<body>
	<div id="table root">
		<table>
			<caption></caption>
			<thead>
				<tr>
					<th>crop id</th>
					<th>disease id</th>
					<th>affecting stages</th>
					<th>update</th>
					<th>delete</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="cropdisease" items="${allcropDisease}">
					<tr>
						<td>${cropdisease.cropId }</td>
						<td>${cropdisease.diseaseId}</td>
						<td>${cropdisease.affectingStages}</td>
						<td><a
							href="/cropdisease/updateaffectingstage?id=${cropdisease.cropId }&diseaseId=${cropdisease.diseaseId}">update</a></td>
						<td><a
							href="/cropdisease/deleteaffectingstage?id=${cropdisease.cropId }&diseaseId=${cropdisease.diseaseId}">delete</a></td>
					</tr>

				</c:forEach>
			</tbody>
		</table>
		<a href="/cropdisease/addaffectionstage"><button class="button">add</button></a>

	</div>
</body>
</html>