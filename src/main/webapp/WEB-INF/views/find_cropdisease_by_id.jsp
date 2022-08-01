<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>find crop disease</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="get" modelAttribute="findCropdiseasebyid">
				<div>
					<label for="crop_id">Crop id</label>
					<div>
						<form:input path="crop_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="disease_id">disease id</label>
					<div>
						<form:input path="disease_id" readonl/>
					</div>
					<div>
						<label for="affecting_stages">Affecting Stages</label>
						<div>
							<form:input path="affecting_stages" />
						</div>
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