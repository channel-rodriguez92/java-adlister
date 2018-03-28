<%--
  Created by IntelliJ IDEA.
  User: Chanel
  Date: 3/28/18
  Time: 11:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:if test="${param.incorrect==true}">
    <h3>That was not the number I was thinking of. Try again</h3>
</c:if>
<form action="/guess" method="post">
    <h3>
        Guess a number from 1 to 10
    </h3>
    <input type="text" name="userGuess" autofocus>
</form>
<h2>Total guesses ${count}</h2>
</body>
</html>
