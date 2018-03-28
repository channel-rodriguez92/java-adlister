<%--
  Created by IntelliJ IDEA.
  User: Chanel
  Date: 3/28/18
  Time: 11:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hurray!! You guessed the correct number: ${param.magicNum} in only ${param.count} tries!</h1>

<form action="/guess?reset=1" method="get">
    <input type="submit" value="try again">
</form>

</body>
</html>
