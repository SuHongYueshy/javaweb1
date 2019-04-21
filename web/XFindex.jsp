<%--
  Created by IntelliJ IDEA.
  User: shy
  Date: 2019/4/16
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>科大讯飞</title>
    <style>
        .container{
            position: absolute;
            width: 100%;
            height: 648px;
            background-color: rgb(54,65,80);
            text-align:center;
            left: 0px;
            top: 0px;
        }
        .form-group{
            position: relative;
            left: 29%;
            bottom: -70px;
            overflow:hidden;
            background-color: rgb(236,238,241);
            text-align:center;
            width:575px;
            height:430px
        }
        .main{
            text-align:center;/*文本居中*/
            position: relative;
        }
        form input{
            width: 490px;
            height: 50px;
            background-color: rgb(221,227,236);

            margin-top:10px;
            padding:10px;
            font-size:18px;
            font-weight:300;
        }

        .box {
            width: 514px;
            height: 60px;
            text-align: left;
            display:inline-block;
            line-height:60px;
            vertical-align: middle;
        }

    </style>

    <!--<script>
        function denglu() {
            var useid = document.getElementById("useid").value;
            var pw = document.getElementById("pw").value;

            if(useid == null || useid == "" && pw == null || pw == "") {
                alert("必填项有空值，请输入正确的值");
            } else {
                alert("登录成功！")
            }
        }
    </script>-->

</head>
<body>
<div class="container">
    <h1 class="text-center"style="color: white">科大讯飞教育设备报修平台</h1><br>

    <div class="form-group">
        <h1 style="color: rgb(77,179,165)">用户登录</h1>
        <p class="main">
        <form action="/servlet/index_Servlet" method="post">
            <span>${error}</span>
            <input type="text" id="useid" name="useid" placeholder="用户名"/><br>
            <input type="password" id="pw" name="pw" placeholder="密码"><br>
            <div class="box">

                <input  type="submit" style="background-color: rgb(77,179,165);height:60px;width:140px;" onclick="denglu" value="确认登录" />
                <input type="checkbox" style="width:18px;height:18px;vertical-align: middle;margin-bottom: 6px;"/>记住我
                <a href="#" align="right" style="float: right;">忘记密码？</a>

            </div>

        </form>
    </div>
</div>
</div>
</body>
</html>