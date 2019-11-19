<%--
  Created by IntelliJ IDEA.
  User: hua
  Date: 2019/9/27
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html >
<head >
    <title >最课程</title >
</head >
<body >
最课程学员编号：<br />
<c:forEach items="${requestScope.ids}" var="id">
    ${id}<br />
</c:forEach>
</body >
</html >
