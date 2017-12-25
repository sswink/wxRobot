<%--
  Created by IntelliJ IDEA.
  User: ziheng
  Date: 2017/8/11
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>insert</title>
</head>
<style type="text/css">
    .tabSub{
        float: right;
    }
    #contends>input{
        width:300px; ;height:25px;
    }
</style>





<body>
<form action="#" method="post" id="insertForms">
    <div style="width:300px;">
        <div>指令:   <input type="text" id="command" value=""></div>
        <div>描述:   <input type="text" id="description" value=""></div>
        <div>内容:&nbsp;<input  style="float: right" type="button" value="+" id="btns" onclick="btn()"></div>
        <div id="contends">
            <input type="text" name="contenti" value=""size="35">
        </div>
        <div><button type="button" onclick="sumsf()">提交</button></div>
    </div>


</form>
<%--<script type="text/javascript" src="https://cdn.bootcss.com/jquery/2.2.4/jquery.min.js"></script>--%>

<script src="resource/JS/logic.js"></script>
</body>
</html>
