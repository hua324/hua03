<%--
  Created by IntelliJ IDEA.
  User: hua
  Date: 2019/9/27
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html >
<head >
    <title >最课程</title >

</head >
<body >
<div id="responseDiv">
</div>
<button type="button" id="btn" >点击我</button>
<script type="application/javascript">
    $("#btn").click(function () {
        $.ajax({
            url : "request.do",
            data : '{"name":"baobao","age":1}',//注意JSON字符串格式
            dataType : "json",
            type : "post",
            contentType : "application/json; charset=utf-8",//此处必须加上
            success : function(data) {
                console.log(data);
            }
        });
    })
</script>
</body >
</html >