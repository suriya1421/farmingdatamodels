<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>find Crop Details</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="getcrop" method="get" modelAttribute="findcropbyid">
				<div>
					<label for="crop_id">crop id</label>
					<div>
						<form:input path="crop_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="crop_name">crop Name</label>
					<div>
						<form:input path="crop_name" readonly="true" />
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
</body>
</html>