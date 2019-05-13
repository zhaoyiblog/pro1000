<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: zy
  Date: 2019-02-28
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="overflow:auto;">

    <div class="modal-dialog"  >
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true" onclick="closeModal()">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    添加教师绩效

                </h4>
            </div>
            <div class="modal-body">
                <form action="<%=basePath%>/checking/checkAdd" method="POST" role="form" >
                    <input type="hidden" value="" id="rid" name="sid">
                    <div class="form-group">
                        <label for="name">姓名</label>
                        <input type="text" disabled class="form-control" id="name"  name="name" placeholder="">
                        <%--<img src="" id="proflie" alt="" style="width: 100px;height: 100px">--%>
                    </div>

                    <div class="form-group">
                    <label for="year">年份</label>
                    <input type="text" class="form-control" id="year" name="year" placeholder="2018">
                </div>
                    <div class="form-group">
                        <label for="month">月份</label>
                        <input type="text" class="form-control" id="month" name="month" placeholder="2">
                    </div>

                    <div class="form-group">
                        <label for="on_time">出勤次数</label>
                        <input type="text" class="form-control" id="on_time" name="on_time" placeholder="21">
                    </div>





                    <input type="submit" class="btn btn-primary">
                </form>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal" onclick="closeModal()">关闭
                </button>
                <%--<button type="button" class="btn btn-primary">--%>
                    <%--提交更改--%>
                <%--</button>--%>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->

</div>
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
                <li><a href="#">档案管理</a></li>
                <li><a href="#">添加档案</a></li>
            </ul>
            <form action="" method="POST" class="form-inline" role="form">

                <div class="form-group">
                    <label for="sname">姓名</label>
                    <input type="text" class="form-control" id="sname" name="name" placeholder="请输入姓名">
                </div>
                <button type="button" class="btn btn-default" id="btn_sel">查找</button>
                <span style="color: #f32b26;height: 30px;width: 100px;">
                        <c:out value="${message}"></c:out>
                    </span>
            </form>
            <table class="table table-hover table-bordered table-responsive dataintable">
                <thead>
                <tr>
                    <th>序号</th>
                    <th>姓名</th>
                    <th>国家</th>
                    <th>性别</th>
                    <th>政治面貌</th>
                    <th>职称</th>
                    <th>教育</th>
                    <th>学位</th>
                    <th>毕业院校</th>
                    <th>学位院校</th>
                    <th>职位</th>
                    <th>部门</th>
                    <th>电话</th>
                    <th>..</th>
                </tr>
                </thead>
                <%--<tbody>--%>
                <%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<td></td>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
                <%--</tbody>--%>
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
<script type="text/javascript" src="<%=basePath%>js/global.js"></script>

<script>
    $(document).ready(function () {
        $("#btn_sel").click(function () {
            $("tbody").remove();
            var name=$("#sname").val();
            // alert(name);
            $.post("<%=basePath%>/record/recordselByname",
                {
                    name:name
                },
                function (data,status) {

                    $("#count").text(data.length);
                    // alert(data.length);
                    // $(".dataintable").html(" <thead><tr>\n" +
                    //     "                        <th>序号</th>\n" +
                    //     "                        <th>姓名</th>\n" +
                    //     "                        <th>国家</th>\n" +
                    //     "                        <th>性别</th>\n" +
                    //     "                        <th>政治面貌</th>\n" +
                    //     "                        <th>职称</th>\n" +
                    //     "                        <th>教育</th>\n" +
                    //     "                        <th>学位</th>\n" +
                    //     "                        <th>毕业院校</th>\n" +
                    //     "                        <th>学位院校</th>\n" +
                    //     "                        <th>职位</th>\n" +
                    //     "                        <th>部门</th>\n" +
                    //     "                        <th>电话</th>\n" +
                    //
                    //     "                        <th>33</th>\n" +
                    //     "                    </tr></thead>");
                    $(".dataintable").append("<tbody>");
                    $.each(data,function (i,item) {
                        var s="<tr><td>"+i+"</td><td>"+
                            item.name+"</td><td>"+
                            item.nation+"</td><td>"+
                            item.sex+"</td><td>"+
                            item.politics_status+"</td><td>"+
                            item.profession_title+"</td><td>"+
                            item.education+"</td><td>"+
                            item.degree+"</td><td>"+
                            item.education_school+"</td><td>"+
                            item.degree_school+"</td><td>"+
                            item.position+"</td><td>"+
                            item.department+"</td><td>"+
                            item.phone+"</td><td>"+
                            "<button class='openDiag' onclick='openModal("+item.id+",\""+item.name+"\")'>"+
                            "添加考勤"+"</button></td></tr>";
                        $(".dataintable").append(s);

                    });
                    $(".dataintable").append("</tbody>");
                }
            );
        });
    });

</script>
<script>
   function openModal( id,pic) {
       $("#rid").val(id);
       $("#name").val(pic);
       $("#myModal").modal("show");
      <%--$.post("<%=basePath%>/performance/performanceAdd",--%>
          <%--{--%>
              <%--"id": id--%>
          <%--},--%>
          <%--function (data,status) {--%>
            <%--alert("添加成功");--%>
          <%--}--%>
      <%--);--%>
   }

   function closeModal() {
       $("#myModal").modal("hide");
   }
</script>
</body>
</html>