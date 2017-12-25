<%@ page import="java.util.Date" %>
<%@ page import="java.util.logging.SimpleFormatter" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>公众号自动回复</title>
	<!--讨论区滚动条begin-->
	<link rel="stylesheet" type="text/css" href="resource/css/jscrollpane1.css" />
        <script src="https://cdn.bootcss.com/jquery/2.2.4/jquery.min.js"></script>

	<!-- the mousewheel plugin -->
		<script  src="resource/JS/scroll-startstop.events.jquery.js"></script>
	<script  src="resource/JS/mousewheel.js"></script>
	<!-- the jScrollPane script -->
	<script src="resource/JS/jquery.jscrollpane.min.js"></script>

	<!--讨论区滚动条end-->
	<script  src="resource/JS/talk.js"></script>
	</head>
	<body>
	<%
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	%>
		<input type="hidden" value="<%= basePath %>" id="basePath"/>
		<br/>
		<div class="talk">
			<div class="talk_title"><span>正在与公众号对话</span></div>
			<div class="talk_record">
				<div id="jp-container" class="jp-container">
					<%--<div class="talk_recordbox">
						<div class="user"><img src="resource/images/thumbs/talk_recordbox.jpg"> </div>
						<div class="talk_recordtextbg">&nbsp;</div>
						<div class="talk_recordtext">
							<h3>你好,回复[查看]收取更多内容，回复[帮助] 获取指令和内容</h3>
							<span class="talk_time"><%=s.format(new Date())%></span>
						</div>

					</div>--%>
				</div>
			</div>
			
			<div class="talk_word">
				&nbsp;
				<input class="add_face" id="facial" type="button" title="添加表情" value="" />
				<input id="content" class="messages emotion"   />
				<input class="talk_send" onclick="send();" type="button" title="发送" value="发送" />
			</div>
		</div>
		<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';"></div>
	</body>
</html>