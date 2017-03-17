<%@ taglib prefix="Form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Damian Stępniak
  Date: 15.03.2017
  Time: 00:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form method="post" action="/create">

        <spring:bind path="user.firstName">
            <input type="text" name="${status.expression}" value="${status.value}"> <br/>
        </spring:bind>

        <spring:bind path="user.lastName">
            <input type="text" name="${status.expression}" value="${status.value}">
        </spring:bind>

        <spring:bind path="user_login.email">
            <input type="email" name="${status.expression}" value="${status.value}">
        </spring:bind>
        
        <spring:bind path="user_login.password">
            <input type="password" name="${status.expression}" value="${status.value}">
        </spring:bind>

        <button type="submit">Zapisz</button>

    </form>

</body>
</html>
