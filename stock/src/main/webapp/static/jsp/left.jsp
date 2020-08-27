<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+
            request.getServerName()+":"+
            request.getServerPort()+
            request.getContextPath()+"/";
%>
<html >
<head>
    <title>erp系统</title>
    <base href="<%=basePath%>"/>
</head>
<body>
<h1><%=basePath%></h1>
    <ul>
        <li>库存信息管理
            <ol>
                <li><a href="static/jsp/goodsAdd.jsp" target="right">入库操作</a></li>
                <li><a href="static/jsp/goodsReduce.jsp" target="right">出库操作</a></li>
                <li><a href="static/jsp/goodsSelect.jsp" target="right">查询库存</a></li>
            </ol>
        </li>
    </ul>
</body>
</html>