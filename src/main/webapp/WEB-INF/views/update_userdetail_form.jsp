<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User Details</title>
</head>
<body>
<div id="root">
        <div id="form">
            <form:form action="update" method="post" modelAttribute="updateuser">
                <div>
                    <label for="user_id">User id</label>
                    <div>
                        <form:input path="user_id" />
                    </div>
                </div>
                <div>
                    <label for="password">Password</label>
                    <div>
                        <form:input path="password" />
                    </div>
                </div>
                <div>
                    <label for="user_name">User Name</label>
                    <div>
                        <form:input path="user_name" />
                    </div>
                </div>
                <div>
                    <label for="email">Email</label>
                    <div>
                        <form:input path="email" />
                    </div>
                    <div>
                    <label for="phone_number">Phone Number</label>
                    <div>
                        <form:input path="phone_number" />
                    </div>
                    <div>
                    <label for="address">Address</label>
                    <div>
                        <form:input path="address" />
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