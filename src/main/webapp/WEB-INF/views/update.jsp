<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="Form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Damian Stępniak
  Date: 15.03.2017
  Time: 00:50
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:url var="updateUrl" value="/update"/>
    <form:form modelAttribute="user" action="${updateUrl}" method="post">
        <Form:input path="id_user" style="display: none" type="number" id="id_user" name="id_user" value="${user.id_user}"/>
        <Form:input path="firstName" type="text" id="firstName" name="firstName" value="${user.firstName}"/>
        <Form:input path="lastName" type="text" id="lastName" name="lastName" value="${user.lastName}"/>
        <button type="submit">Zapisz</button>
    </form:form>
</body>
</html>
