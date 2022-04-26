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
    <p><a href="/idea/new">Create a new startup idea</a></p>
    <table class="table table-dark">
        <thead>
            <tr>
                <th scope="col">ID#</th>
                <th scope="col">Idea Name</th>
                <th scope="col">Funding Amount</th>
                <th scope="col">Category</th>
                <th scope="col">Creator</th>
            </tr>
        </thead>
        <tbody>
            </tbody>
            <c:forEach items='${ allIdeas }' var='ideaObject'>
                <tr>
                    <th scope="row">${ideaObject.id}</th>
                    <td><a href="/idea/${ideaObject.id}/detail">${ideaObject.name}</a></td>
                    <td>${ideaObject.funding}</td>
                    <td>${ideaObject.category}</td>
                    <td>${ideaObject.uploader.userName}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/logout">Logout</a>
</body>
</html>