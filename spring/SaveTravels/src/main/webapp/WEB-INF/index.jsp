<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<div class="container w-50 border border-dark p-3 mt-3 bg-light">
		<h1>Save Travels</h1>
	    <table class="table">
	        <thead>
	            <tr>
	                <th scope="col">ID</th>
	                <th scope="col">Expense</th>
	                <th scope="col">Vendor</th>
	                <th scope="col">Price</th>
	                <th scope="col">Actions</th>
	            </tr>
	        </thead>
	        <tbody>
	            <c:forEach items='${allExpenses}' var='expense'>
	                <tr>
	                    <th scope="row">${expense.id}</th>
	                    <td>${expense.item}</td>
	                    <td>${expense.vendor}</td>
	                    <td>${expense.price}</td>
	                    <td><a href="/edit/${expense.id}">edit</a></td>
	                </tr>
	            </c:forEach>
	        </tbody>
	    </table>
	    <h2>Add an Expense</h2>
	    <form:form action="/expense/create" method="post" modelAttribute="expense">
	        <p>
	            <form:label path="item">Expense</form:label>
	            <form:errors path="item" class="text-danger"/>
	            <form:input path="item" type="text" class="form-control"/>
	        </p>
	        <p>
	            <form:label path="vendor">Vendor</form:label>
	            <form:errors path="vendor" class="text-danger"/>
	            <form:input path="vendor" type="text" class="form-control"/>
	        </p>
	        <p>
	            <form:label path="price">Price</form:label>
	            <form:errors path="price" class="text-danger"/>
	            <form:input path="price" type="number" step="0.01" class="form-control"/>
	        </p>
	        <input type="submit" value="Submit">
	    </form:form>
	</div>
</body>
</html>