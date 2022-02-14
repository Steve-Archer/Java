<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<br>
	<div class="container w-50 bg-primary border border-dark rounded">
		<br>
		<div class="d-flex justify-content-center">
			<h1>Here's your Omikuji!</h1>
		</div>
		<hr><br>
		<h2>In <%=session.getAttribute("number")%> years, you will live in <%=session.getAttribute("city")%> with <%=session.getAttribute("person")%> as your rooomate, <%=session.getAttribute("hobby")%> for a living. The next time you see a <%=session.getAttribute("thing")%>, you will have good luck. Also, <%=session.getAttribute("nice")%></h2>
		<br>
	</div>
	<div class="d-flex justify-content-center">
		<a href="/omikuji">Go Back</a>
	</div>
</body>
</html>