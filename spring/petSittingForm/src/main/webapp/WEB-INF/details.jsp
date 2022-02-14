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
<h1>These are the details for <%=session.getAttribute("name")%></h1>
<p>Age: <%=session.getAttribute("age") %></p>
<p>Owner Name: <%=session.getAttribute("owner") %></p>
<p>Activity Level: <%=session.getAttribute("activity") %></p>
<p>Keep away from: <%=session.getAttribute("keepaway") %></p>
<p>Back Story: <%=session.getAttribute("backstory") %></p>
</body>
</html>