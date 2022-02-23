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
        <h1>${book.title}</h1>
        <div>
                <h5><span class="text-danger">${book.user.userName}</span> read <span class="text-primary">${book.title}</span> by <span class="text-success">${book.author}</span> .</h5>
                <h5>Here are ${book.user.userName} thoughts:</h5>
                <br><hr>
                <p>${book.thought}</p>
                <br><hr>
        </div>




        <a href="/home">back to the shelves</a><br>
        <a href="/logout">Logout</a>
    </div>
</body>
</html>