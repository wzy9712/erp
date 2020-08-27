<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+
            request.getServerName()+":"+
            request.getServerPort()+
            request.getContextPath()+"/";
%>
<html>
    <head>
        <base href="<%=basePath%>"/>
        <title>Title</title>
    </head>
    <body style="background-color:green">
        <center>
            <font style="color:red;font-size:40px">erp系统管理</font>
        </center>
    </body>
</html>