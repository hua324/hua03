<%--
  Created by IntelliJ IDEA.
  User: hua
  Date: 2019/9/27
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
欢迎来到最课程！ ${requestScope.person.user.name}:${requestScope.person.user.age}
</body>
</html>
