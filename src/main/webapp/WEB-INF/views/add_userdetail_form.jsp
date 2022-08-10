<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User Details</title>
<style>
.text-danger {
	color: #e80c4d;
	font-size: 0.9em;
}
body{
text-align:center;
background-image:url("https://media.istockphoto.com/photos/forest-wooden-table-background-summer-sunny-meadow-with-green-grass-picture-id1353553203?b=1&k=20&m=1353553203&s=170667a&w=0&h=QTyTGI9tWQluIlkmwW0s7Q4z7R_IT8egpzzHjW3cSas=");
background-repeat: no-repeat;
background-attachment:fixed;
background-size:100% 100%;
font-weight:bold;
}
input[type=text] {
  width: 25%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
}
</style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="adduserdetail">
				<div>
					<div>
					<label for="userName">User Name</label>
					<div>
						<form:input path="userName" placeholder="Enter Name" />
					</div>
					</div>
					<form:errors path="userName" cssClass="text-danger" />
					<div>
						<label for="password">Password</label>
						<div>
							<form:input path="password" required="true" placeholder="Enter Password" />
						</div>
					</div>

				</div>
				<label for="email">Email</label>
				<div>
					<form:input path="email" placeholder="Enter Email"/>
				</div>
				<form:errors path="email" cssClass="text-danger" />
				<div>
					<label for="phoneNumber">Phone Number</label>
					<div>
						<form:input path="phoneNumber" required="true" placeholder="Enter Phonenumber" />
					</div>
					<div>
						<label for="address">Address</label>
						<div>
							<form:input path="address" required="true" placeholder="Enter Address" />
						</div>
					</div>

				</div>
				<div>
					<form:button>Add New</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>