<%--
  Created by IntelliJ IDEA.
  User: zy
  Date: 2019-01-25
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>欢迎来到</h1>
    <a href="<c:url value="/spittles" />" >Spittles</a> |
    <a href="<c:url value="/spitter/register"/>" >Regiseter</a>

    <c:forEach items="${list}" var="var">
        <c:out value="${var}"/>

    </c:forEach>
    <c:out value="${message}" />
</body>
</html>
