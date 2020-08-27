<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+
            request.getServerName()+":"+
            request.getServerPort()+
            request.getContextPath()+"/";
%>
<html>
<head>
    <title>erp库存系统</title>
    <base href="<%=basePath%>"/>
</head>
<frameset rows="15%,85%">
    <frame name="top" src="../../static/jsp/top.jsp"/>
    <frameset cols="15%,85%">
        <frame name="left" src="../../static/jsp/left.jsp"/>
        <frame name="right"/>
    </frameset>
</frameset>
</html>