<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Admin List</title>
</head>
<body>
	<div id="table root">
		<table>
			<caption></caption>
			<thead>
				<tr>
					<th>Admin Id</th>
					<th>Email</th>
					<th>Password</th>
					<th>update</th>
					<th>delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="admin" items="${alladmin}">
					<tr>
						<td>${admin.adminId}</td>
						<td>${admin.email}</td>
						<td>${admin.password}</td>
						<td><a
							href="/admin/updateadminloginform?adminid=${admin.adminId}">update</a></td>
						<td><a
							href="/admin/deleteadminlogin?adminid=${admin.adminId}">delete</a></td>
				</c:forEach>
			</tbody>
		</table>
		<a href="/admin/addadminloginform"><button class="button">add</button></a>
	</div>
</body>
</html>