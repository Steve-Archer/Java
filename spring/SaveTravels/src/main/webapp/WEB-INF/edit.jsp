<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <div class="container w-50 mt-3 p-3 border border-dark bg-light">
        <h1>Edit Expense</h1>
        <form:form action="/expense/edit/${expense.id}" method="post" modelAttribute="expense">
        	<input type="hidden" name="_method" value="put">
            <p>
                <form:label path="item">Expense</form:label>
                <form:errors path="item" class="text-danger" />
                <form:input path="item" type="text" class="form-control" />
            </p>
            <p>
                <form:label path="vendor">Vendor</form:label>
                <form:errors path="vendor" class="text-danger" />
                <form:input path="vendor" type="text" class="form-control" />
            </p>
            <p>
                <form:label path="price">Price</form:label>
                <form:errors path="price" class="text-danger" />
                <form:input path="price" type="number" step="0.01" class="form-control" />
            </p>
            <input type="submit" value="Submit">
        </form:form><br><br>
        <div class="d-flex justify-content-center">
        	<a href="/">Go Back</a>
        </div>
    </div>
</body>
</html>