<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1>Welcome. Please register or login</h1>
        <div class="row">
            <div class="col">
                <form:form action="/register" method="post" modelAttribute="newUser">
                    <div>
                        <form:label path="userName">User Name</form:label>
                        <form:errors path="userName"/>
                        <form:input path="userName" type="text" class="form-control"/>
                    </div>
                    <div>
                        <form:label path="email">Email</form:label>
                        <form:errors path="email"/>
                        <form:input path="email" type="email" class="form-control"/>
                    </div>
                    <div>
                        <form:label path="password">Password</form:label>
                        <form:errors path="password"/>
                        <form:input path="password" type="password" class="form-control"/>
                    </div>
                    <div>
                        <form:label path="confirm">Confirm Password</form:label>
                        <form:errors path="confirm"/>
                        <form:input path="confirm" type="password" class="form-control"/>
                    </div>
                    <input type="submit" value="Submit" class="btn btn-success mt-2"/>
                </form:form>
            </div>
            <div class="col">
                <form:form action="/login" method="post" modelAttribute="newLogin">
                    <div>
                        <form:label path="email">Email</form:label>
                        <form:errors path="email"/>
                        <form:input path="email" type="email" class="form-control"/>
                    </div>
                    <div>
                        <form:label path="password">Password</form:label>
                        <form:errors path="password"/>
                        <form:input path="password" type="password" class="form-control"/>
                    </div>
                    <input type="submit" value="Login" class="btn btn-success mt-2"/>
                </form:form>
            </div>
        </div>
    </div>
</body>
</html>