<%--
  Created by IntelliJ IDEA.
  User: ziheng
  Date: 2017/8/11
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page  isELIgnored="false"%>
<html>
<head>
    <title>update</title>
</head>
<style type="text/css">
    .tabSub{
        float: right;
    }
    #contends>input{
        width:300px; ;height:25px;
    }
</style>
<script src="resource/JS/logic.js">

</script>
<body>
<form action="http://www.zziheng.xin/weChatRobot/updateServlets?action=redo&ids=${ids}" method="post" id="updateForms">
    <div style="width:350px;">
        <c:forEach  items="${updateList}" var="upList" >
            <div style="border:1px seagreen dashed">
            <div>指令:   <input type="text" name="command" value="${upList.name}"></div>
            <div>描述:   <input type="text" name="description"value="${upList.description}"></div>
            <input type="submit" value="修改">
            </div>
            <div>已有内容:&nbsp;</div>
        <div style="border:1px seagreen dashed">
            <c:forEach items="${upList.contendlist}" var="contends">
                <li>
                    <c:out value="${contends.contend}"></c:out>
                    <a href="http://www.zziheng.xin/weChatRobot/updateServlets?contend_id=${contends.id}&action=deleteOne">删除</a>
                </li>
            </c:forEach>
        </div>
        </c:forEach>
    </div>
    <br>
    <div style="border:1px seagreen dashed;width:350px;">
        <div>
            新增:
            <span><input  style="float: right" type="button" value="-" onclick="btnDown()"></span>
            <span><input  style="float: right" type="button" value="+" onclick="btn()"></span>
        </div>
        <div  id="contends">

        </div>
    </div>
    <div><button type="button" onclick="updatecontent('${ids}')">提交添加</button> </div>
</form>
</body>
</html>
