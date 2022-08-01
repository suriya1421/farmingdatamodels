<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>find Disease Details</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="getdisease" method="post" modelAttribute="finddiseasebyid">
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
</body>
</html>