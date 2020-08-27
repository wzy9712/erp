<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+
    request.getServerName()+":"+
    request.getServerPort()+
    request.getContextPath()+"/";
%>
<html>
<head>
    <title>用户登录界面</title>
    <base href="<%=basePath%>"/>
    <script type="text/javascript">
        function login() {
            document.forms[0].action = "user/userSelect.do";
            document.forms[0].submit();
        }
        function registe() {
            document.forms[0].action = "user/userAdd.do";
            document.forms[0].submit();
        }
    </script>
</head>
<body>
    <form >
        用户名<input type="text" name="count"/><br>
        密码<input type="text" name="password"/><br>
        <input type="button" onclick="login()" value="登录"/>
        <input type="button" onclick="registe()" value="注册"/>
    </form>
</body>
</html>