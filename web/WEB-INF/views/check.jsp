<%--
  Created by IntelliJ IDEA.
  User: zy
  Date: 2019-04-06
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
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
<div class="row"><nav class="navbar navbar-inverse navbar-fixed-top"  role="navigation">
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
                <li style="margin-top: 14px;padding-left: 18px;color: #fff;" class="">欢迎您<c:out value="${user.name}"></c:out></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">登录管理 <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">登录</a></li>
                        <li><a href="#">注销</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div>
</nav>
</div>
<!-- 主体 -->
<div class="container-fluid">
    <div class="row">
        <div class="col-md-2 sidebar ">

            <ul class="nav nav-list" style="top: 0px;">
                <li class="">
                    <a href="index.html">
                        <i class="menu-icon fa fa-tachometer"></i>
                        <span class="menu-text">概览</span>
                    </a>
                    <b class="arrow"></b>
                </li>
                <li class="nav-list-item">
                    <div class="dropdown Mitem">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="menu-icon fa fa-desktop"></i>
                            <span class="menu-text">
										档案管理
									</span>
                            <b class="arrow fa fa-angle-down "></b>
                        </a>
                        <b class="arrow"></b>
                        <ul class="submenu nav-show dropdown-menu" >

                            <li class="">
                                <a href="<%=basePath%>/record/toRecordAdd">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    添加档案
                                </a>
                                <b class="arrow"></b>
                            </li>
                            <li class="">
                                <a href="<%=basePath%>/record/toRecordUpdate">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    修改档案
                                </a>
                                <b class="arrow"></b>
                            </li>
                            <li class="">
                                <a href="<%=basePath%>/record/toRecordSel">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    查看档案
                                </a>
                                <b class="arrow"></b>
                            </li>
                            <li class="">
                                <a href="<%=basePath%>/record/toRecordDel">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    删除档案
                                </a>
                                <b class="arrow"></b>
                            </li>


                        </ul>
                    </div>
                </li>
                <li class="nav-list-item">
                    <div class="dropdown Mitem">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="menu-icon fa fa-desktop"></i>
                            <span class="menu-text">
										考勤管理
									</span>
                            <b class="arrow fa fa-angle-down "></b>
                        </a>
                        <b class="arrow"></b>
                        <ul class="submenu nav-show dropdown-menu" >

                            <li class="">
                                <a href="<%=basePath%>/checking/toCheck">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    查看考勤
                                </a>
                                <b class="arrow"></b>
                            </li>

                            <li class="">
                                <a href="<%=basePath%>/checking/toCheckAdd">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    添加考勤
                                </a>
                                <b class="arrow"></b>
                            </li>



                        </ul>
                    </div>
                </li>
                <li class="nav-list-item">
                    <div class="dropdown Mitem">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="menu-icon fa fa-desktop"></i>
                            <span class="menu-text">
										绩效考评
									</span>
                            <b class="arrow fa fa-angle-down "></b>
                        </a>
                        <b class="arrow"></b>
                        <ul class="submenu nav-show dropdown-menu" >

                            <li class="">
                                <a href="<%=basePath%>/performance/toPerformanceAdd">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    添加绩效
                                </a>
                                <b class="arrow"></b>
                            </li>
                            <li class="">
                                <a href="<%=basePath%>/performance/toPerformance">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    查看绩效
                                </a>
                                <b class="arrow"></b>
                            </li>
                        </ul>
                    </div>
                </li>
                <li class="nav-list-item">
                    <div class="dropdown Mitem">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="menu-icon fa fa-desktop"></i>
                            <span class="menu-text">
										调动管理
									</span>
                            <b class="arrow fa fa-angle-down "></b>
                        </a>
                        <b class="arrow"></b>
                        <ul class="submenu nav-show dropdown-menu" >

                            <li class="">
                                <a href="<%=basePath%>/transfer/toTransferAdd">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    添加调动
                                </a>
                                <b class="arrow"></b>
                            </li>
                            <li class="">
                                <a href="<%=basePath%>/transfer/toTransfer">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    查看调动
                                </a>
                                <b class="arrow"></b>
                            </li>
                        </ul>
                    </div>
                </li>
                <li class="nav-list-item">
                    <div class="dropdown Mitem">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="menu-icon fa fa-desktop"></i>
                            <span class="menu-text">
										合同管理
									</span>
                            <b class="arrow fa fa-angle-down "></b>
                        </a>
                        <b class="arrow"></b>
                        <ul class="submenu nav-show dropdown-menu" >

                            <li class="">
                                <a href="<%=basePath%>/contract/toContractAdd">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    添加合同
                                </a>
                                <b class="arrow"></b>
                            </li>
                            <li class="">
                                <a href="<%=basePath%>/contract/toContract">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    查看合同
                                </a>
                                <b class="arrow"></b>
                            </li>

                        </ul>
                    </div>
                </li>
                <li class="nav-list-item">
                    <div class="dropdown Mitem">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="menu-icon fa fa-list-alt"></i>
                            <span class="menu-text">
										工资管理
									</span>
                            <b class="arrow fa fa-angle-down"></b>
                        </a>
                        <b class="arrow"></b>
                        <ul class="submenu nav-show dropdown-menu" >
                            <li class="">
                                <a href="<%=basePath%>/salary/toSalaryAdd">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    配置工资
                                </a>
                                <b class="arrow"></b>
                            </li>
                            <li class="">
                                <a href="<%=basePath%>/salary/toSalary">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    查看工资
                                </a>
                                <b class="arrow"></b>
                            </li>
                        </ul>
                    </div>
                </li>
                <li class="nav-list-item">
                    <div class="dropdown Mitem">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="menu-icon fa fa-list-alt"></i>
                            <span class="menu-text">
										保险福利管理
									</span>
                            <b class="arrow fa fa-angle-down"></b>
                        </a>
                        <b class="arrow"></b>
                        <ul class="submenu nav-show dropdown-menu" >

                            <li class="">
                                <a href="<%=basePath%>/welfare/toWelfareAdd">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    配置保险福利
                                </a>
                                <b class="arrow"></b>
                            </li>
                            <li class="">
                                <a href="<%=basePath%>/welfare/toWelfare">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    查看保险福利
                                </a>
                                <b class="arrow"></b>
                            </li>
                        </ul>
                    </div>
                </li>
                <li class="nav-list-item">
                    <div class="dropdown Mitem">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="menu-icon fa fa-list-alt"></i>
                            <span class="menu-text">
										信息管理
									</span>
                            <b class="arrow fa fa-angle-down"></b>
                        </a>
                        <b class="arrow"></b>
                        <ul class="submenu nav-show dropdown-menu" >

                            <li class="">
                                <a href="<%=basePath%>/user/toMyinfo">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    更改密码
                                </a>
                                <b class="arrow"></b>
                            </li>
                        </ul>
                    </div>
                </li>



            </ul>
        </div>
        <div class="col-md-10 col-md-offset-2 main" >
            <ul class="breadcrumb" style="margin-top: 60px;">
                <li><a href="#">系统</a></li>
                <li><a href="#">考勤</a></li>
            </ul>
            <form action="" method="POST" class="form-inline" role="form">

                <div class="form-group">
                    <label for="sname">姓名</label>
                    <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名">
                </div>
                <div class="form-group">
                    <label for="sname">月份</label>
                    <input type="text" class="form-control" id="year" name="year" placeholder="5">
                </div>
                <div class="form-group">
                    <label for="sname">月份</label>
                    <input type="text" class="form-control" id="month" name="month" placeholder="2">
                </div>
                <button type="button" class="btn btn-default" id="btn_sel">查找</button>
                <span style="color: #f32b26;height: 30px;width: 100px;">
                        <c:out value="${message}"></c:out>
                    </span>
            </form>
            <table class="table table-hover table-bordered table-responsive dataintable">
                <thead>
                <tr>
                    <th>姓名</th>
                    <th>年份</th>
                    <th>月份</th>
                    <th>出勤次数</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${bean}" varStatus="status" var="item">
                    <tr>
                        <td>${item.name}</td>
                        <td>${item.year}</td>
                        <td>${item.month}</td>
                        <td>${item.on_time}</td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>

        </div>
    </div>
</div>
<%--<div class="jumbotron text-center" style="margin-bottom:0;z-index: 20;width: 100%">--%>
    <%--<footer>--%>
        <%--<p class="pull-right"><a href="#">Back to top</a></p>--%>
        <%--<p>© 2016 Company, Inc. · <a href="#">Privacy</a> · <a href="#">Terms</a></p>--%>

    <%--</footer>--%>
<%--</div>--%>
<script type="text/javascript" src="<%=basePath%>js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/bootstrap.min.js"></script>
<script>
    $(document).ready(function () {

        $("#btn_sel").click(function () {
            var name=$("#name").val();
            var year=$("#year").val();
            var month=$("#month").val();
            $.post("<%=basePath%>/checking/selCheck",
                {
                    "name":name,
                    "year":year,
                    "month":month
                },
                function (data,status) {
                        $("tbody").remove();
                        var s ="<tbody><tr><td>"+data.name+
                            "</td><td>"+data.year+
                            "</td><td>"+data.month+
                            "</td><td>"+data.on_time+
                            "</td></tr></tbody>";
                        $(".dataintable").append(s);



                }
            );
        });
    });
</script>
</body>

</html>
