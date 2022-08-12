<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="getdiseasebyid">
				<div>
					<label for="diseaseId">disease id</label>
					<div>
						<form:input path="diseaseId" readonly="true" />
					</div>
				</div>
				<div>
					<label for="diseaseName">disease Name</label>
					<div>
						<form:input path="diseaseName" readonly="true" />
					</div>
					<div>
						<label for="reason">reason</label>
						<div>
							<form:input path="reason" readonly="true" />
						</div>
					</div>

				</div>
					<label for="medicine">medicine</label>
					<div>
						<form:input path="medicine"  readonly="true"/>
					</div>
					<div>
						<label for="prevention">prevention</label>
						<div>
							<form:input path="prevention" readonly="true"/>
						</div>
					</div>
					<div>
						<form:button>find</form:button>
					</div>
			</form:form>
		</div>
	</div>

<div id="table root">
		<table>
			<thead>
				<tr>
				    <th>crop id</th>
					<th>disease id</th>
					<th>affecting stages</th>					
					
				</tr>
			</thead>
			<tbody><c:forEach var="cropdisease" items="${returndiseasedetails}">
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