<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <h1>Witam</h1>

    <table>
        <tbody>
        <c:forEach items="${users}" var="user">

            <tr>
                <h3>${user.firstName}</h3>
                <h3>${user.lastName}</h3>
            </tr>

        </c:forEach>

        </tbody>
    </table>

</body>
</html>
