<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Error</title>
<style>
h2 {
	text-align: "center";
}

.div {
	text-align: "center";
}
}
</style>
</head>
<body>
    <div>
        <h2>Please Enter Correct Admin Login Details</h2>
    </div>
    <div>
        <h2>Press The Button To Go Admin Login Page
            Again</h2>
    </div>
    <div class="div">
        <a href="/admin/loginform"><button type = "button" onclick = "">Redirect To Admin Login Page</button></a>
    </div>
</body>
</html>