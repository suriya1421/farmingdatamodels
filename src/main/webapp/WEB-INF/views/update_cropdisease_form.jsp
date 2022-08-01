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
					<label for="cropId">Crop id</label>
					<div>
						<form:input path="cropId" />
					</div>
				</div>
				<div>
					<label for="diseaseId">disease id</label>
					<div>
						<form:input path="diseaseId" />
					</div>
					<div>
						<label for="affectingStages">Affecting Stages</label>
						<div>
							<form:input path="affectingStages" />
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