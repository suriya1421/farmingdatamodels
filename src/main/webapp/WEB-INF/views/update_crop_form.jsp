<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>update Crop Details</title>
<style><%@include file="/WEB-INF/views/css/updateform.css"%></style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="update" method="post" modelAttribute="updatecrop">
				<div>
					<label for="cropId">crop id</label>
					<div>
						<form:input path="cropId" pattern="^[0-9]+$" placeholder="crop id" required="true" title="please enter number only" />
					</div>
				</div>
				<div>
					<label for="cropName">crop Name</label>
					<div>
						<form:input path="cropName"  title="Please Enter Charactor Only"
								pattern="^[a-z A-Z]+$" placeholder="crop name " required="true"  />
					</div>
					<div>
						<label for="description">description</label>
						<div>
							<form:input path="description" pattern="^[a-z A-Z 0-9]+$" placeholder="description" required="true" />
						</div>
					</div>

				</div>
				<div>
					<label for="duration">duration</label>
					<div>
						<form:input path="duration" pattern="^[0-9]+$" placeholder="crop duration" required="true" title="please enter CropDuration" />
					</div>

					<form:button>update</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>