<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
    <div class="container w-50">
        <h1>Dojos And Ninjas</h1>
        <c:forEach items='${allDojos}' var='dojo'>
            <h5><a href="/dojo/${dojo.id}">${dojo.name}</a></h5>
        </c:forEach>
        <div class="d-flex justify-content-center">
            <a href="/dojo/new">Add a Dojo</a><span style="color: white;">-</span>
            <a href="/ninja/new">Add a Ninja</a>
        </div>
    </div>
</body>
</html>