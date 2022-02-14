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
	<div class="container w-50">
		<h1>Send an Omikuji!</h1>
		
		<form action="/process" method="post">
			<div class="form-group">
				<label>Pick any number from 5 to 25</label>
				<input type="number" name="number" class="form-control">
			</div>	
			<div class="form-group">
				<label>Enter the name of any city</label>
				<input type="text" name="city" class="form-control">
			</div>
			<div class="form-group">
				<label>Enter the name of any real person</label>
				<input type="text" name="person" class="form-control">
			</div>
			<div class="form-group">
				<label>Enter professional endeavor or hobby</label>
				<input type="text" name="hobby" class="form-control">
			</div>
			<div class="form-group">
				<label>Enter any type of living thing</label>
				<input type="text" name="thing" class="form-control">
			</div>
			<div class="form-group">
				<label>Say something nice to someone</label>
				<input type="text" name="nice" class="form-control">
			</div>
			<input type="submit" value="send" class="btn btn-primary">
		</form>
	</div>
	
</body>
</html>