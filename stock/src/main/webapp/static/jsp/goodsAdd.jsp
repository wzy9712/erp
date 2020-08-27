<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+
            request.getServerName()+":"+
            request.getServerPort()+
            request.getContextPath()+"/";
%>
<html>
<head>
    <title>入库表</title>
    <base href="<%=basePath%>"/>
</head>
<body>
<div align="center">
   <form action="goods/goodsAdd.do">
       物料编码：<input type="text" name="uid"/><br>
       物料名称<input type="text" name="name"/><br>
       入库数量<input type="text" name="nums"/><br>
       <input type="submit" value="提交"/>
       <input type="reset" value="重置"/>
   </form>
</div>
</body>
</html>
