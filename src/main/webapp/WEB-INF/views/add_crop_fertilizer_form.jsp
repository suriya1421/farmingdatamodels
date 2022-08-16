<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Crop fertilizer</title>
<style>
<%@include file="/WEB-INF/views/css/adminadd.css"%>
</style>
</head>
<body>
			<form:form action="add" method="post" modelAttribute="addcropfertilizer">
			<div class="form">
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

					<form:button>Add New</form:button>
				</div></div>
			</form:form>
		</div>
	</div>
</body>
</html>