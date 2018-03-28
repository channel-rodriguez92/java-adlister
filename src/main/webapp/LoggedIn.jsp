<%--
  Created by IntelliJ IDEA.
  User: Chanel
  Date: 3/28/18
  Time: 9:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${param.error != null}">
    <p>${param.error}</p>
</c:if>

<c:if test="${param.firstName !=null}">
    <h1>Well, Howdy <%=request.getParameter("firstName")%></h1>
    <h2>THe number is ${param.firstName}</h2>
</c:if>

</body>
</html>
