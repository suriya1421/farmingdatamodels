<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>add fertilizer</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="addfertilizer">
				<div>
					<label for="fertilizerId">fertilizer id</label>
					<div>
						<form:input path="fertilizerId" />
					</div>
				</div>
				<div>
					<label for="fertilizerName">fertilizer Name</label>
					<div>
						<form:input path="fertilizerName" />
					</div>
					<div>
						<label for="state">state</label>
						<div>
							<form:input path="state" />
						</div>
					</div>

				</div>
				<div>
					<label for="cost">cost</label>
					<div>
						<form:input path="cost" />
					</div>
					
					<div>
						<form:button>Add New</form:button>
					</div>
			</form:form>
		</div>
	</div>

</body>
</html>