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

    <a href="/create">Dodaj</a>

    <table>
        <tbody>
        <c:forEach items="${users}" var="user">

            <tr>
                ${user.firstName}
                ${user.lastName}
                <a href="update-${user.id_user}">Update</a>
                <a href="delete/${user.id_user}">Usun</a>
            </tr>

        </c:forEach>

        </tbody>
    </table>

</body>
</html>
