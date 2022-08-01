<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>find Crop fertilizer</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="getcropfertilizer" method="get" modelAttribute="findcropfertilizerbyid">
				<div>
					<label for="crop_id">crop id</label>
					<div>
						<form:input path="crop_id" />
					</div>
				</div>
				<div>
					<label for="fer_id">fertilizer id</label>
					<div>
						<form:input path="fer_id" />
					</div>
					<div>
						<label for="quantity">quantity</label>
						<div>
							<form:input path="quantity" />
						</div>
					</div>

				</div>
				<div>
					<label for="stage_of_use">stage of use</label>
					<div>
						<form:input path="stage_of_use" />
					</div>

					<form:button>find</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>