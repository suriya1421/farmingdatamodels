<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update Crop Details</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="update" method="post" modelAttribute="updatecrop">
				<div>
					<label for="crop_id">crop id</label>
					<div>
						<form:input path="crop_id" />
					</div>
				</div>
				<div>
					<label for="crop_name">crop Name</label>
					<div>
						<form:input path="crop_name" />
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

					<form:button>update</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>