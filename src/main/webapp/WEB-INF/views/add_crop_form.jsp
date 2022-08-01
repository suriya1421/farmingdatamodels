<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Crop Details</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="addcropdetails">
				<div>
					<label for="cropId">crop id</label>
					<div>
						<form:input path="cropId" />
					</div>
				</div>
				<div>
					<label for="cropName">crop Name</label>
					<div>
						<form:input path="cropName" />
					</div>
					<div>
						<label for="description">description</label>
						<div>
							<form:input path="description" />
						</div>
					</div>

				</div>
				<div>
					<label for="duration">duration</label>
					<div>
						<form:input path="duration" />
					</div>

					<form:button>Add New</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>