<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Disease Details</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="update" method="post" modelAttribute="updatedisease">
				<div>
					<label for="disease_id">disease id</label>
					<div>
						<form:input path="disease_id" />
					</div>
				</div>
				<div>
					<label for="disease_name">disease Name</label>
					<div>
						<form:input path="disease_name" />
					</div>
					<div>
						<label for="reason">reason</label>
						<div>
							<form:input path="reason" />
						</div>
					</div>

				</div>
				<div>
					<label for="medicine">medicine</label>
					<div>
						<form:input path="medicine" />
					</div>
					<div>
						<label for="prevention">prevention</label>
						<div>
							<form:input path="prevention" />
						</div>
					</div>
					<div>
						<form:button>update</form:button>
					</div>
			</form:form>
		</div>
	</div>
</body>
</html>