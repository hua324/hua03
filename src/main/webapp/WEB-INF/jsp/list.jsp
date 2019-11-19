<%--
  Created by IntelliJ IDEA.
  User: hua
  Date: 2019/9/27
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html >
<head >
    <title >最课程</title >
</head >
<body >
<c:forEach items="${requestScope.list}" var="user">
    用户年龄：${user.age}&nbsp;&nbsp;
    用户名：${user.name}<br />
</c:forEach>
</body >
</html >
