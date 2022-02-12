<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3><c:out value = "${ movie}"></c:out></h3>
	<p>Released on: <c:out value = "${releaseDate}"></c:out></p>
	<img height = "200px" src="<c:out value="${imageURL}"/>"/>
	
	<c:forEach var="actor" items="${cast}">
		<p>${actor.firstName} ${actor.lastName} ${actor.age}</p>
	</c:forEach>
	
	
</body>
</html>