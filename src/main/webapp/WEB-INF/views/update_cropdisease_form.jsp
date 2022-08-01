<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update crop disease</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="update" method="post" modelAttribute="updatecropdisease">
				<div>
					<label for="crop_id">Crop id</label>
					<div>
						<form:input path="crop_id" />
					</div>
				</div>
				<div>
					<label for="disease_id">disease id</label>
					<div>
						<form:input path="disease_id" />
					</div>
					<div>
						<label for="affecting_stages">Affecting Stages</label>
						<div>
							<form:input path="affecting_stages" />
						</div>
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