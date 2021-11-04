<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/11/3
  Time: 23:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/hello" method="post">
    <label>
        <input type="text" name="name">
        <input type="submit">
    </label>
</form>
</body>
</html>
