<%--
  Created by IntelliJ IDEA.
  User: zy
  Date: 2019-02-26
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>主页</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="<%=basePath%>css/global.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/table.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/record.css">
</head>
<body>
<nav style="background: url(<%=basePath%>img/nav.jpg);background-size: 100%; top: 0px;position: absolute;width:100%;height: 100px;overflow: hidden;">
    <div style="position: absolute;left: 100px;top: 30px;height: 45px;width: 45px;">
        <img src="<%=basePath%>img/logo.png" style="height: 100%;width: 100%;">
    </div>
    <p style="text-align: left;font-family: SimHei; font-size: 40px;padding-left: 160px;padding-bottom: 40px;margin-top: 30px;">学校职工信息管理系统</p>

</nav>
<div id="menu" style="background-color: #13599f;color: white;height: 50px;margin-top: 100px;position: relative;">


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
        <a href="" style="background-color: #003d99;color: #fff;padding-top: 10px;">菜单</a>
        <a href="<%=basePath%>/record/toRecord">查看职工信息</a>
        <a href="">修改职工信息</a>
        <a href="">删除职工信息</a>
    </div>
    <div id="table" style="margin-left: 30px;width: 900px; margin-top: 0px;float: left;border: 1px solid black;height: 800px;overflow: scroll;">
        <div id="location" style="border-bottom: 1px solid black">
            <p>当前位置：系统>档案添加</p>
        </div>
        <div id="record">
        <form action="<%=basePath%>record/add" method="post" enctype="multipart/form-data">
            <div >
                <p style="display: inline">姓名</p>
                <input type="text" name="name" placeholder="" >
            </div>
            <div >
                <p style="display: inline">上传个人头像</p>
                <input type="file" name="image" placeholder="" >
            </div>
            <div >
                <p style="display: inline">身份证号</p>
                <input type="text" name="id_number" placeholder="" >
            </div>
            <div  >
                <p style="display: inline">地址</p>
                <input type="text" name="address" placeholder="" >
            </div>

            <div >
                <p style="display: inline">出生日期</p>
                <input type="date" name="birth" placeholder="" >
            </div>

            <div >
                <p style="display: inline">参加工作时间</p>
                <input type="date" name="toWork" placeholder="" >
            </div>
            <div >
                <p style="display: inline">主修科目</p>
                <input type="text" name="major" placeholder="" >
            </div>
            <div>
                <p>教学科目</p>
                <input type="checkbox" name="subject" value="1">大学物理
                <input type="checkbox" name="subject" value="2">JAVA WEB
                <input type="checkbox" name="subject" value="3">编译原理
                <input type="checkbox" name="subject" value="4">计算机组成原理
                <input type="checkbox" name="subject" value="5">高数
                <input type="checkbox" name="subject" value="6">大学英语
                <input type="checkbox" name="subject" value="7">电子通信技术
                <input type="checkbox" name="subject" value="8">文学史
                <input type="checkbox" name="subject" value="9">计算机系统原理
                <input type="checkbox" name="subject" value="10">计算机控制原理
                <input type="checkbox" name="subject" value="11">模拟电路
                <input type="checkbox" name="subject" value="12">数字电路
                <input type="checkbox" name="subject" value="13">基础化学
                <input type="checkbox" name="subject" value="14">马克思
            </div>
            <div >
                <p style="display: block">教育经历</p>
                <textarea type="text" name="educationexp" placeholder="" style="height: 200px;width:400px;overflow: scroll">
                </textarea>
            </div>
            <div class="item">
                <p style="display: inline">婚否</p>
                <select name="married">
                <%--<option value="volvo">男</option>--%>
                <%--<option value="saab">女</option>--%>
                <c:forEach items="${recordDictBean.marriedList}" var="item" varStatus="status">
                    <option value="${status.index+1}"><c:out value="${item}"></c:out></option>
                </c:forEach>
            </select>
            </div>

            <div class="item">
                <p style="display: inline">民族</p>
                <select name="nationality">
                    <%--<option value="volvo">男</option>--%>
                    <%--<option value="saab">女</option>--%>
                    <c:forEach items="${recordDictBean.nationalityList}" var="item" varStatus="status">
                        <option value="${status.index+1}"><c:out value="${item}"></c:out></option>
                    </c:forEach>
                </select>
            </div>
                <div class="item">
                    <p style="display: inline">性别</p>
                    <select name="sex">
                        <%--<option value="volvo">男</option>--%>
                        <%--<option value="saab">女</option>--%>
                            <c:forEach items="${recordDictBean.sexList}" var="item" varStatus="status">
                                <option value="${status.index+1}"><c:out value="${item}"></c:out></option>
                            </c:forEach>
                    </select>
                </div>
            <div class="item">
            <p style="display: inline">国家</p>
                <select name="nation">
                    <c:forEach items="${recordDictBean.nationList}" var="item" varStatus="status">
                        <option value="${status.index+1}"><c:out value="${item}"></c:out></option>
                    </c:forEach>
                </select>
            </div>
            <div class="item">
            <p style="display: inline">政治面貌</p>
                <select name="politics_status">
                    <c:forEach items="${recordDictBean.politicsList}" var="item" varStatus="status">
                        <option value="${status.index+1}"><c:out value="${item}"></c:out></option>
                    </c:forEach>
                </select>
            </div>
            <div class="item">
                <p style="display: inline">职称</p>
                <select name="profession_title">
                    <c:forEach items="${recordDictBean.titleList}" var="item" varStatus="status">
                        <option value="${status.index+1}"><c:out value="${item}"></c:out></option>
                    </c:forEach>
                </select>
            </div>
            <div class="item">
                <p style="display: inline">教育</p>
                <select name="education">
                    <c:forEach items="${recordDictBean.educationList}" var="item" varStatus="status">
                        <option value="${status.index+1}"><c:out value="${item}"></c:out></option>
                    </c:forEach>
                </select>
            </div>
            <div class="item">
                <p style="display: inline">学位</p>
                <select name="degree">
                    <c:forEach items="${recordDictBean.degreeList}" var="item" varStatus="status">
                        <option value="${status.index+1}"><c:out value="${item}"></c:out></option>
                    </c:forEach>
                </select>
            </div>

            <div style="clear: both;margin-top: 20px;">
                <p style="display: inline">受教育院校</p>
                <input type="text" name="education_school" placeholder="" >
            </div>
            <div>
                <p style="display: inline">学位院校</p>
                <input type="text" name="degree_school" placeholder="" >
            </div>
            <div >
                <p style="display: inline">电话</p>
                <input type="text" name="phone" placeholder="" >
            </div>
            <div class="item">
                <p style="display: inline">职位</p>
                <select name="position">
                    <c:forEach items="${recordDictBean.positionList}" var="item" varStatus="status">
                        <option value="${status.index+1}"><c:out value="${item}"></c:out></option>
                    </c:forEach>
                </select>
            </div>
            <div class="item" >
                <p style="display: inline">部门</p>
                <select name="department">
                    <c:forEach items="${recordDictBean.deparmentList}" var="item" varStatus="status">
                        <option value="${status.index+1}"><c:out value="${item}"></c:out></option>
                    </c:forEach>
                </select>
            </div>

            <div class="item">
                <p style="display: inline">是否有编制</p>
                <select name="is_authorized">
                    <c:forEach items="${recordDictBean.isAuthroziedList}" var="item" varStatus="status">
                        <option value="${status.index+1}"><c:out value="${item}"></c:out></option>
                    </c:forEach>
                </select>
            </div>
            <div style="clear: both;">

            <input type="submit" name="" value="提交">
        </div>

        </form>
            <div style="color: #f32b26;height: 30px;width: 100px;">
            <c:out value="${message}"></c:out>
        </div>
        </div>
        </div>

    </div>



<div id="footer" style="background-color:#13599f;text-align:center;position: relative;bottom: 0px;width: 100%">
    版权 © cctv.com</div>
</body>
</html>