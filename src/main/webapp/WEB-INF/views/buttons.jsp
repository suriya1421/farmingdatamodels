<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>buttons</title>
<style>
body {
	text-align: center;
	background-image:
		url("");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
	font-weight: bold;
}

.button {
	top: 100px;
	font-size: 40px;
	width: 100%;
	left: 60px;
	border-radius: 20px;
	margin: 30px;
	padding: 20px;
}

.container {
	max-width: 700px;
	width: 100%;
	height: 50vh;
	display: flex;
	align-items: center;
	justify-content: center;
	position: absolute;
	margin: auto;
	top: 100px;
	left: 270px;
}
</style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="get" modelAttribute="cropDetails">
				<div>
					<label for="cropId">crop id</label>
					<div>
						<form:input path="cropId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="cropName">crop Name</label>
					<div>
						<form:input path="cropName" readonly="true" />
					</div>
					<div>
						<label for="description">description</label>
						<div>
							<form:input path="description" readonly="true" />
						</div>
					</div>

				</div>
				<div>
					<label for="duration">duration</label>
					<div>
						<form:input path="duration"  readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>
			 <a href="/cropfertilizer/getCropFertilizer?cropid=${cropId}">
			<button class="button">Fertilizer</button>
		</a> <br /> <a
			href="/cropdisease/getCropDisease?cropid=${cropId}">
			<button class="button">Disease</button>
		</a> <br />
	</div>
</body>
</html>