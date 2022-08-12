<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find Admin Login By Id</title>
</head>
<body>
    <div id="root">
        <div id="form">
            <form:form action="updatenewadminlogin" method="post"
                modelAttribute="updateadminlogin">
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
                        <form:input path="password" />
                    </div>
                </div>
                <div>
                <form:button>add admin login</form:button>
                </div>
            </form:form>
        </div>
    </div>
</body>
</html>\