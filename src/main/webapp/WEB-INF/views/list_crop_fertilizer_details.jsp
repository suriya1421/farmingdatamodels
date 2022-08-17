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
		<div id="getcropid">
			<form:form action="" method="get" modelAttribute="getcropid">
				<div>
					<label for="cropId">crop id</label>
					<div>
						<form:input path="cropId" readonly="true" />
					</div>
				</div>
				<div>
					<label for="cropName">crop Name</label>
					<div>
						<form:input path="cropName" readonly="true" />
					</div>
					<div>
						<label for="description">description</label>
						<div>
							<form:input path="description" readonly="true" />
						</div>
					</div>

				</div>
				<div>
					<label for="duration">duration</label>
					<div>
						<form:input path="duration"  readonly="true"/>
					</div>

					<form:button>find</form:button>
				</div>
			</form:form>
		</div>
	</div>
	<div id="returnfertilizerdetails">
		<table>
		<caption></caption>
			<thead>
				<tr>
				    <th>crop id</th>
					<th>fertilizer id</th>
					<th>quantity</th>
					<th>stage of use</th>					
					
				</tr>
			</thead>
			<tbody><c:forEach var="cropfer" items="${returnfertilizerdetails}">
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
</body>
</html>

