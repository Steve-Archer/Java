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
        <h1>Add a book to your shelf</h1>
        <form:form action="/create" method="post" modelAttribute="newBook">
                    <div>
                        <form:label path="title">Title:</form:label>
                        <form:errors path="title" class="text-danger"/>
                        <form:input path="title" type="text" class="form-control"/>
                    </div>
                    <div>
                        <form:label path="author">Author:</form:label>
                        <form:errors path="author" class="text-danger"/>
                        <form:input path="author" type="text" class="form-control"/>
                    </div>
                    <div>
                        <form:label path="thought">Your thoughts?</form:label>
                        <form:errors path="thought" class="text-danger"/>
                        <form:textarea path="thought" class= "form-control"/>
                    </div>
                    <form:input path="user.id" type="hidden" value="${userLoggedIn.id}"/>
                    <input type="submit" value="Submit" class="btn btn-success mt-2"/>
                </form:form>
    </div>
    <a href="/home">back to the shelves</a>
    <a href="/logout">Logout</a>
</body>
</html>