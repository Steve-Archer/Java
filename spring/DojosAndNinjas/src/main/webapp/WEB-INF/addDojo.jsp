<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
    <div class="container w-50">
        <h1>Add a Dojo</h1>
        <form:form action="/dojo/add" method="post" modelAttribute="dojo">
            <form:label path="name">Name</form:label>
            <form:errors path="name" class="text-danger"/>
            <form:input path="name" type="text" class="form-control"/>
            <input type="submit" value="Add">
        </form:form>
        <div class="d-flex justify-content-center">
            <a href="/">Go Back</a><span style="color: white;">-</span>
            <a href="/ninja/new">Add a Ninja</a>
        </div>
    </div>
</body>
</html>