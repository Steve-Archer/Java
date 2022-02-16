<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<h1>All the menu items. Choose from our fantastic collection.</h1>
    <table class="table">
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Type</th>
            <th scope="col">Price</th>
        </tr>
        <c:forEach items='${ allMenuItems }' var='itemObj'>
        <tr>
            <td>${itemObj.name}</td>
            <td>${itemObj.dishType}</td>
            <td>${itemObj.price}</td>
        </tr>

        </c:forEach>
    </table>
    
</body>
</html>