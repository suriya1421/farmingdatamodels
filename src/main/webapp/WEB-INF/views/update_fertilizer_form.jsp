<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update fertilizer</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="update" method="post" modelAttribute="updatefertilizer">
				<div>
					<label for="fer_id">fertilizer id</label>
					<div>
						<form:input path="fer_id" />
					</div>
				</div>
				<div>
					<label for="fer_name">fertilizer Name</label>
					<div>
						<form:input path="fer_name" />
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
						<label for="stock_in_hand">stock in hand</label>
						<div>
							<form:input path="stock_in_hand" />
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