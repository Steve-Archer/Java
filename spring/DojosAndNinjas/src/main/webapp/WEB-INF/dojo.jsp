<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <h1>${oneDojo.name}</h1>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">First Name</th>
                    <th scope="col">Last Name</th>
                    <th scope="col">Age</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items='${oneDojo.ninjas}' var='ninja'>
                    <tr>
                        <td>${ninja.firstName}</td>
                        <td>${ninja.lastName}</td>
                        <td>${ninja.age}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div class="d-flex justify-content-center">
            <a href="/">Go Back</a><span style="color: white;">-</span>
            <a href="/dojo/new">Add a Dojo</a><span style="color: white;">-</span>
            <a href="/ninja/new">Add a Ninja</a>
        </div>
    </div>
</body>
</html>