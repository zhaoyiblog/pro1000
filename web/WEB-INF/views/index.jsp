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
                        <li><a href="<%=basePath%>/user/toL">登录</a></li>
                        <li><a href="<%=basePath%>/user/toR">注册</a></li>
                        <li><a href="<%=basePath%>/user/logout">注销</a></li>
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
                <li><a href="#">主页</a></li>
            </ul>
            <div class="row" style="margin-top: -10px;">
                <div class="col-md-12 col-sm-12 col-lg-12  slider" style="height: 300px">
                    <div id="carousel-id" class="carousel slide" data-ride="carousel"  style="width:100%;height: 100%;">
                        <ol class="carousel-indicators">
                            <li data-target="#carousel-id" data-slide-to="0" class=""></li>
                            <li data-target="#carousel-id" data-slide-to="1" class=""></li>
                            <li data-target="#carousel-id" data-slide-to="2" class="active"></li>
                        </ol>
                        <div class="carousel-inner" style="width: 100%;height: 100%;">
                            <div class="item" style="width: 100%">
                                <img data-src="holder.js/900x500/auto/#777:#7a7a7a/text:First slide" alt="First slide" src="<%=basePath%>img/2.jpg">
                                <div class="container">
                                    <div class="carousel-caption">
                                        <h1>学校风采</h1>
                                        <!-- <p>Note: If you're viewing this page via a <code>file://</code> URL, the "next" and "previous" Glyphicon buttons on the left and right might not load/display properly due to web browser security rules.</p>
                                        <p><a class="btn btn-lg btn-primary" href="#" role="button">Sign up today</a></p> -->
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <img data-src="holder.js/900x500/auto/#666:#6a6a6a/text:Second slide" alt="Second slide" src="<%=basePath%>img/3.jpg">
                                <div class="container">
                                    <div class="carousel-caption">
                                        <h1>学校风采</h1>
                                        <!-- <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                                        <p><a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a></p> -->
                                    </div>
                                </div>
                            </div>
                            <div class="item active " style="width: 100%">
                                <img data-src="holder.js/900x500/auto/#555:#5a5a5a/text:Third slide" alt="Third slide" src="<%=basePath%>img/4.jpg">
                                <div class="container">
                                    <div class="carousel-caption">
                                        <h1>学校风采</h1>
                                        <!-- <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                                        <p><a class="btn btn-lg btn-primary" href="#" role="button">Browse gallery</a></p> -->
                                    </div>
                                </div>
                            </div>
                        </div>
                        <%--<a class="left carousel-control" href="#carousel-id" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>--%>
                        <%--<a class="right carousel-control" href="#carousel-id" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>--%>
                    </div>
                </div>

            </div>
            <div class="panel panel-primary" style="margin-top: 20px;">
                <!-- Default panel contents -->
                <div class="panel-heading">师资力量</div>
                <div class="panel-body">
                    <p>我校汇聚了一批治学严谨、学术造诣很深的海内外专家学者。我校在注重研产互动、为国家建设服务的同时，更注重高等学府的育人功能。燕大以其卓越的科研实力和优质的教学质量雄起于百舸争流的高校之林。
                        我校拥有雄厚的师资力量。我校有中国科学院院士1人，“长江学者奖励计划”特聘教授8人，“新世纪百千万人才工程”国家级人选13人，国家突出贡献专家5人，全国模范教师3人，全国优秀教师4人，国家杰出青年基金获得者9人，历年享受国务院政府特殊津贴的专家100人，省部级有突出贡献中青年专家34人。我校现有教授414人，占教师总数的25.3%，副教授587人，占35.9%，具有博士学位的专任教师占55%，教师职称结构和学历结构日趋合理。</p>
                </div>
                <!-- List group -->
            </div>
            <div class=" panel panel-primary" style="margin-top:20px">
                <div class="panel-heading">教师风采</div>
            </div>
            <div class="row info-list-item" >
                <div class="container">
                    <div class="media media">
                        <div class="media-left">
                            <a href="#">
                                <img class="media-object img-circle" src="<%=basePath%>img/1.jpg" alt="...">
                            </a>
                        </div>
                        <div class="media-body">
                            <h4 class="media-heading"><a href="#">何炅 <span class="badge">简介</span></a>
                            </h4>
                            研究方向：关系数据库，面向对象数据库，分布式数据库，空间数据库，半结构化数据及XML，数字图书馆，基于Web服务的数据库新技术网格等。多年来，先后参加完成国家自然科学基金项目2项，国家“863”项目1项，黑龙江省自然科学基金项目2项，河北省自然科学基金项目1项，横向课题多项。成果已经在国际著名杂志《The Journal of Three Dimensional Images》，国际会议ISCA，TOOLS等发表论文6篇，国内一级学术杂志《计算机学报》、《软件学报》、《计算机研究与发展》等发表论文二十多篇。发表论文总计约50篇，其中近10篇次被EI、ISTP收录。主审《关系数据库数据理论新进展》专著，出版《信息建模与关系数据库——从概念分析到逻辑设计》、《数据库数据处理》译著。研究成果获得黑龙江省科技进步二、三等奖各一项，黑龙江省教育委员会科技进步一、二等奖各一项。
                        </div>
                    </div>
                </div>
            </div>
            <div class="row info-list-item">
                <div class="container">
                    <div class="media media">
                        <div class="media-left">
                            <a href="#">
                                <img class="media-object img-circle" src="<%=basePath%>img/1.jpg" alt="...">
                            </a>
                        </div>
                        <div class="media-body">
                            <h4 class="media-heading"><a href="#">何炅 <span class="badge">简介</span></a>
                            </h4>
                            研究方向：关系数据库，面向对象数据库，分布式数据库，空间数据库，半结构化数据及XML，数字图书馆，基于Web服务的数据库新技术网格等。多年来，先后参加完成国家自然科学基金项目2项，国家“863”项目1项，黑龙江省自然科学基金项目2项，河北省自然科学基金项目1项，横向课题多项。成果已经在国际著名杂志《The Journal of Three Dimensional Images》，国际会议ISCA，TOOLS等发表论文6篇，国内一级学术杂志《计算机学报》、《软件学报》、《计算机研究与发展》等发表论文二十多篇。发表论文总计约50篇，其中近10篇次被EI、ISTP收录。主审《关系数据库数据理论新进展》专著，出版《信息建模与关系数据库——从概念分析到逻辑设计》、《数据库数据处理》译著。研究成果获得黑龙江省科技进步二、三等奖各一项，黑龙江省教育委员会科技进步一、二等奖各一项。
                        </div>
                    </div>
                </div>
            </div>
            <div class="row info-list-item" >
                <div class="container ">
                    <div class="media media">
                        <div class="media-left">
                            <a href="#">
                                <img class="media-object img-circle" src="<%=basePath%>img/1.jpg" alt="...">
                            </a>
                        </div>
                        <div class="media-body">
                            <h4 class="media-heading"><a href="#">何炅 <span class="badge">简介</span></a>
                            </h4>
                            研究方向：关系数据库，面向对象数据库，分布式数据库，空间数据库，半结构化数据及XML，数字图书馆，基于Web服务的数据库新技术网格等。多年来，先后参加完成国家自然科学基金项目2项，国家“863”项目1项，黑龙江省自然科学基金项目2项，河北省自然科学基金项目1项，横向课题多项。成果已经在国际著名杂志《The Journal of Three Dimensional Images》，国际会议ISCA，TOOLS等发表论文6篇，国内一级学术杂志《计算机学报》、《软件学报》、《计算机研究与发展》等发表论文二十多篇。发表论文总计约50篇，其中近10篇次被EI、ISTP收录。主审《关系数据库数据理论新进展》专著，出版《信息建模与关系数据库——从概念分析到逻辑设计》、《数据库数据处理》译著。研究成果获得黑龙江省科技进步二、三等奖各一项，黑龙江省教育委员会科技进步一、二等奖各一项。
                        </div>
                    </div>
                </div>
            </div>



        </div>
    </div>
</div>
<div class="jumbotron text-center" style="margin-bottom:0;z-index: 20;width: 100%">
    <footer>
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>© 2016 Company, Inc. · <a href="#">Privacy</a> · <a href="#">Terms</a></p>

    </footer>
</div>
<script type="text/javascript" src="<%=basePath%>js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/global.js"></script>
</body>
</html>
