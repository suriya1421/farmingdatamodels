<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
				    <th>User id</th>
					<th>UserName</th>
					<th>Password</th>
					<th>Email</th>
					<th>Phone no</th>
					<th>Address</th>
					
				</tr>
			</thead>
			<tbody><c:forEach var="user" items="${alluser}">
					<tr>
						<td>${user.userId }</td>
						<td>${user.userName  }</td>
						<td>${user.password}</td>
						<td>${user.email}</td>
						<td>${user.phoneNumber}</td>
						<td>${user.address}</td>
					</tr>
				
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>