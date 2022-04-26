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
    <h3>Details for ${ideaDetail.name}</h3>
    <p>Funding Requested: $ ${ideaDetail.funding}</p>
    <p>Category: ${ideaDetail.category}</p>
    <p>Description: ${ideaDetail.description}</p>
    <p>Creator: ${ideaDetail.uploader.userName}</p>
    <c:if test='${loggedInUserID == ideaDetail.uploader.id}'>
        <a href="/idea/${ideaDetail.id}/edit">Edit</a> | 
        <a href="/idea/${ideaDetail.id}/delete">Delete</a>
    </c:if>
    <br>
    <a href="/logout">Logout</a>
</body>
</html>