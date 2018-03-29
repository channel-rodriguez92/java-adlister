<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Chanel
  Date: 3/28/18
  Time: 3:23 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp" />
<h3>
    Here are the current ads:
    <c:forEach items="${ads}" var="ad">
        <div>
            <h1>Title: ${ad.title}</h1>
            <h3>Description: </h3>
            <p>${ad.description}</p>
        </div>
    </c:forEach>
</h3>

</body>
</html>
