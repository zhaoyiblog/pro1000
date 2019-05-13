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
    <script src="<%=basePath%>js/jquery-3.3.1.min.js"></script>
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
        <a href="">查看职工信息</a>
        <a href="">修改职工信息</a>
        <a href="">删除职工信息</a>
    </div>
    <div id="table" style="margin-left: 30px;width: 900px; margin-top: 0px;float: left;border: 1px solid black;height: 800px;overflow: scroll;">
        <div id="location" style="border-bottom: 1px solid black">
            <p>当前位置：系统>档案更新</p>
        </div>
        <div id="record">
            <div style="display: inline;">
                <p style="display: inline">姓名</p>
                <input type="text" name="name" placeholder="输入姓名以查找" id="sname">
            </div>
            <div style="display: inline;width: 70px;">

                <input type="submit" id="btn_sel" value="查找">
            </div>

            <div style="color: #f32b26;height: 30px;width: 200px;">
                <span>当前总共找到</span>
                <span id="count" style="height: 20px;width: 20px;margin: 0px 0px;"></span>
                <span>条信息</span>
            </div>
            <div class="tableinfo" style="height: 100%;padding-top: 20px;overflow: scroll;border-top: 1px solid #e6e6e6">
                <table class="dataintable">
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
                        <th>编制</th>
                        <th>身份证号</th>
                        <th>民族</th>
                        <th>出生日期</th>
                        <th>地址</th>
                        <th>是否结婚</th>
                        <th>主修</th>
                        <th>工作实践</th>
                        <th>教育经历</th>

                    </tr>


                </table>
            </div>
        </div>
        </div>

</div>



<div id="footer" style="background-color:#13599f;text-align:center;position: relative;bottom: 0px;width: 100%">
    版权 © cctv.com</div>
<script>
    $(document).ready(function () {
        $("#btn_sel").click(function () {
            var name=$("#sname").val();
            $.post("<%=basePath%>/record/recordselByname",
                {
                    name:name
                },
                function (data,status) {
                    $("#count").text(data.length);
                    $(".dataintable").html(" <tr>\n" +
                        "                        <th>序号</th>\n" +
                        "                        <th>姓名</th>\n" +
                        "                        <th>国家</th>\n" +
                        "                        <th>性别</th>\n" +
                        "                        <th>政治面貌</th>\n" +
                        "                        <th>职称</th>\n" +
                        "                        <th>教育</th>\n" +
                        "                        <th>学位</th>\n" +
                        "                        <th>毕业院校</th>\n" +
                        "                        <th>学位院校</th>\n" +
                        "                        <th>职位</th>\n" +
                        "                        <th>部门</th>\n" +
                        "                        <th>电话</th>\n" +
                        "                        <th>编制</th>\n" +
                        "                        <th>身份证号</th>\n" +
                        "                        <th>民族</th>\n" +
                        "                        <th>出生日期</th>\n" +
                        "                        <th>地址</th>\n" +
                        "                        <th>是否结婚</th>\n" +
                        "                        <th>主修</th>\n" +
                        "                        <th>工作实践</th>\n" +
                        "                        <th>教育经历</th>\n" +
                        "\n" +
                        "\n" +
                        "                    </tr>");
                    var s="";
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
                                item.is_authorized+"</td><td>"+
                                item.id_number+"</td><td>"+
                                item.nationality+"</td><td>"+
                                item.birth+"</td><td>"+
                                item.address+"</td><td>"+
                                item.married+"</td><td>"+
                                item.major+"</td><td>"+
                                item.towork+"</td><td>"+
                                item.educationexp+"</td></tr>";
                        console.log(s);
                        $(".dataintable").append(s);
                    })
                    // $.each( data,function (i,item) {
                    //     var s="<tr><td>"+i+"</td><td>"+
                    //         item.name+"</td><td>"+
                    //         item.nation+"</td><td>"+
                    //         item.sex+"</td><td>"+
                    //         item.politics_status+"</td><td>"+
                    //         item.profession_title+"</td><td>"+
                    //         item.education+"</td><td>"+
                    //         item.degree+"</td><td>"+
                    //         item.education_school+"</td><td>"+
                    //         item.degree_school+"</td><td>"+
                    //         item.position+"</td><td>"+
                    //         item.department+"</td><td>"+
                    //         item.phone+"</td><td>"+
                    //         item.is_authorized+"</td></tr>";
                    //
                    // });
                    //

                }
            );
        });
    });

</script>
</body>
</html>