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
        <h3>Welcome ${loggedInUser.userName}</h3>
        <h1>The Book Broker</h1>
        <h3>Available Books to Borrow</h3>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">Title</th>
                    <th scope="col">Author</th>
                    <th scope="col">Owner</th>
                    <th scope="col">Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items='${ allBooks }' var='book'>
                    <c:if test="${!book.getBorrower().getId}">
                        <tr>
                            <td><a href="/books/${book.id}">${book.title}</a></td>
                            <td>${book.author}</td>
                            <td>${book.user.userName}</td>
                            <c:if test="${book.getUser().getId()==loggedInUser.getId()}">
                                <td>
                                    <a href="/books/edit/${book.id}">edit</a><span> || </span>
                                    <a href="/books/delete/${book.id}">delete</a>
                                </td>
                            </c:if>
                            <c:if test="${book.getUser().getId()!=loggedInUser.getId()}">
                                <td>
                                    <form:form action="/borrow/${book.id}" method="post" modelAttribute="updatedBook">
                                        <input type="hidden" name="_method" value="put">
                                        <form:input path="borrower" type="hidden" value="${loggedInUser.id}"/>
                                        <input type="submit" value="borrow" class="btn btn-success mt-2"/>
                                    </form:form>
                                </td>
                            </c:if>

                        </tr>
                    </c:if>
                    <h3>Books I'm borrowing..</h3>
                    <c:if test="${book.getBorrower().getId() == loggedInUser.getId()}">
                            <td><a href="/books/${book.id}">${book.title}</a></td>
                            <td>${book.author}</td>
                            <td>${book.user.userName}</td>
                            <td></td>
                    </c:if>
                    
                </c:forEach>
            </tbody>
        </table>
    </div>
    <a href="/home">back to the shelves</a><br>
    <a href="/new">+ Add a book to the shelf</a><br>
    <a href="/logout">Logout</a>
</body>
</html>