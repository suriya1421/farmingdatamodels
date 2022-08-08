<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin login form</title>
</head>
<body>
<div id="root">
        <div id="form" align="center">
            <form:form action="checkadminlogin" method="post"
                modelAttribute="adminlogin">
                <div>
                    <h1 align="center">Admin Login</h1>
                </div>
                <div>
                    <label for="adminId">Admin Id</label>
                    <div>
                        <form:input path="adminId" />
                    </div>
                </div>
                <div>
                    <label for="email">Admin Email</label>
                    <div>
                        <form:input path="email" />
                    </div>
                </div>
                <div>
                    <label for="password">Password</label>
                    <div>
                        <form:input path="password" type = "password" />
                    </div>
                </div>
                <div>
                <form:button value ="SignIn">SignIn</form:button>
                <form:button type = "reset" value = "Clear">Reset</form:button>
                </div>
            </form:form>
        </div>
    </div>
</body>
</html>