<%--
  Created by IntelliJ IDEA.
  User: zy
  Date: 2019-01-27
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="<%=basePath%>js/jquery-3.3.1.min.js">

</head>
<body>
<form action="<%=basePath%>/test/uploadPic"  method="post" enctype="multipart/form-data" accept-charset="UTF-8">
    <input type="file" name="file">
    <input type="text" name="name">
    <input type="submit" value="上传">
</form>
<%--<form action="<%=basePath%>/test/te" enctype="multipart/form-data">--%>

    <%--<input type="text" name ="name">--%>
    <%--<input type="submit" value="上传">--%>
<%--</form>--%>
<c:out value="${message}"></c:out>
</body>
</html>
