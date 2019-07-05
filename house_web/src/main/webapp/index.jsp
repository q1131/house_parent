<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/3
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="2">
    <tr>
        <td>编号</td><td>名称</td>
    </tr>
    <c:forEach items="${list}" var="d">
        <tr>
            <td>${d.id}</td><td>${d.name}</td>
            <td><a href="/delDistrict?id=${d.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
