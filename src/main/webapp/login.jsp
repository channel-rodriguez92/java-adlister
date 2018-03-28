<%--
  Created by IntelliJ IDEA.
  User: Chanel
  Date: 3/27/18
  Time: 9:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="partials/head.jsp" %>
<body>

<%
boolean isLoggedIn = false;
String name = request.getParameter("username");
if(name == null){
    name = "JoeSchmo";
}
request.setAttribute("username",name);
String password = request.getParameter("password");
if(name.equals("username") && password.equals("password")){
    response.sendRedirect("/profile.jsp");
}
%>

<%@ include file="partials/navbar.jsp" %>



<h2>Welcome to ${username}'s Website!</h2>

<form method="post" action="/login.jsp">
    <h3>Enter your information: </h3>
    <ul class="list-group">
        <li>Username<input type="text" name="username" autofocus></li>
        <li>Password<input type="password" name="password"></li>
        <br>
        <li><input type="submit" class="btn btn-primary" value="Submit"></li>
    </ul>
</form>



<%@ include file="partials/scripts.jsp" %>
</body>
</html>
