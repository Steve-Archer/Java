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
    <div class="container w-50 mt-3 p-3 border border-dark bg-light">
        <h1 class="text-primary">Expense Details</h1>
        <div class="container w-50 mt-5 mb-5">
        	<h5>Expense: ${expense.item}</h5>
        	<h5>Vendor: ${expense.vendor}</h5>
        	<h5>Price: ${expense.price}</h5>
        </div>
        	
        <div class="d-flex justify-content-center">
            <a href="/">Go Back</a>
        </div>
    </div>
</body>
</html>