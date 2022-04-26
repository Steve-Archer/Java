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
    <h1>Welcome ${userLoggedIn.userName}</h1>
    <p><a href="/home">Home</a></p>
    <form:form action="/idea/create" method="post" modelAttribute="idea">
        <form:input type="hidden" path="uploader" value="${idOfCreator}"/>
        <div>
            <form:label path="name">Idea Name</form:label>
            <form:input path="name" type="text" class="form-control"/>
            <form:errors path="name" class="text-danger"/>
        </div>
        <div>
            <form:label path="funding">Funding Amount</form:label>
            <form:input path="funding" type="number" step=".01" class="form-control"/>
            <form:errors path="funding" class="text-danger"/>
        </div>
        <div>
            <form:label path="category">Category</form:label>
            <form:input path="category" type="text" class="form-control"/>
            <form:errors path="category" class="text-danger"/>
        </div>
        <div>
            <form:label path="description">description</form:label>
            <form:input path="description" type="text" class="form-control"/>
            <form:errors path="description" class="text-danger"/>
        </div>
        <input type="submit" value="Submit" class="btn btn-success mt-2">
    </form:form>
    <a href="/logout">Logout</a>
</body>
</html>