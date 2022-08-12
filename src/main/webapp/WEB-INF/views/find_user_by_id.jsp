<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>find User Details</title>
</head>
<body>
<div id="root">
        <div id="form">
            <form:form action="getuser" method="get" modelAttribute="finduserbyid">
                <div>
                    <label for="userId">User id</label>
                    <div>
                        <form:input path="userId" readonly="true" />
                    </div>
                </div>
                <div>
                    <label for="userName">User Name</label>
                    <div>
                        <form:input path="userName" readonly="true" />
                    </div>
                <div>
                    <label for="password">Password</label>
                    <div>
                        <form:input path="password" readonly="true" />
                    </div>
                </div>
                
                </div>
                <div>
                    <label for="email">Email</label>
                    <div>
                        <form:input path="email" readonly="true" />
                    </div>
                    <div>
                    <label for="phoneNumber">Phone Number</label>
                    <div>
                        <form:input path="phoneNumber" readonly="true" />
                    </div>
                    <div>
                    <label for="address">Address</label>
                    <div>
                        <form:input path="address"  readonly="true"/>
                    </div>
                </div>
                
                </div>
                <div>
                    <form:button>FindById</form:button>
                </div>
            </form:form>
        </div>
    </div>
</body>
</html>