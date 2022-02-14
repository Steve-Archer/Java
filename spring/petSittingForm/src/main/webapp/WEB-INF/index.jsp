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
    <div class="container w-50">
        <hr>
        <h1>Request For A Pet Sitter</h1>
	<form action="/process_form" method="post">
        <div class="form-group">
            <label>Name:</label>
            <input type="text" name="name" id="" class="form-control">
        </div>
        <div class="form-group">
            <label>Age:</label>
            <input type="text" name="age" id="" class="form-control">
        </div>
        <div class="form-group">
            <label>Owner Name:</label>
            <input type="text" name="owner" id="" class="form-control">
        </div>
        <div class="form-group">
            <label>Activity:</label>
            <input type="text" name="activity" id="" class="form-control">
        </div>
        <div class="form-group">
            <label>Animals to stay away from:</label>
            <input type="text" name="keepaway" id="" class="form-control">
        </div>
        <div class="form-group">
            <label>Back Story:</label>
            <input type="text" name="backstory" id="" class="form-control">
        </div><br>
        <input type="submit" value="submit" class="btn btn-primary">
    </form>
    <hr>
    </div>
</body>
</html>