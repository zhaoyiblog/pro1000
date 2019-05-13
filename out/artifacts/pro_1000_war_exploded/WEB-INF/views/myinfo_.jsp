<%--
  Created by IntelliJ IDEA.
  User: zy
  Date: 2019-02-13
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>

<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>登录</title>

    <link rel="stylesheet" href="<%=basePath%>css/global.css">
    <link rel="stylesheet" href="<%=basePath%>css/login.css">
</head>
<body>
<nav style="background: url(<%=basePath%>img/nav.jpg);background-size: 100%; top: 0px;position: absolute;width:100%;height: 100px;overflow: hidden;">
    <div style="position: absolute;left: 100px;top: 30px;height: 45px;width: 45px;">
        <img src="<%=basePath%>img/logo.png" style="height: 100%;width: 100%;">
    </div>
    <p style="text-align: left;font-family: SimHei; font-size: 40px;padding-left: 160px;padding-bottom: 40px;margin-top: 30px;">学校职工信息管理系统</p>

</nav>
<div id="menu" style="background-color: #13599f;color: white;height: 50px;margin-top: 100px;position: relative;">

    <div style="height: 50px;width: 10px;margin-right: 100px;float: left;margin-top: 15px;margin-left: -80px;">
        <a href="" >
            <!-- <img src="login.png" style="height: 100%;；width:100%;"> -->
            |
        </a>

    </div>
    <div style="height: 50px;width: 80px;margin-right: 100px;float: left;top: 15px;margin-top: 15px;margin-left: 80px;">
        <a href="">
            <!-- <img src="login.png" style="height: 100%;；width:100%;"> -->
            档案管理
        </a>

    </div>
    <div style="height: 50px;width: 10px;margin-right: 100px;float: left;margin-top: 15px;margin-left: -80px;">
        <a href="" >
            <!-- <img src="login.png" style="height: 100%;；width:100%;"> -->
            |
        </a>

    </div>
    <div style="height: 50px;width: 80px;margin-right: 100px;float: left;top: 15px;margin-top: 15px;margin-left: -80px;">
        <a href="">
            <!-- <img src="login.png" style="height: 100%;；width:100%;"> -->
            绩效考评
        </a>

    </div>
    <div style="height: 50px;width: 10px;margin-right: 100px;float: left;margin-top: 15px;margin-left: -80px;">
        <a href="" >
            <!-- <img src="login.png" style="height: 100%;；width:100%;"> -->
            |
        </a>

    </div>
    <div style="height: 50px;width: 80px;margin-right: 100px;float: left;top: 15px;margin-top: 15px;margin-left: -80px;">
        <a href="">
            <!-- <img src="login.png" style="height: 100%;；width:100%;"> -->
            调动管理
        </a>

    </div>
    <div style="height: 50px;width: 10px;margin-right: 100px;float: left;margin-top: 15px;margin-left: -80px;">
        <a href="" >
            <!-- <img src="login.png" style="height: 100%;；width:100%;"> -->
            |
        </a>

    </div>
    <div style="height: 50px;width: 80px;margin-right: 100px;float: left;top: 15px;margin-top: 15px;margin-left: -80px;">
        <a href="">
            <!-- <img src="login.png" style="height: 100%;；width:100%;"> -->
            工资管理
        </a>

    </div>
    <div style="height: 50px;width: 10px;margin-right: 100px;float: left;margin-top: 15px;margin-left: -80px;">
        <a href="" >
            <!-- <img src="login.png" style="height: 100%;；width:100%;"> -->
            |
        </a>

    </div>
    <div style="height: 50px;width: 40px;margin-right: 100px;float: left;top: 15px;margin-top: 15px;margin-left: -80px;">
        <a href="">
            <!-- <img src="login.png" style="height: 100%;；width:100%;"> -->
            我的
        </a>

    </div>

</div>
<div class="body" style="padding-top: 0px;position: relative;margin-top: 30px;">
    <div id="link" style="float: left;height: 100%;margin-left: 0px;">
        <a href="#" style="background-color: #003d99;color: #fff;padding-top: 10px;">菜单</a>
        <a href="<%=basePath%>user/toR">注册</a>
        <%--<a href="">修改职工信息</a>--%>
        <%--<a href="">链接</a>--%>
    </div>
    <div id="table" style="margin-left: 30px;width: 900px; margin-top: 0px;float: left;border: 1px solid black;height: 800px;overflow: scroll;">
        <div id="location" style="border-bottom: 1px solid black">
            <p>当前位置：系统>我的</p>
        </div>

        <div class="loginBox">
            <form action="<%=basePath%>user/updateUser">
                <div >
                    <p style="display: inline">姓名</p>
                    <input type="text" name="name" placeholder="••••••" value="${userBean.name}">
                </div>


                <div >
                    <p style="display: inline;">密码</p>
                    <input type="password" name="password" placeholder="••••••"  >
                </div>
                <div >
                    <p style="display: inline;">确认密码</p>
                    <input type="password" name="confrim_password" placeholder="••••••" >
                </div>
                <input type="submit" name="" value="更改">
                <div style="color: #f32b26;height: 30px;width: 100px;">
                    <c:out value="${message}"></c:out>
                </div>
            </form>
        </div>
    </div>



</div>
</body>
</html>


