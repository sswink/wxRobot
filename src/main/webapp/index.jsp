<%@page  isELIgnored="false"%>
<%@ page import="dao.MessageDao"%>
<%@ page import="bean.Message" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible"content="IE=9; IE=8; IE=7; IE=EDGE" />
    <title>自动回复后台管理</title>
    <link href="resource/css/all.css" rel="stylesheet" type="text/css" />
    <script src="resource/JS/logic.js"></script>
    <%--<script>
        function deletes(id) {
            if (confirm("确认删除吗？")) {
                mainForm.action = "/deleteone?id="+id;
                mainForm.submit();
            }
        }
    </script>--%>
</head>
<body style="background: #e1e9eb;">
<form action="http://www.zziheng.xin/weChatRobot/winServlets" id="mainForm" method="post">
    <div class="right">
        <div class="current">当前位置：<a href="talk.jsp" style="color:#6E6E6E;">公众号自动回复</a> &gt; 后台管理列表</div>
        <div class="rightCont">
            <p class="g_title fix">后台管理列表 <a class="btn03" href="javascript:openWin()">新 增</a>&nbsp;&nbsp;&nbsp;&nbsp;<a class="btn03" href="javascript:deletebath('deleteBatch')">删 除</a></p>
            <table class="tab1">
                <tbody>
                <tr>
                    <td width="90" align="right">指令：</td>
                    <td>
                        <input id="co" type="text" class="allInput" value="<c:out value="${command}"/>" name="command"/>
                    </td>
                    <td width="90" align="right">信息：</td>
                    <td>
                        <input id="des" type="text" class="allInput" value="<c:out value="${description}"/>" name="description"/>
                    </td>
                    <td width="85" align="right"><input type="submit" class="tabSub" value="查 询"/></td>
                </tr>
                </tbody>
            </table>
            <div class="zixun fix">
                <table class="tab2" width="100%">
                    <tbody>
                    <tr>
                        <th><input type="checkbox" id="all"/></th>
                        <th>序号</th>
                        <th>指令</th>
                        <th>信息</th>
                        <th>操作</th>
                    </tr>

                    <c:forEach items="${CommandList}" var="Command" varStatus="status">
                    <tr>
                        <td><input  name="iid" type="checkbox" value="${Command.id}"/></td>
                        <td>${status.count}</td>
                        <td>${Command.name}</td>
                        <td>${Command.description}</td>
                        <td>
                            <a href="javascript:openWin3('${Command.id}')">修改</a>&nbsp;&nbsp;&nbsp;
                            <a href="javascript:deletes('${Command.id}','deleteone')">删除</a>
                            <%--<a href="/deleteone?id=${message.id}">删除</a>--%>

                        </td>
                    </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <div class='page fix'>
                    共 <b>4</b> 条
                    <a href='###' class='first'>首页</a>
                    <a href='###' class='pre'>上一页</a>
                    当前第<span>1/1</span>页
                    <a href='###' class='next'>下一页</a>
                    <a href='###' class='last'>末页</a>
                    跳至&nbsp;<input type='text' value='1' class='allInput w28' />&nbsp;页&nbsp;
                    <a href='###' class='go'>GO</a>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>