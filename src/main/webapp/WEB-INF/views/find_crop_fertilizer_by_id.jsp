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
			<form:form action="" method="get" modelAttribute="findcropfertilizerbyid">
				<div>
					<label for="cropId">crop id</label>
					<div>
						<form:input path="cropId" />
					</div>
				</div>
				<div>
					<label for="fertilizerId">fertilizer id</label>
					<div>
						<form:input path="fertilizerId" />
					</div>
					<div>
						<label for="quantity">quantity</label>
						<div>
							<form:input path="quantity" />
						</div>
					</div>

				</div>
				<div>
					<label for="stageOfUse">stage of use</label>
					<div>
						<form:input path="stageOfUse" />
					</div>

					<form:button>find</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>