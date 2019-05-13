<%--
  Created by IntelliJ IDEA.
  User: zy
  Date: 2019-04-06
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>主页</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/global.css">
    <link rel="stylesheet" href="<%=basePath%>font-awesome/css/font-awesome.min.css">
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top"  role="navigation">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">基于BootStrap的人事管理系统</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <!-- <ul class="nav navbar-nav">
                                                <li class="active"><a href="#">Link</a></li>
                                                <li><a href="#">Link</a></li>
            </ul> -->

            <ul class="nav navbar-nav navbar-right">
                <li style="margin-top: 14px;padding-left: 18px;color: #fff;" class="">欢迎您</li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">登录管理 <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="<%=basePath%>/user/toL">登录</a></li>
                        <li><a href="<%=basePath%>/user/logout">注销</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div>
</nav>
<!--  主体 -->
<div class="container-fluid" style="margin-top:150px;">
    <div class="col-md-4 col-md-offset-4">
        <form action="<%=basePath%>user/register" method="POST" role="form">
            <legend>请注册</legend>

            <div class="form-group">
                <label for="name">姓名</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名">
            </div>
            <div class="form-group">
                <label for="j_number">工号</label>
                <input type="text" class="form-control" id="j_number" name="j_number" placeholder="请输入六位工号">
            </div>

            <div class="form-group">
                <label for="password">密码</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码">
            </div>
            <a href="<%=basePath%>user/toL">已注册，去登录</a>
            <div style="color: #f32b26;height: 30px;width: 200px;">
                <c:out value="${message}"></c:out>
            </div>

            <button type="submit" class="btn btn-primary">提交</button>
        </form>

    </div>

</div>
<div class="jumbotron text-center" style="margin-bottom:0;z-index: 20;position:absolute;width: 100%;bottom: 0">
    <footer>
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>© 2018 Company, Inc. · <a href="#">Privacy</a> · <a href="#">Terms</a></p>

    </footer>
</div>

<script type="text/javascript" src="<%=basePath%>js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/global.js"></script>
</body>
</html>
