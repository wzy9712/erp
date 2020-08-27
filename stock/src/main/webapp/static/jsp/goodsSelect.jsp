<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+
            request.getServerName()+":"+
            request.getServerPort()+
            request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
    <script type="text/javascript" src="static/js/jquery-3.5.1.js"></script>
    <script type="text/javascript">
        $(function(){
            loadGoodsData();
            $("#btnLoader").click(function () {
                loadGoodsData();
            })
        })
        function loadGoodsData() {
            $.ajax({
                url:"goods/goodsSelect.do",
                type:"get",
                datasource:"json",
                success:function (data) {
                    $("#info").html("");
                    $.each(data,function (i,n) {
                        $("#info").append("<tr>")
                            .append("<td>"+n.uid+"</td>")
                            .append("<td>"+n.name+"</td>")
                            .append("<td>"+n.begin+"</td>")
                            .append("<td>"+n.input+"</td>")
                            .append("<td>"+n.output+"</td>")
                            .append("<td>"+n.nums+"</td>")
                            .append("</tr>")
                    })
                }
            })
        }
    </script>
</head>
<body>
<div align="center">
    <table align="center">
        <thead>
        <tr>
            <td>物料编号</td>
            <td>物料名称</td>
            <td>期初数量</td>
            <td>入库数量</td>
            <td>出库数量</td>
            <td>期末数量</td>
        </tr>
        </thead>
        <tbody id="info">

        </tbody>
        <input type="button" id="btnLoader" value="查询数据"/>
    </table>
</div>
</body>
</html>
